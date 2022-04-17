package com.example.applicationmvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationmvp.app.App
import com.example.applicationmvp.databinding.ActivityMainBinding
import com.example.applicationmvp.presenter.Presenter

class MainActivity : AppCompatActivity() , InterfaceUI {

    private var _binding: ActivityMainBinding? = null
    private val binding : ActivityMainBinding get() = _binding!!

    private val presenter : Presenter = App.instance.presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.attach(this)
        presenter.sendServer()
    }

    override fun setText(text : String){
        binding.textView.text = text
    }

    override fun setText2(text: String) {
        binding.textView.text = text
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}