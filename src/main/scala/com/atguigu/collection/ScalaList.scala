package com.atguigu.collection

object ScalaList {
  def main(args: Array[String]): Unit = {
           val list =List(10,20,30)
          println(s"list = ${list}")
    for (n <- list) {
      println(s"n = ${n}")
    }
    val list2 =100+:List(200,300):+400
    println(s"list2 = ${list2}")

    val list3=100::200::300::Nil;
    val list4 =List(1770,2770,3770)
    println(list3 ++ list4)

    println(list3.tail)

  }


}
