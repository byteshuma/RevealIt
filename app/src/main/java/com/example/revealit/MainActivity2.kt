package com.example.revealit

import android.os.Bundle
//import android.util.Log
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import androidx.core.view.setPadding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
//        val not:Button=findViewById(R.id.buttons2)
//        val userNameField = findViewById<EditText>(R.id.editTextTextEmailAddress)
//        val passwordField = findViewById<EditText>(R.id.editTextNumberPassword)
////        not.setOnClickListener {
//            val Username = userNameField.text.toString()
//            val Password = passwordField.text.toString()
//            if (Username == "Huma" && Password == "6464")
//            Toast.makeText(this, "login successful!", Toast.LENGTH_LONG).show()
//        }
//            else{
//            Toast.makeText(this, "Invalid login", Toast.LENGTH_SHORT).show()
//            OpenContact(PhoneNumber:"03131673067")
//        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top,systemBars.right, systemBars.bottom)
            insets
        }
    }
}


