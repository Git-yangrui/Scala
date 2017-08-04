package com.yangrui.scala.innerclass

import scala.collection.mutable.ArrayBuffer


class Class {
  class Student(val name:String){}
  val students=new ArrayBuffer[Student]
}