package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Application On Start", Toast.LENGTH_SHORT).show();

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Application On Stop", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Application On Restart", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Application On Resume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Application On Pause", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Application On Destroy", Toast.LENGTH_SHORT).show();
    }
}