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
    var text = binding.editTextNumber.text.toString()
    fun btnNumberClick(view: View){
        if (newOp){
            binding.editTextNumber.setText("")
        }
        newOp=false
        var btnSelect = view as Button
        var btnClickValue = text

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
            binding.btncomma.id -> {
                btnClickValue+="," + btnClickValue
            }
            binding.btnplusminus.id ->
                btnClickValue="-"+btnClickValue
        }
        binding.editTextNumber.setText(btnClickValue)
    }
    var operator = "*"
    var lastNumber = ""
    var newOp = true

    fun btnOpClick(view: View){
        var btnSelect = view as Button
        when(btnSelect.id){
            binding.btnslash.id ->
                operator="/"
            binding.btnX.id ->
                operator="x"
            binding.btnpercent.id ->
                operator="%"
            binding.btnminus.id ->
                operator="-"
            binding.btnplus.id ->
                operator="+"
        }
        lastNumber = text
        newOp = true
    }
    fun btnEqualsClick(view: View){
        var newNum = text
        var resultNum:Double? = null
        when(operator){
            "/" ->
                resultNum = lastNumber.toDouble() / newNum.toDouble()
            "x" ->
                resultNum = lastNumber.toDouble() * newNum.toDouble()
            "-" ->
                resultNum = lastNumber.toDouble() - newNum.toDouble()
            "+" ->
                resultNum = lastNumber.toDouble() + newNum.toDouble()
        }
        binding.editTextNumber.setText(resultNum.toString())
        newOp=true
    }
    fun btnACClick(view: View){
        binding.editTextNumber.setText("0")
        newOp=true
    }
    fun btnPercentClick(view: View){
        var resultNum:Double = text.toDouble() / 100
        binding.editTextNumber.setText(resultNum.toString())
    }
    fun btnDelClick(view: View){
        var resultNum:Double = text.toDouble() / 10
        binding.editTextNumber.setText(resultNum.toString())
    }











}









