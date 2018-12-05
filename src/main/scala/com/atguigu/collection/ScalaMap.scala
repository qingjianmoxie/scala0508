package com.atguigu.collection

import  collection.mutable.Map
object ScalaMap {

  def main(args: Array[String]): Unit = {
    val map1 = Map("Alice" -> 10, "Jack" -> 20, "Kotlin" -> 30)

      map1.put("zhang3",100)
      map1("li4")=200
      map1+=("wang5"->300)

    for ((k,v)<- map1 ) {
        println(k+"|"+v)
    }

   // println(map1("zhang4"))
   if(map1.get("zhang3")!=None){
    println(map1.get("zhang3").get)
   }

    println(map1.getOrElse("zhang4", 20000))

    map1-=("Jack","zhang3")

    println(s"map1 = ${map1}")

    println(Array(1,9,3).map(x=>3+x).toList)



    def makeDinner(meat:String,cook:String=>String): String ={
           cook(meat)
    }

    def makeSteak(meat:String): String ={
      meat match {
        case "beef" =>"steak"
        case _ =>"no food"
      }
    }

    println(makeDinner("beef", (a=> a match {case "beef"=> "steak"})))

    def showMsge() =()=> println("abc")

    println(showMsge()())


    def minusXY(x:Int)=
      (y:Int)=>y-x     //闭包

    println(minusXY(10)(30))

    //柯里化 咖喱化  currying

    val list=List(1,2,3,4)

    list.map( i =>i*2)

    println(list.reduceLeft(_ + _))

    val numlist= List(1, 2, 3, 4, 5, 6)  //将集合中所有的双数提取出来并乘方，组成新的集合

   /* val ints = numlist.map(i=> i match {case _ if i%2==0 => i*i })*/

    val checkAndPower:PartialFunction[Int,Int]={
       case i if i%2==0 => i*i
    }

    val ints1 = numlist.collect{case i if i%2==0 => i*i}

    println(ints1)

    case class Emp(val name: String, val salary: Double)

    val emps=List(Emp("zhangchen",10000),Emp("guodai",20000),Emp("zhang3",22000),Emp("wang4",34444),Emp("li4",12222))
    //以10000为一个档次  列出个各个薪酬档次的员工个数
    println(emps.groupBy(emp =>  ((emp.salary / 10000).toInt)+"万到"+(((emp.salary / 10000).toInt)+1)+"万").map(e=>(e._1,e._2.size)))


    val map = Map()

  }



}
