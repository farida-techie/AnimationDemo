package com.malkinfo.animationdemo

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var isAnimation:AnimationDrawable
    private lateinit var img:ImageView
    private lateinit var btn:Button
    var isStart = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** set find Id*/
        img = findViewById(R.id.img)
        btn = findViewById(R.id.btn)
        img.setImageResource(R.drawable.animation_item)
        /** set Animation*/
        isAnimation = img.drawable as AnimationDrawable

        /**set animation Start*/
        btn.setOnClickListener {
            if (!isStart){
                isAnimation.start()
                btn.text = "stop"
                isStart  = true
                btn.setBackgroundColor(Color.RED)

            }
            else{
                isAnimation.stop()
                btn.text = "Start"
                isStart  = false
                btn.setBackgroundColor(resources.getColor(R.color.purple_500))

            }
        }
    }
    /** ok now run it*/
}