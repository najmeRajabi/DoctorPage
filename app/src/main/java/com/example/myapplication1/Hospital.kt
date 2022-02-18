package com.example.myapplication1

object Hospital {
    var doctorList = arrayListOf<Doctor>()

    fun testDataDoctor(n:Int):Doctor{
        var doctor1 = Doctor("دکتر علی رجبی",1,"1322655655","اصفهان",(R.drawable.doctor_man))
        var doctor2 = Doctor("دکتر آلا سلطانی",2,"65958554564","تهران",(R.drawable.doctor__circle_2))
        var doctor3 = Doctor("دکتر سارا تنابنده",3,"9552225454","شیراز",(R.drawable.doctor_circle))
        doctorList.add(doctor1)
        doctorList.add(doctor2)
        doctorList.add(doctor3)
        return doctorList[n]
    }
}