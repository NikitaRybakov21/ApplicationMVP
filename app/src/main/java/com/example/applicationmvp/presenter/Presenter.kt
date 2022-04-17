package com.example.applicationmvp.presenter

import com.example.applicationmvp.model.Model
import com.example.applicationmvp.retrofit.ResponseDateOneCall
import com.example.applicationmvp.retrofit.RetrofitImpl
import com.example.applicationmvp.ui.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(private val model : Model, private val retrofitImpl: RetrofitImpl) : InterfacePresenter {

}