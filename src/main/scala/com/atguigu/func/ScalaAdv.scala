package com.atguigu.func

object ScalaAdv {

  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD" //wordcount
    //存放到集合中 Map[Char, Int]()
    var map=Map[Char, Int]()


    def charCount(map:Map[Char, Int],char:Char): Map[Char, Int] ={
        //  按char 从map中取值 如果有直接加1  没有初始化char->0  再加一
         map+ (char->(map.getOrElse(char,0)+1))
    }
   //  参数：参数类型=>返回值
     val rs= ( Map[Char, Int]()/: sentence )((map,char)=>map+ (char->(map.getOrElse(char,0)+1)))


     println(sentence.groupBy(s=>s).map(tt=>(tt._1,tt._2.length )))


    case class Emp(val name: String, val salary: Double)

    val emps=List(Emp("zhangchen",10000),Emp("guodai",20000),Emp("zhang3",22000),Emp("wang4",34444),Emp("li4",12222))

    //以10000为一个档次  列出个各个薪酬档次的员工个数
  // 放到Map[String,Int]中
   // 0到10000 -> 2   10000到20000 ->4
    println(emps.groupBy(emp => ((emp.salary)/1000).toInt))

    //

    def showMsge() =  ()=> println("abc")
    showMsge()()
  }

}
