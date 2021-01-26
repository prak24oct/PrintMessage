package com.example.printmessage

import androidx.annotation.Keep


class PrintActivity {

    val name: String = "nkjdbvkjdsbv"
    val test : Int = 1

    var mA = MainPr()

   val t =  add(5)

    @Keep
    companion object{
        fun printFunction(message : String){
        println(message)
    }}


}
fun add(first: Int){
    val second : Int = 2
    println(first+second)
}