package com.atguigu.collection
import collection.mutable.Set
object ScaleSet {

  def main(args: Array[String]): Unit = {
       val set1=   Set(10,20,30)
       val set2=   Set(40,20,80)
        println(set1 & set2)

       println(set1 ++ set2)
       println(set2 &~ set1)
  }

}
