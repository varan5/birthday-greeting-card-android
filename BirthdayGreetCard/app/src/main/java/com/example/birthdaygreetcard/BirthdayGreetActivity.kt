package com.example.birthdaygreetcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "userName"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val userName = intent.getStringExtra(BirthdayGreetActivity.NAME_EXTRA)
        val birthdayGreetTextView = findViewById(R.id.birthdayGreetingTextView) as TextView
        birthdayGreetTextView.text = "Happy Birthday $userName"


    }
}