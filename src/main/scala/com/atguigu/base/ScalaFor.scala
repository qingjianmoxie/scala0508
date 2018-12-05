package com.atguigu.base

import scala.collection.immutable.{::, Nil}
import util.control.Breaks._

object ScalaFor {

  def main(args: Array[String]): Unit = {
/*    for ( i <- 1 until 20 ) {
      println(s"i = ${i}")
    }*/


    for ( i <-  (1 to (20,2)).reverse; if i%3!=0 ;j=i*10 ) {
      println(s"i = ${i}")
      println(s"j = ${j}")
    }

    for(i<-1 to 5 ;j<- 1 to 3){
      println(s"i,j = ${i}+${j}")
    }

     val abc= new ::[String]("123", Nil)



     println(abc)


  for(row<- 1 to 9;col <- 1 to row) {
    breakable {
      if (row * col == 25) break
      print(s"${col}乘${row} 等于 ${row * col}")
    }
      if(row==col){
        println()
      }else{
        print("||")
      }


    }


    val rs= for(row<- 1 to 9;col <- 1 to row) yield row*col
    println(rs)


  }

}
