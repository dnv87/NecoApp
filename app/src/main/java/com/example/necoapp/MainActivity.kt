package com.example.necoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var count : Boolean = true
    fun onClicketTst(view: View){
        val elTetx = findViewById<TextView>(R.id.textView)
        if (count) {
            elTetx.text = "Abra-kodabra!!!"
        }
        else {
            elTetx.text = "Shwabra-kodabra!!!!!!!!!!!!!!!!!!!!!"
        }
        count = !count
        Log.d("MyTst", "count = ${count.toString()}")
    }
}