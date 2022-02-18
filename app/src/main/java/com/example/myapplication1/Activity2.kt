package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding :Activity2Binding
    lateinit var doctor:Doctor
    var id =0
    var address =""
    var name =""
    var phoneNumber = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        getDoctor()
        binding.addressTxv.text = address
        binding.textName.text = name
        binding.phoneTxv.text = phoneNumber




    }
    fun getDoctor(){
        doctor = intent.getParcelableExtra<Doctor>(DOCTOR)!!
        name= doctor.name
        address = doctor.officeAddress
        phoneNumber = doctor.phone
//        name = Hospital.testDataDoctor(id-1).name
//        address = Hospital.testDataDoctor(id-1).officeAddress
//        phoneNumber = Hospital.testDataDoctor(id-1).phone
    }
}