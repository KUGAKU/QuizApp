package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_start)
        val etName = findViewById<TextView>(R.id.et_name)
        button.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, QuizQuestionActivity::class.java)
                startActivities(arrayOf(intent))
                finish()
            }
        }
    }
}