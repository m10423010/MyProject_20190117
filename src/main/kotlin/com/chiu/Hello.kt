package com.chiu

fun main(args: Array<String>) {
    //Human().Hello()
    val h=Human()
    val age =19 //也可以寫成 val age : int =19
    h.Hello()


}

//建立類別
class Human{
   //建立方法
    fun Hello(){
       print("Good!!")
   }
}