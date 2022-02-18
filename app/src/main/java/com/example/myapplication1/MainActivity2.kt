package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.ActivityMain2Binding
const val ID = "id"
const val DOCTOR = "doctor"

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.btnDoctor1.text= Hospital.testDataDoctor(0).name
        binding.btnDoctor2.text= Hospital.testDataDoctor(1).name
        binding.btnDoctor3.text= Hospital.testDataDoctor(2).name

        setOnClick()


    }

    private fun setOnClick() {
        binding.btnDoctor1.setOnClickListener { goToActivity2(Hospital.testDataDoctor(0)) }
        binding.btnDoctor2.setOnClickListener { goToActivity2(Hospital.testDataDoctor(1)) }
        binding.btnDoctor3.setOnClickListener { goToActivity2(Hospital.testDataDoctor(2)) }
    }

    fun goToActivity2(doctor :Doctor){
        val intent = Intent(this , Activity2::class.java)
//        intent.putExtra(ID , doctorId)
        intent.putExtra(DOCTOR,doctor)
        startActivity(intent)
    }
}