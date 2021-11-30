package com.example.homeworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class LogInActivity : AppCompatActivity() {
    lateinit var signin_welcome_text : TextView
    lateinit var signin_welcome_subj : TextView
    lateinit var signin_mail : EditText
    lateinit var signin_password : EditText
    lateinit var signin_loginbtn : Button
    lateinit var signin_to_signup : TextView
    val correctmail = "lukamania2003@gmail.com"
    val correctpass = "lukkinho12"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        signin_welcome_text = findViewById(R.id.signin_welcome_text)
        signin_welcome_subj = findViewById(R.id.signin_welcome_subj)
        signin_mail = findViewById(R.id.signin_mail)
        signin_password = findViewById(R.id.signin_password)
        signin_loginbtn = findViewById(R.id.signin_loginbtn)
        signin_to_signup = findViewById(R.id.signin_to_signup)

        signin_welcome_subj.text = intent.extras?.getString("Name","Luka")
        signin_loginbtn.setOnClickListener(){
            if(signin_mail.text.toString() == correctmail && signin_password.text.toString() == correctpass){
                Toast.makeText(this,"თქვენი მონაცემები სწორია ",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"თქვენი მონაცამები არასწორია, გთხოვთ სცადოთ ხელახლა",Toast.LENGTH_LONG).show()
            }
        }
        signin_to_signup.setOnClickListener(){
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}