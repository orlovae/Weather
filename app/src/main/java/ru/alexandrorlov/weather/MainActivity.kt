package ru.alexandrorlov.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import ru.alexandrorlov.weather.ui.main.ViewModel
import ru.alexandrorlov.weather.ui.theme.TestHammerSystemTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            val verticalScroll = rememberScrollState()
            TestHammerSystemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(verticalScroll),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting(
                        name = "Android",
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    viewModel: ViewModel
) {
    val uiState by viewModel.uiState.collectAsState()
    Row() {
        Text(text = "Hello $name!")
        Text(text = "mealState = ${uiState.mealState}")
    }


}