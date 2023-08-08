package com.example.kotlinmvplogin.Presenter

import com.example.kotlinmvplogin.Model.User
import com.example.kotlinmvplogin.View.ILoginView
import java.io.Console

class LoginPresenter(internal var iLoginView:ILoginView) : ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess) {
            println("successful login")
        }
        else {
            println("unsuccessful")
        }
    }
}