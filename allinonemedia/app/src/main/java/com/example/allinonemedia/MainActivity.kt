package com.example.allinonemedia

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondownload = findViewById<Button>(R.id.download)
        buttondownload.setOnClickListener {
            Toast.makeText(applicationContext, "downloading...", Toast.LENGTH_SHORT).show()
        }
    }
}
