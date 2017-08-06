package com.yangrui.scala.yangbenlei

object PersonObject  extends  App{
  val p:Person=new Person("yangrui",12)
  p match {
    case Person(name,age) => println(name+"    "+age)
  }
}
