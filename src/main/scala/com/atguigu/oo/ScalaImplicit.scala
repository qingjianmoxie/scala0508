package com.atguigu.oo

import java.util.{Calendar, Date}

object ScalaImplicit {

  def main(args: Array[String]): Unit = {
      implicit def doubleToInt(d:Double): Int ={
         d.toInt*10
      }

    implicit def doubleToInt2(d:Boolean): Int ={
       123123
    }
    implicit  def v1tov2(workerV1:WorkerV1) :WorkerV2={
       new WorkerV2
    }

       val i:Int=3.5
       println(s"i = ${i}")

      val workerV1 = new WorkerV1()
      workerV1.delete()

      workerV1


    def query(implicit  string: String): Unit ={
      println("add"+string)
    }

    implicit val s="zhang3"

    query("li4")

/*
    implicit def  date2Long(d:Date):Long={
        d.getTime/1000/60/60/24
    }
    implicit def  long2Date(sec:Long):Date={
        new Date(sec*1000*60*60*24)
    }
*/


    implicit class ScalaDate(d:Date){
      def +(i:Int): Date ={
         val calendar = Calendar.getInstance()
         calendar.setTime(d);
         calendar.add(Calendar.DAY_OF_YEAR,i)
         calendar.getTime
      }
    }

    var date=new Date();
    println(date)
    date=date+1  //加1秒  加1天

    println(date)



  }




  class WorkerV1(){
    def update(): Unit ={
      println("update")
    }
  }

  class WorkerV2(){
    def delete(): Unit ={
      println("delete")
    }
  }

  //隐式类
  implicit  class Worker3(workerV1:WorkerV1){
    def add(): Unit ={
      println("add")
    }
  }






}
