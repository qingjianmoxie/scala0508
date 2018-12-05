package com.atguigu.func

object ScalaMap {

  def main(args: Array[String]): Unit = {
    val names=List("Alice","Bob","Nick")

    def upCase(s:String ): String ={
      s.toUpperCase
    }

    val nameList=  names.map(upCase)

    println(s"nameList = ${nameList}")

    def hasA(s:String):Boolean={
      s.startsWith("A")
    }
    val nameWithA = names.filter(hasA)

    println(s"nameWithA = ${nameWithA}")



    val charactors=List("郭靖","洪七公","欧阳锋","杨过")

    def getFamily(name:String) :List[String]={
      if(name=="郭靖"){
        return  name::List( "黄蓉","郭襄")
      }else if(name=="杨过"){
        return  name::List( "小龙女")
      }
      else{
        return List(name)
      }
    }


    println("map:"+ charactors.map(getFamily) )

   println("faltmap:"+ charactors.flatMap(getFamily))

  }
}
