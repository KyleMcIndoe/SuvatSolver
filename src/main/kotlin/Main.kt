import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
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
        Column (
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            TextField(
                value = sinput,
                onValueChange = {sinput = it},
                label = {Text("Displacement (m)")},
                maxLines = 1
            )

            TextField(
                value = uinput,
                onValueChange = {uinput = it},
                label = { Text("Initial velocity (m/s)")},
                maxLines = 1
            )

            TextField(
                value = vinput,
                onValueChange = {vinput = it},
                label = { Text("Final velocity (m/s")},
                maxLines = 1
            )

            TextField(
                value = ainput,
                onValueChange = {ainput = it},
                label = { Text("Acceleration (m/s^2)")},
                maxLines = 1
            )

            TextField(
                value = tinput,
                onValueChange = {tinput = it},
                label = { Text("Time (s)")},
                maxLines = 1
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Button(
                    onClick = {
                        val s: Double? = sinput.toDoubleOrNull();
                        val u: Double? = uinput.toDoubleOrNull();
                        val v: Double? = vinput.toDoubleOrNull();
                        val a: Double? = ainput.toDoubleOrNull();
                        val t: Double? = tinput.toDoubleOrNull();

                        val f = funcs();
                        var vals = f.findMissings(s, u, v, a, t);

                        sinput = vals[0].toBigDecimal().toPlainString();
                        uinput = vals[1].toBigDecimal().toPlainString();
                        vinput = vals[2].toBigDecimal().toPlainString();
                        ainput = vals[3].toBigDecimal().toPlainString();
                        tinput = vals[4].toBigDecimal().toPlainString();

                    },
                ) {
                    Text("Calculate")
                }

                Button(
                    onClick = {
                        sinput = "";
                        uinput = "";
                        vinput = "";
                        ainput = "";
                        tinput = "";
                    }
                ) {
                    Text("Reset")
                }
            }


        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(width = 300.dp, height = 575.dp),
        resizable = false,
        title = "Suvat Solver"
        ) {
        App()
    }
}
