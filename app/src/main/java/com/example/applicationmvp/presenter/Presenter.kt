package com.example.applicationmvp.presenter

import com.example.applicationmvp.model.Model
import com.example.applicationmvp.retrofit.ResponseDateOneCall
import com.example.applicationmvp.retrofit.RetrofitImpl
import com.example.applicationmvp.ui.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(private val model : Model, private val retrofitImpl: RetrofitImpl) : InterfacePresenter {
    private var activity : MainActivity? = null

    override fun sendServer() {
        val data = model.calc()

        retrofitImpl.getRetrofit().getOneCallAPI("0000","dsffdsafc","dascsfd").enqueue(callback)
        activity?.setText(data.toString())
    }

    private val callback = object : Callback<ResponseDateOneCall> {
        override fun onResponse(call: Call<ResponseDateOneCall>, response: Response<ResponseDateOneCall>) {
            activity?.setText2("babygan")
        }

        override fun onFailure(call: Call<ResponseDateOneCall>, t: Throwable) {
            activity?.setText2("not babygan")
        }
    }

    override fun attach(activity: MainActivity) {
        this.activity = activity
    }

    override fun detach() {
        this.activity = null
    }
}