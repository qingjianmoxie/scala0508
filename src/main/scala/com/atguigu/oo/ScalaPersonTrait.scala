package com.atguigu.oo

object ScalaPersonTrait {

  def main(args: Array[String]): Unit = {
    println(List(1212) :: List(999))
    val c=   new Customer
    c.login()
  }


  trait Person {
    println("create person")

    def login(): Unit ={
      println("Person login")
    }

    def sayHello(): Unit ={
      println("hello")
    }
  }

  trait User{
    def login(): Unit ={
      println("buyer login")
    }
  }

  trait  Buyer extends Person{
    def buy(stuff:String): Unit ={
      println("buy "+stuff)
    }

    override def login(): Unit ={
      println("buyer login")
      super.login()
    }
  }

  trait Seller extends Person{
    def sell(stuff:String){
      println(" sell "+stuff)
    }
    override def login(): Unit ={
      println("seller login")

    }

    }


  class Customer extends Person with Seller  with Buyer{
    println("create customer")


    override def sayHello(): Unit = {
      super.sayHello()
      println("ni hao")
    }
  }


}
