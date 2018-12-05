package com.atguigu.collection

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object ScalaBuffer {

  def main(args: Array[String]): Unit = {
        val arrayBuffer= ArrayBuffer("10","20","30")

       arrayBuffer+="50"
    arrayBuffer.append("343")
    arrayBuffer.remove(1)
       for (str <- arrayBuffer) {
         println(str)
       }
    println(arrayBuffer + "60")

/*    import scala.collection.JavaConversions.bufferAsJavaList
    var list:java.util.List[String]  =arrayBuffer;
    println(s"list = ${list}")

    import scala.collection.JavaConversions.asScalaBuffer

    val arrayBuffer2: mutable.Buffer[String]=list;
    println(s"arrayBuffer2 = ${arrayBuffer2}")*/


    arrayBuffer.toList

  }

}
