package com.yangrui.scala

class Student extends Person{
  private var score="A"
  override val father="sub"
  def getScore=score
  def getName1={
    super.getName
  }
  override def getName="ssssss"
}

object Student{
  def main(args: Array[String]): Unit = {
    val student:Student=new Student
    var name=student.getName
    var score=student.getScore
    var name1=student.getName1
    println("name = "+name +"   score ="+score+"  name1 ="+name1)
    
    println(student.isInstanceOf[Person])
    println(student.asInstanceOf[Student])
    println(student.getClass()==classOf[Student])
  }
}