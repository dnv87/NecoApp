package com.example.necoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.necoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn.setOnClickListener {
            val resultValue = bindingClass.inputTxt.text.toString()

            fun textResultOk(value:String){
                bindingClass.textResult.visibility = View.VISIBLE

                bindingClass.textResult.text = value
            }

            when (resultValue){
                Constance.DIRECTOR ->{
                    val tempText = "получите ваши ${Constance.DIRECTOR_ZP} руб."
                    textResultOk(tempText)
                }
                Constance.INGINER -> {
                    val tempText = "получите ваши ${Constance.INGINER_ZP} руб."
                    textResultOk(tempText)
                }
                Constance.MANAGER -> {
                    val tempText = "получите ваши ${Constance.MANAGER_ZP} руб."
                    textResultOk(tempText)
                }
                else -> {
                    textResultOk("Нет такого работника")
                }

            }

        }

    }
}