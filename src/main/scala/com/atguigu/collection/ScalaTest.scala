package com.atguigu.collection

object NodeList{

  def main(args: Array[String]): Unit = {
    val node  =Node("A","B","C","D","E","T")
    node.showLink()

    println("")

    val revNode=node.getReverseNode() //实现该方法，获得反向的链表
    revNode.showLink()  //打印结果应该是  E->D->C->B->A
  }

}

object Node {
  //初始化链表结构
  def apply(values: String*): Node = {
    var preNode: Node = null
    var headNode: Node = null
    for (value <- values) {
      val curNode: Node = new Node(value)
      if (headNode == null) headNode = curNode
      else preNode.nextNode = curNode
      preNode = curNode
    }
    return headNode;
  }


}

class Node(val value: String) {
  var nextNode: Node = null

  //打印链表结构
  def showLink(): Unit ={
    var tmpNode=this
    while(tmpNode!=null){
      print(tmpNode.value)
      if(tmpNode.nextNode!=null) print("->")
      tmpNode=tmpNode.nextNode
    }
  }





  def getReverseNode(): Node ={
      def getRNode(curNode:Node): Node ={
        if(curNode.nextNode==null){
           //判断退出
          return curNode
        }else{
          // 调用自己
          val newHead=  getRNode(curNode.nextNode)  //薪火相传
          //指针转向
           curNode.nextNode.nextNode=curNode
          curNode.nextNode=null
          return newHead  //薪火相传
        }

      }
         getRNode(this)

  }

  // 获得反向的链表    循环方式
  def getReverseNode2():Node={
       var curNode=this
       var secondNode=curNode.nextNode
       var thirdNode=secondNode.nextNode
       curNode.nextNode=null
       while(secondNode!=null){
         //调转指针
          secondNode.nextNode=curNode
         //平移指针
         curNode=secondNode
         secondNode=thirdNode
         if(thirdNode!=null)  thirdNode=thirdNode.nextNode
       }
       return curNode;
  }




}
