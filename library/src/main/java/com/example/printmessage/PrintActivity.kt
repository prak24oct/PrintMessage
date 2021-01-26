package com.example.printmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrintActivity {

    val name: String = "nkjdbvkjdsbv"
    val test : Int = 1

   val t =  add(5)

    companion object{
        fun printFunction(message : String){
        println(message)
    }}


}
fun add(first: Int){
    val second : Int = 2
    println(first+second)
}