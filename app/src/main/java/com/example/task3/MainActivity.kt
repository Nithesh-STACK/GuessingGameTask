package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var randomNo=Random.nextInt(0,1000)
        val msg=findViewById<TextView>(R.id.answer)
        findViewById<TextView>(R.id.submit).setOnClickListener {
            val input=findViewById<TextInputLayout>(R.id.textInputLayout)
            val guessNo=input.editText?.text?.toString()?.toInt()
            when{
                randomNo>guessNo!!->{
                    msg.text="No:) My number is bigger"
                }
                randomNo<guessNo!!->{
                    msg.text="No:) My number is smaller"
                }
                randomNo==guessNo!!->{
                    msg.text="You are right ! lets play again"
                    randomNo=Random.nextInt(0,1000)

                }
            }
        }
    }
}