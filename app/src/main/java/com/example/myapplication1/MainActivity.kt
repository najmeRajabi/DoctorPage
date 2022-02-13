package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication1.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var button:Button
    lateinit var editTextName :EditText
    lateinit var editTextPhone :EditText
    lateinit var answerTextView :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.answerTextView = findViewById(R.id.textViewAnswer)
//        button=findViewById(R.id.button4)
//        editTextName = findViewById(R.id.editTextTextPersonName)
//        editTextPhone = findViewById(R.id.editTextTextPersonPhoneNumber)
        button.setOnClickListener{
            if (editTextName.text.toString().isBlank()){
                editTextName.error="این فیلد خالی است."
                answerTextView.setText(" لطفا نام را وارد کنید")
            }else if (editTextPhone.text.toString().isBlank() ||
                editTextPhone.text.toString().trimIndent().length != 11 ){
                editTextPhone.error="شماره را به درستی وارد کنید"
                answerTextView.setText("لطفا شماره را 11 رقم وارد کنید")
            }else{
                answerTextView.setText(" سلام ${editTextName.text}")
            }
        }

    }
}