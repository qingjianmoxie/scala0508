package com.atguigu.base

object ScalaFunc {

  def main(args: Array[String]): Unit = {


    def f7(args: Int*) = {
      var result = 0
      for(arg <- args)
      result += arg
      println(result)
    }

    f7(1,2,3,4)


    def f8(n: Int):Int = {
      if(n <= 0)
        1
      else
        n * f8(n - 1)
    }


    def  sayHello(): String ={
      println("hello world")
       "hello"
    }
    lazy val word=sayHello()

    println("--------------"+word)

    println(s"word = ${word}")

  }
}
