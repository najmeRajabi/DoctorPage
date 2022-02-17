package com.example.myapplication1

object Hospital {
    var doctorList = arrayListOf<Doctor>()

    fun testDataDoctor(){
        var doctor1 = Doctor("ali",1,"1322655","klkhbujhg")
        var doctor2 = Doctor("ala",2,"6595855","bgfvtdrserds")
        var doctor3 = Doctor("sara",3,"9552225","njjbhgygfv")
        doctorList.add(doctor1)
        doctorList.add(doctor2)
        doctorList.add(doctor3)
    }
}