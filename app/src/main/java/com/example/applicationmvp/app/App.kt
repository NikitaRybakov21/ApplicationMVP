package com.example.applicationmvp.app

import android.app.Application
import com.example.applicationmvp.model.Model
import com.example.applicationmvp.presenter.Presenter
import com.example.applicationmvp.retrofit.RetrofitImpl
import com.example.applicationmvp.ui.MainActivity

class App : Application() {

    lateinit var presenter : Presenter

    override fun onCreate() {
        super.onCreate()

        instance = this
        presenter = Presenter(Model(), RetrofitImpl())
    }

    companion object {
        lateinit var instance: App private set
    }
}