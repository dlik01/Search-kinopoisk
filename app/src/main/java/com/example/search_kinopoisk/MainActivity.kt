package com.example.search_kinopoisk

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import layout.Test

class MainActivity : AppCompatActivity() {
    var press = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun1()
        val button :Button = findViewById(R.id.button)
        val text :TextView = findViewById(R.id.textView)
        val test :Test = Test("Dark background", "Light background")
        button.setOnClickListener {
            if(press){
                button.setText(R.string.disable)
                window.setBackgroundDrawableResource(R.color.black_800)
                fun1()
                text.text = test.title1
                text.setTextColor(R.color.white)

            }else{
                button.setText(R.string.enable)
                window.setBackgroundDrawableResource(R.color.white)
                text.text = test.title2
                text.setTextColor(R.color.black_800)
            }
            press = !press
        }
    }

    private fun fun1 (){
        for (i in 1..10){
            println("Hello Kotlin! $i")
        }
    }
}