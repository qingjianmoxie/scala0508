package com.atguigu.base

object ScalaIf {
  def main(args: Array[String]): Unit = {

    val sumVal=0
    var result = if ( sumVal == 0 ) {
      println("true") // 此处为满足条件逻辑的最后一行内容，打印语句是没有返回值的
    } else {
      "false" //此处为不满足条件逻辑的最后一行内容，此处返回值为字符串String
    }

    var result1=if(sumVal == 0 ) "true" else "false"

    println(s"result = ${result1}")



  }




}
