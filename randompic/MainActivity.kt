package com.example.randompic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*
import kotlin.random.nextInt
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var ImageViewer : ImageView
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextButton : Button = findViewById(R.id.btnNext)
        nextButton.setOnClickListener {
            if (number == 7){
                number = 0
            }
            else{
                number = number+1
            }
            nxtImage()
        }
        val previousButton : Button = findViewById(R.id.btnPrevious)
        previousButton.setOnClickListener {
            if (number == 0){
                number = 7
            }
            else {
                number = number -1
            }
            nxtImage()
        }
        ImageViewer = findViewById(R.id.img)
    }

    private fun nxtImage() {
        val resources = when(number){
            0 -> R.drawable.unknown
            1 -> R.drawable.frost2op
            2 -> R.drawable.omen
            3 -> R.drawable.spoidermon
            4 -> R.drawable.wp1892140
            5 -> R.drawable.scene
            6 -> R.drawable.marvel_phone
            else -> R.drawable.scenery
        }

        ImageViewer.setImageResource(resources)
    }
}