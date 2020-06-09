package com.example.mvvmsampleappwithkotlin.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsampleappwithkotlin.R
import com.example.mvvmsampleappwithkotlin.databinding.ActivityLoginBinding
import com.example.mvvmsampleappwithkotlin.util.toast

class LoginActivity : AppCompatActivity(), AuthListnener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //데이터바인딩고ㅓㅏ 역기위해서 기본 뷰셋 함수는 쓰지 않는다
//        setContentView(R.layout.activity_login)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel;
        viewModel.authListnener = this

        //이 샘플 튜토리얼에서는 양방향 데이터 바인딩을 사용하여, 불필요한 데이터 참조를 하지 않습니다.
        //데이터 바인딩은, 구글 데이터바인딩을 활용합니다.


    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }



    override fun onFailure(message: String) {
        toast(message)
    }
}