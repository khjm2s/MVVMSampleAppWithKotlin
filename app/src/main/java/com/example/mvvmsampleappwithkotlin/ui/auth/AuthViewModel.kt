package com.example.mvvmsampleappwithkotlin.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

//코틀린에서는 " : " 를 통해 상속을 받는듯하다. 그리고 상속받는 클래스는 ()로 끝마치는듯?
class AuthViewModel : ViewModel() {

    //코틀린에서는 변수를 생성할때 수동으로 초기화해줘야합니다. 그래서 아래와같은 생김새가 됨
    //아래 변수는 이메일과 비밀번호를 가져오는데 활용
    var email: String? = null;
    var password: String? = null;

    var authListnener: AuthListnener? = null;


    //코틀린에서 함수는 아래와 같은 생김새이다, 인자는 변수가 앞에, 타입이 뒤로 빠진다
    fun onLoginButtonClick(view: View) {
        authListnener?.onStarted()
        //로그인이 실패
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) //변수가 널인지 여부 확인
        {
            authListnener?.onFailure("Invalid email or password")
            return
        }

        //로그인이 성공
        authListnener?.onSuccess()
    }
}
