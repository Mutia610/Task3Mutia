package com.mutia.task3mutia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_activitty.*

class LoginActivitty : AppCompatActivity() {

    val username = "udacodingid"
    val password = "udacodingJaya2021"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activitty)

        btnLoginUser.setOnClickListener {

            var edUsername = etUsername.text.toString()
            var edPassword = etPassword.text.toString()

            if (edUsername.isNotEmpty() && edPassword.isNotEmpty()) {
                if (edPassword.length < 6){
                    etPassword.error = getString(R.string.erPass)
                    Toast.makeText(this, getString(R.string.msgPass), Toast.LENGTH_SHORT).show()
                }
                if (edUsername.equals(username) && edPassword.equals(password)) {
                    startActivity(Intent(this, HomeActivity::class.java))
                } else {
                    Toast.makeText(this, getString(R.string.msgUserPassFalse), Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                if (edUsername.isEmpty()) {
                    etUsername.error = getString(R.string.erUsername)
                    Toast.makeText(this,getString(R.string.msgUsername), Toast.LENGTH_SHORT).show()
                }

                if (edPassword.isEmpty()) {
                    etPassword.error = getString(R.string.erPassKosong)
                    Toast.makeText(this,getString(R.string.msgPassKosong), Toast.LENGTH_SHORT).show()
                }

                if (edPassword.isEmpty() && edUsername.isEmpty()) {
                    Toast.makeText(this,getString(R.string.msgPassUserKosong), Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}