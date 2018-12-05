package com.atguigu.oo

object ScalaTraitLink {


  def main(args: Array[String]): Unit = {
       val customer=new Customer()

  }

  class Person {
    println("create person")
  }


  trait User {
    println("create User")
  }

  trait  Buyer extends User{
    println("create Buyer")



  }

  trait Seller extends User{
    println("create Seller")


  }



  class Customer extends Person with Seller   with Buyer{
    println("create customer")   //由左向右  由父即子

  }

}
