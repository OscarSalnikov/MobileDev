package com.example.lifecycledemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifecycleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifecycleDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        showToast("onCreate")
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        showToast("onRestart")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleDemoTheme {
        Greeting("Android")
    }
}
