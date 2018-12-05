package com.atguigu.base



import math._
object Scala01 {

  def main(args: Array[String]): Unit = {

     /* val x=10

      println(s"x = ${x}")
      println("abc")

      def sayHello()={ //自动推断
        println("hello")
      }

      println(sayHello())

      */

     Scala01.newWorld()

      //scala01.str="999"
      val scala01:Scala01 =  new Scala01();
     // val world=   scala01.sayWorld _
     // println(world)
     // println("------------")
      //println(world(""))
     scala01.sayWorld(age="99")

     sqrt(100)
  }

  def newWorld(): Unit ={
    println("new world")
  }

  val scala01:Scala01 =  new Scala01();
  scala01.showName()
 println( "HelloWorld".distinct)
}
class Scala01 extends Person{
  var str:String="hello world"


  def abca(): AnyRef ={
      "123123"
  }
   var str1="abd"
   str1="abd"+"afadf"

  def sayWorld(name:String="li44",age:String="100"){  //自动推断取方法最后一行的值  //无等号相当于Unit
    println(s"age = ${age}")
    println(123123)
    123123
  }



  def abc: Unit ={

  }




}
trait Person {

  def showName(): Unit ={
    println("zhang3")

  }
}