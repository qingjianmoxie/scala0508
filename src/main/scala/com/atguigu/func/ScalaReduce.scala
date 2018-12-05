package com.atguigu.func

object ScalaReduce {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    def minus(num1:Int,num2:Int):Int={
        num1-num2
    }
    val rs = list.reduceRight(minus)
    println(s"rs = ${rs}")

    val rs2 = list.foldLeft(10)(minus)

          (10/:list)(minus)
    (list:\100)(minus)
    println(s"rs2 = ${rs2}")

    val i8 = (1 to 5).scanLeft(0)(minus)
    println(i8)
  }
//3





}
