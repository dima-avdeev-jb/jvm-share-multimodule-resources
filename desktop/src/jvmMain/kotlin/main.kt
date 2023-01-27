import androidx.compose.material.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    val resourceValue = remember {
        javaClass.classLoader?.getResource("resource.txt")?.readText() ?: "missing resource"
    }
    Window(onCloseRequest = ::exitApplication) {
        Text(resourceValue)
    }
}

