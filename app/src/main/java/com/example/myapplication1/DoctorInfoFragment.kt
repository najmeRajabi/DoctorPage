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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorInfoBinding.inflate(inflater,container,false)


        init()

        return binding.root
    }

    private fun init() {
        binding.fragmentBtn.setOnClickListener {
            Toast.makeText(activity,"I'm clicked",Toast.LENGTH_SHORT).show()


        }
    }

}