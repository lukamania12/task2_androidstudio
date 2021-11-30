package com.example.homeworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import javax.security.auth.login.LoginException

class SignUpActivity : AppCompatActivity() {
    lateinit var signupmail: EditText
    lateinit var signuppassword: EditText
    lateinit var signup_f_name: EditText
    lateinit var signup_l_name: EditText
    lateinit var signup_u_name: EditText
    lateinit var signup_registerbtn: Button
    lateinit var signup_to_signin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        signupmail = findViewById(R.id.signupmail)
        signuppassword = findViewById(R.id.signuppassword)
        signup_f_name = findViewById(R.id.signup_f_name)
        signup_l_name = findViewById(R.id.signup_l_name)
        signup_u_name = findViewById(R.id.signup_u_name)
        signup_registerbtn = findViewById(R.id.signup_registerbtn)
        signup_to_signin = findViewById(R.id.signup_to_signin)

        signup_registerbtn.setOnClickListener() {
            if (signupmail.text.toString() != "" && signuppassword.text.toString() != "" && signup_f_name.text.toString() != "" && signup_l_name.text.toString() != "" && signup_u_name.text.toString() != "") {
                var intent = Intent(this, LogInActivity::class.java)
                var name = signup_u_name.text.toString()
                intent.putExtra("Name", name)
                startActivity(intent)
            }
            else {
                Toast.makeText(this," გთხოვთ ყველა ველი შეავსოთ ",Toast.LENGTH_LONG ).show()
                return@setOnClickListener
            }
        }
        signup_to_signin.setOnClickListener(){
            var xintent = Intent(this, LogInActivity::class.java)
            var name1:String? = null
            xintent.putExtra("defvalue", name1)
            startActivity(xintent)
        }
    }
}