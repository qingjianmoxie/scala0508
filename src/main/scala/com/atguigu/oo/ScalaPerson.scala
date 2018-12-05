package com.atguigu.oo

object ScalaPerson {

  def main(args: Array[String]): Unit = {




    val person = new Customer
    println(person.showName())
    println(person.name)

  }

}


class Person{
     val name="123"
}

class Customer extends Person{
  override   val name: String =  "999"
  def showName(): String ={
    println("this is customer")
     name
  }
}