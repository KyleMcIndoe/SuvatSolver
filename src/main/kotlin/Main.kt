import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.Label

@Composable
@Preview
fun App() {
    var sinput by remember { mutableStateOf("") }
    var uinput by remember { mutableStateOf("") }
    var vinput by remember { mutableStateOf("") }
    var ainput by remember { mutableStateOf("") }
    var tinput by remember { mutableStateOf("") }

    var l by remember { mutableStateOf("") }

    MaterialTheme {
        Column {
            TextField(
                value = sinput,
                onValueChange = {sinput = it},
                label = { Text(sinput)},
                maxLines = 1
            )

            TextField(
                value = sinput,
                onValueChange = {sinput = it},
                label = { Text(sinput)},
                maxLines = 1
            )
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
