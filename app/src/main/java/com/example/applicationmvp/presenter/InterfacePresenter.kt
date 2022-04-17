package com.example.applicationmvp.presenter

import com.example.applicationmvp.ui.MainActivity

interface InterfacePresenter {
    fun sendServer()
    fun attach(activity: MainActivity)
    fun detach()
}