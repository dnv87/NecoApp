package com.example.necoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.necoapp.Constantce.Constance
import com.example.necoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding
    private var login:String = ""
    private var password:String = ""
    private var name1:String = ""
    private var name2:String = ""
    private var name3:String = ""
    private var avatarImageId:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    //обработка результата из SignInUpActivity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            Constance.REQUEST_CODE_SIGN_IN -> {

            }
            Constance.REQUEST_CODE_SIGN_UP -> {

            }
        }

    }

    //функция отправления сообщения от главного окна -> дочернему с отслеживанием сообщения
    fun indentActivity(state:String, message:String, requestCode: Int){
        val indent =Intent(this,SignInUpActivity::class.java)
        indent.putExtra(state, message)
        startActivityForResult(intent, requestCode)
    }

    fun inClickSignIn(view: View){
        indentActivity(Constance.SIGN_STATE,Constance.SIGN_IN_STATE,Constance.REQUEST_CODE_SIGN_IN)

    }
    fun inClickSignUp(view: View){
        indentActivity(Constance.SIGN_STATE,Constance.SIGN_UP_STATE,Constance.REQUEST_CODE_SIGN_UP)
    }
}