package com.atguigu.base

object ScalaEx {

  def main(args: Array[String]): Unit = {
    // Scala
    try {
      val r = 10 / 0
    } catch {
      case ex: ArithmeticException => println("捕获了除数为零的算数异常")
      case ex: Exception=> println("捕获了异常")
    } finally {
      // 最终要执行的代码
    }

  }

}
