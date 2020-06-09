package com.example.mvvmsampleappwithkotlin.ui.auth

interface AuthListnener {
    fun onStarted()

    fun onSuccess()

    fun onFailure(message: String)
}