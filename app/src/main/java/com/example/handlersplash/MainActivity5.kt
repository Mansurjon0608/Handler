package com.example.handlersplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity5 : AppCompatActivity() {

    lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar?.hide()

        handler = Handler()

        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 500)


    }
}