package com.atguigu.func



import scala.collection.SeqView
import scala.collection.mutable.ListBuffer
import scala.util.Random

object ScalarStream {


  def main(args: Array[String]): Unit = {


    def numsList(n: BigInt) : List[BigInt] = {
      n  :: numsList(n + 1)
    }

    //val list=numsList(10)

    def numsStream(n: BigInt) : Stream[BigInt] = {
      n #:: numsStream(n + 1)
    }

    val stream=numsStream(10)

    println(stream(1))
    println(stream)


    def ramdonNum(): Stream[Int] ={
      Random.nextInt(100000)#::ramdonNum()
    }

    def isModBy123(num:Int): Boolean ={
      val isMod=num%123==0
      return isMod
    }


    val nums = ramdonNum()

    println(nums.filter(isModBy123).take(5).toList)


    val boys=List("令狐冲","段誉","杨过","虚竹")
    val girls = List("任盈盈","王语嫣","小龙女")

    println(boys.zip(girls))


    //(1 to 5).foreach(println(_))



    println()
    (1 to 5).par.foreach(println(_))

    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1)
    println(result2)



  }
}
