package com.example.counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SearchView
import android.widget.SeekBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var num: TextView
    private lateinit var add: Button
    private lateinit var adding: TextView
    private lateinit var seekBar: SeekBar

    private var addingNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num = findViewById<TextView>(R.id.textNum)
        adding = findViewById<TextView>(R.id.textNumAdding)
        add = findViewById<Button>(R.id.buttonAdd)
        seekBar = findViewById<SeekBar>(R.id.seekBar)

        add.setOnClickListener {
            num.text = (((num.text).toString()).toInt() + addingNumber).toString()

        }

        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(
                    seekBar: SeekBar, i: Int, b: Boolean) {
                    // Display the current progress of SeekBar
                    adding.text = i.toString()
                    addingNumber = i
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {
                }

                override fun onStopTrackingTouch(seekBar: SeekBar) {
                }
            })
    }
}