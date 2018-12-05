package com.atguigu.base.ex

object ScalaEx {

  def main(args: Array[String]): Unit = {

    var sumVal = 1

    val num= if ( sumVal == 0 )  999  else  sumVal= 1000

    println(s"num = ${num}")


    for(i <- (1 until (9,2)).reverse; if i>4 ; j=i*2) {
      println(j)
    }

   val ab=  new ScalaEx("afaf")
    ab.str
  }

  class Person(str:String)
}

class ScalaEx (val str:String){

}