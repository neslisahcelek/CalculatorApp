package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun btnNumberClick(view: View){
        var btnSelect = view as Button
        var btnClickValue = binding.editTextNumber.text.toString()

        when(btnSelect.id){
            binding.btn0.id -> {
                btnClickValue+="0"
            }
            binding.btn1.id -> {
                btnClickValue+="1"
            }
            binding.btn2.id -> {
                btnClickValue+="2"
            }
            binding.btn3.id -> {
                btnClickValue+="3"
            }
            binding.btn4.id -> {
                btnClickValue+="4"
            }
            binding.btn5.id -> {
                btnClickValue+="5"
            }
            binding.btn6.id -> {
                btnClickValue+="6"
            }
            binding.btn7.id -> {
                btnClickValue+="7"
            }
            binding.btn8.id -> {
                btnClickValue+="8"
            }
            binding.btn9.id -> {
                btnClickValue+="9"
            }
            binding.btnminus.id -> {
                btnClickValue+="-" + btnClickValue
            }
            binding.btnplus.id -> {
                btnClickValue+="+" + btnClickValue
            }
        }
        binding.editTextNumber.setText(btnClickValue)
    }
}