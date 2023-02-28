package com.zmei.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.practice1.databinding.ActivityMainBinding
import constans.constans

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.button1.setOnClickListener {


    var userName = binding.editText1.text.toString()

    when(userName){

    constans.director -> {
        binding.textView.visibility = View.VISIBLE

        if (constans.directorParol == binding.editText2.text.toString()) {
            binding.imageView.visibility = View.VISIBLE
            binding.imageView.setImageResource(R.drawable.vadim)
            val currency = constans.directorCurency
            binding.textView.text = "Ваша зарплата ${currency} $"
        } else {
            binding.imageView.visibility = View.VISIBLE
            binding.textView.text = "неверный пароль"
            binding.imageView.setImageResource(R.drawable.stop)
        }
    }
    constans.dvornik -> {
            binding.textView.visibility = View.VISIBLE

            if (constans.dvornikParol == binding.editText2.text.toString()) {
                binding.imageView.visibility = View.VISIBLE
                binding.imageView.setImageResource(R.drawable.andrey)
                val currency = constans.dvornikCurency
                binding.textView.text = "Ваша зарплата ${currency} $"}
            else { binding.textView.text = "неверный пароль"
                binding.imageView.visibility = View.VISIBLE
                binding.imageView.setImageResource(R.drawable.stop)}
        }
    else -> {
        binding.textView.visibility = View.VISIBLE
        binding.imageView.setImageResource(R.drawable.stop)
        binding.textView.text = "Такого работника нет"
    }
    }
    }

    }


    }


