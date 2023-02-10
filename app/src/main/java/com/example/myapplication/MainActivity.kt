package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imga : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            rolldice()


        }
    }

    private fun rolldice() {
        imga = findViewById(R.id.iv)
        var rando = (0..6).random()
       if(rando == 1){
            imga.setImageResource(R.drawable.dice_1)
       }
        else if (rando == 2){
           imga.setImageResource(R.drawable.dice_2)
        }
       else if (rando == 3){
           imga.setImageResource(R.drawable.dice_3)
       }
       else if (rando == 4){
           imga.setImageResource(R.drawable.dice_4)
       }
       else if (rando == 5){
           imga.setImageResource(R.drawable.dice_5)
       }
       else if (rando == 6){
           imga.setImageResource(R.drawable.dice_6)
       }
    }
}