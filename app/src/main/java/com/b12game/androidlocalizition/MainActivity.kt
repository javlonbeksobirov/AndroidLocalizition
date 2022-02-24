package com.b12game.androidlocalizition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val b_home = findViewById<Button>(R.id.b_home)
        b_home.text = getString(R.string.app_name)
        b_home.setOnClickListener {
            callLanguageActivity()
        }
    }

    private fun callLanguageActivity() {
        var intent = Intent(this,LanguageActivity::class.java)
        startActivity(intent)
    }
}