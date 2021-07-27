package com.example.hellosample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hellosample.databinding.ActivityMainBinding

//viewBindingを使ってボタン処理をしてみた
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.hyoujiButton.setOnClickListener(this)
        binding.clearButton.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        val input = binding.tvPutName
        val output = binding.tvOutPutName

        when(v?.id){
            R.id.hyoujiButton -> {
                val inputStr = input.text.toString()
                output.text = inputStr + "さん、こんにちは！"
            }

            R.id.clearButton -> {
                input.setText("")
                output.text = ""
            }

        }


    }
}



