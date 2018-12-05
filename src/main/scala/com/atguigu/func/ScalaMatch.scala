package com.atguigu.func

object ScalaMatch {

  def main(args: Array[String]): Unit = {
     val i ="10"

    i match {
      case "20" => println("等于20")
      case x if(x=="100")=> println(s"x = ${x}")
      case _ => println("不等于10")
    }
  }
// 常量判断 变量赋值 下划线通吃


  val args =(100,"200",List(300),Array(400))
  for ( a<- args.productIterator ) {
    a match {
      case x:Int => println("Int:"+x)
      case x:String =>println("String:"+x)
      case x:List[String] =>println("List:"+x)  //匹配过程 不考虑泛型
      case x:Array[String] =>println("Array:"+x)
      case _ =>println("others")
    }



    val args1 =(Array(100),Array(200,300),Array(300,400,500),Array(400,500,600,700))

    for ( a<- args1.productIterator ) {

      val msg= a match {
        case Array(100) => "一个参数"
        case Array(_,_) => "两个参数"
        case Array(x,600,z) => "三个参数："+x+","+600+","+z
        case Array(400,_*) => "400开头的"
        case _ => "兜底"
      }

      val args1 =(List(100),List(200,300),List(300,400,500),List(400,500,600,700))

      for ( a<- args1.productIterator ) {

        val msg= a match {
          case List(100) => "一个参数"
          case List(_,_) => "两个参数"
          case List(x,y,z) => "三个参数："+x+","+y+","+z
          case List(400,_*) => "400开头的"
        }
        println(s"msg = ${msg}")
      }

      println(s"msg = ${msg}")



      val args2 =(List(100,1000,2000),List(200,300),List(100,400,500),List(300,500,600,700),List(1000,9999,19999,120000))

      for ( a<- args2.productIterator ) {

        val msg= a match {
          case 100 :: Nil => "100"
          case x :: 300 :: Nil => x + " " +  300
          case 300 :: tail => "300 ..."
          case ls => "something else:"+ls
        }
        println(s"msg = ${msg}")
      }

    }



    case class User(val name:String,val balance:Double) //样例类  tostring copy(clone)


    val user1=User("zhang3",1000.0)


    //如果账户是xxx则打印金额 否则打印不匹配

    user1 match { //如果User的参数 是常量则进行比较，如果是变量则进行赋值。
      //此处并不是调用User的apply方法也不是调用，User的构造函数
      case User("li4",balance) => println(s"balance = ${balance}")
      case _ =>println("Not Match...")
    }


    val (q, r) = BigInt(10) /% 3
    println(s"r = ${r}")
    val arr = Array(1, 7, 2, 9)
  /*  val Array(first, second, _*) = arr
    println(first, second)*/

    val list=1::3::4::5::Nil  //等同于 List(1,3,4,5)

    val first :: second :: rest= list

    println(first+","+second+","+rest);

    val map = Map("A"->1, "B"->0, "C"->3)
/*    for ( (k, v) <- map ) {
      println(k + " -> " + v)
    }*/
    for ((k, 0) <- map) {// 依然要符合匹配的原则，“常量比较，变量赋值”
      println(k + " --> " + 0)
    }





  }

}
