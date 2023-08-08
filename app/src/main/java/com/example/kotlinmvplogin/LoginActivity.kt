package com.example.kotlinmvplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinmvplogin.Presenter.LoginPresenter
import com.example.kotlinmvplogin.View.ILoginView
import com.example.kotlinmvplogin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() , ILoginView {
    private lateinit var binding: ActivityLoginBinding
    internal lateinit var loginPresenter: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init
        loginPresenter = LoginPresenter(this)

        //event
        binding.btnLogin.setOnClickListener {
            loginPresenter.onLogin(binding.etUsername.text.toString(), binding.etPassword.text.toString())
        }
    }

    override fun onLoginResult(message: String) {
        println("login result$message")
    }



}