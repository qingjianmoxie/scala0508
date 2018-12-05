package com.atguigu.base

import scala.beans.BeanProperty

object ScalaConstructor {


  def main(args: Array[String]): Unit = {
         val person01 = new Person01("zhang3",100)
        person01.callName()
        person01.name="wang5"
        person01.name


/*         val person02 =   Person01("li4",44)

        val a  =List()*/


  }

  object Person01 {
    def apply(name: String, age: Int): Person01 = {
      //
      new Person01(name, age)
    }
  }



  class Person01 (var name:String ,age:Int){
    println("01")
    println("02")

    @BeanProperty
     var address:String=""

    def this(name:String ) {
        this("",0)
         println(name)
    }



    def callName(): Unit ={
      name+="100"
      println(s"name = ${name}")

    }




  }



}
