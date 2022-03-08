package com.example.necoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.necoapp.Constantce.Constance
import com.example.necoapp.databinding.ActivityInUpBinding


class SignInUpActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityInUpBinding

    private var signState:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!! // !! - означает что не будет null

        if (signState == Constance.SIGN_IN_STATE) {
            bindingClass.edName1.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.avatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View) {
        if (signState == Constance.SIGN_IN_STATE) {

        }
    }
    fun onClickAvatar (view: View) {
        bindingClass.imAva.visibility = View.VISIBLE

    }

}