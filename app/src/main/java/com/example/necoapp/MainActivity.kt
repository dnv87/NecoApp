package com.example.necoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.necoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val a = 1023
    val b = 8

    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(bindingClass.root)

        /*bindingClass.btnSum.setOnClickListener {
            val result = a + b
            bindingClass.tView.text = "сумма равна $result"
        }
        bindingClass.btnDiff.setOnClickListener {
            val result = a - b
            bindingClass.tView.text = "разность равна $result"
        }
        bindingClass.btnMulti.setOnClickListener {
            val result = a * b
            bindingClass.tView.text = "произведение равно $result"
        }
        bindingClass.btnDiv.setOnClickListener {
            val result : Float = a.toFloat() / b.toFloat()
            bindingClass.tView.text = "деление равно $result"
        }*/

        if (bindingClass.tView.text == "0")

    }
}