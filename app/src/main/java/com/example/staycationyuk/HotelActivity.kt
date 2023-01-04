package com.example.staycationyuk

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class HotelActivity : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        var btn_submit2 = findViewById(R.id.btn_submit2) as Button

        btn_submit2.setOnClickListener {

            AlertDialog.Builder(this)
                    val intent = Intent(this, SearchActivity::class.java)
                    startActivity(intent)
                }
    }
}