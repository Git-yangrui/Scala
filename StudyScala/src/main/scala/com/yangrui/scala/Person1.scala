package com.yangrui.scala

class Person1(val name: String) extends HelloTrait with MakeFriends {
  def sayHello(name: String) = println("hello " + name)
  def makeFriends(p: Person1) = println("")
}