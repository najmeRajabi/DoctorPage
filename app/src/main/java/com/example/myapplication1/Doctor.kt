package com.example.myapplication1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Doctor(val name:String , val id:Int , val phone :String , val officeAddress:String,
val image : Int): Parcelable {

    companion object{
        const val city = "tehran"
    }
}