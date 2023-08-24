package ru.alexandrorlov.weather.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import ru.alexandrorlov.weather.config.DataLocalConfig
import ru.alexandrorlov.weather.data.local.LocalDataBase
import ru.alexandrorlov.weather.data.local.RepositoryLocal
import ru.alexandrorlov.weather.data.remote.ApiService
import ru.alexandrorlov.weather.data.remote.DataSource
import ru.alexandrorlov.weather.data.remote.RetrofitModule
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit = RetrofitModule.instance()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideDataSource(apiService: ApiService): DataSource = DataSource(apiService)

    @Provides
    @Singleton
    fun provideLocalDataBase(@ApplicationContext context: Context): LocalDataBase {
        return Room.databaseBuilder(
            context,
            LocalDataBase::class.java,
            DataLocalConfig.DATABASE_NAME
        )
            .build()
    }

    @Provides
    @Singleton
    fun provideRepositoryLocal(dataBase: LocalDataBase): RepositoryLocal = RepositoryLocal(dataBase)
}