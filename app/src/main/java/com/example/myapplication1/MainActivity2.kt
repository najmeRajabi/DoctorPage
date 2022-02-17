package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val name = "name"
        val doctorName =getString(R.string.doctor_name_text)

        binding.btnEnter.setOnClickListener {
            val intent = Intent(this , Activity2::class.java)
            intent.putExtra(name , doctorName)
            startActivity(intent)
        }

    }
}