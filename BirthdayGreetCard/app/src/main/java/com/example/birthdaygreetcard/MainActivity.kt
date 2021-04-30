package com.example.birthdaygreetcard

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val userName = findViewById(R.id.editUserName) as EditText
        val userNameString = userName.editableText.toString()
        Toast.makeText(this, "Welcome $userNameString", Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthdayGreetActivity::class.java)
        intent.putExtra(BirthdayGreetActivity.NAME_EXTRA, userNameString)
        startActivity(intent)

    }
}