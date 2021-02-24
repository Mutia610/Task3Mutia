package com.mutia.task3mutia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login_activitty.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivitty::class.java))
        }

        btnKonversi.setOnClickListener {
            startActivity(Intent(this, KonversiActivity::class.java))
        }

        btnBangun.setOnClickListener {
            startActivity(Intent(this, HitungFisikaActivity::class.java))
        }
    }
}