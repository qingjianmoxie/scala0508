package com.atguigu.collection

object ScalaTuple {


  def main(args: Array[String]): Unit = {
    val tuple=(10,20,"69",List(99))

    println(tuple._4)

    for ( e <- tuple.productIterator ) {
      println(s"e = ${e}")
    }

    def process(i:Int) ={
      //.......
      if(i==0){
        ("sucess",10000)
      }else{
        ("fail",20000)
      }

    }



  }
}
