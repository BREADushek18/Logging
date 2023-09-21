package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;
import android.widget.Button
import android.widget.EditText
import timber.log.Timber



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val buttonLog = findViewById<Button>(R.id.button_log)
        val buttonTimber = findViewById<Button>(R.id.button_timber)

        Timber.plant(Timber.DebugTree())


        buttonLog.setOnClickListener {
            val text = editText.text.toString()
            Log.v("From EditText", text)
        }
        buttonTimber.setOnClickListener {
            val text = editText.text.toString()
            Timber.v(text)
        }


    }
}