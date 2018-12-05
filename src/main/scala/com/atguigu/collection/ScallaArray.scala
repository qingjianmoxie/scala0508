package com.atguigu.collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ScallaArray {


  def main(args: Array[String]): Unit = {
      val arr=new Array[String](10)

      arr(0)="100"
      arr(1)="200"

    val arr1 =Array(10,11,2344,456,23 )

    println(s"arr1.sum = ${arr1.sum}")

    println(s"arr1 = ${arr1.mkString(",")}")

    for (str <- arr1 ) {
      println(str)
    }

      val arr34= Array.ofDim[Double](3,4)
    arr34(0)(0)=10
    arr34(1)(3)=101
    arr34(2)(1)=102
    arr34(1)(2)=1012
    for ( arr3  <- arr34 ; arr <- arr3) {
      println(s"arr = ${arr}")

    }

    List(100)

     val list= 10+:20+:  List(100)
    println(s"list = ${list}")


    import scala.collection.JavaConversions.bufferAsJavaList
    var arrayBuffer   =ArrayBuffer("123","323","3333")

    arrayBuffer+="3"
    var list1:java.util.List[String]  =arrayBuffer;
    println(list1)

    import scala.collection.JavaConversions.asScalaBuffer

    val arrayBuffer2: mutable.Buffer[String]=list1;

    println(s"arrayBuffer2 = ${arrayBuffer2}")

    val map1 = Map("Alice" -> 10, "Jack" -> 20, "Kotlin" -> 30)

    map1("Alice")

    for ((k, v) <- map1) {
      println(k+":"+v)
    }



  }

}
