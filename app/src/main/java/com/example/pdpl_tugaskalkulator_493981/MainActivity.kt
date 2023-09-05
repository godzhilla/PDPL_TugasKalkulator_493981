package com.example.pdpl_tugaskalkulator_493981

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.pdpl_tugaskalkulator_493981.databinding.ActivityMainBinding
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)}

    var angka1 = 0
    var angka2 = 0
    var operatornya = ""
    fun buttonNumber(view: View) {
        with(binding) {
            when ((view as Button).text.toString()) {
                "+" -> {
                    angka1 = input.text.toString().toInt()
                    operatornya = input.text.toString() + "+"
                    input.text = operatornya
                }

                "-" -> {
                    angka1 = input.text.toString().toInt()
                    operatornya = input.text.toString() + "-"
                    input.text = operatornya
                }

                "*" -> {
                    angka1 = input.text.toString().toInt()
                    operatornya = input.text.toString() + "*"
                    input.text = operatornya
                }

                "/" -> {
                    angka1 = input.text.toString().toInt()
                    operatornya = input.text.toString() + "/"
                    input.text = operatornya
                }

                "C" -> {
                    input.text = ""
                    operatornya= ""
                }

                "=" -> {
                    var teks = input.text.toString()
                    var angkaSementara = teks.replace(operatornya.toString(), "").trim()
                    angka2 = angkaSementara.toInt()

                    if ("+" in operatornya) {
                        input.text = (angka1 + angka2).toString()
                    } else if ("-" in operatornya){
                        input.text = (angka1 - angka2).toString()
                    } else if ("*" in operatornya){
                        input.text = (angka1 * angka2).toString()
                    } else if ("/" in operatornya){
                        input.text = (angka1.toDouble() / angka2.toDouble()).toString()
                    }
                }

                else -> {
                    input.text = input.text.toString() + (view as Button).text.toString()
                }
            }
        }
    }

}