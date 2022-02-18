package com.example.myapplication1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication1.databinding.FragmentDoctorInfoBinding


class DoctorInfoFragment : Fragment() {

    lateinit var binding :FragmentDoctorInfoBinding
    lateinit var doctor:Doctor
    var address =""
    var name =""
    var phoneNumber = ""
    var image = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorInfoBinding.inflate(inflater,container,false)


        init()
        getDoctor()
        binding.addressTxv.text = address
        binding.textName.text = name
        binding.phoneTxv.text = phoneNumber
        binding.profileImage.setImageResource(image)

        return binding.root
    }

    private fun init() {

    }
    fun getDoctor(){
        doctor = activity?.intent?.getParcelableExtra<Doctor>(DOCTOR)!!
        name= doctor.name
        address = doctor.officeAddress
        phoneNumber = doctor.phone
        image = doctor.image

    }

}