package com.b12game.androidlocalizition

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.*

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initViews()

        val one = resources.getQuantityString(R.plurals.my_cats, 1, 1)
        val few = resources.getQuantityString(R.plurals.my_cats, 6, 3)
        val many = resources.getQuantityString(R.plurals.my_cats, 5, 10)

        Log.d("@@@one", one)
        Log.d("@@@few", few)
        Log.d("@@@many", many)
    }

    private fun initViews() {
        var b_english = findViewById<Button>(R.id.b_english)
        var b_russian = findViewById<Button>(R.id.b_russian)
        var b_uzbek = findViewById<Button>(R.id.b_uzbek)

        b_english.setOnClickListener {
            setLocate("en")
        }

        b_russian.setOnClickListener {
            setLocate("ru")
        }

        b_uzbek.setOnClickListener {
            setLocate("uz")
        }
    }

    fun setLocate(language: String) {
        var locate = Locale(language)
        Locale.setDefault(locate)
        var config = Configuration()
        config.locale = locate
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        finish()
    }
}