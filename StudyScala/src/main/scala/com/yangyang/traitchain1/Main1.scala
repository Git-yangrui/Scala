package com.yangyang.traitchain1

import scala.collection.immutable.List
import scala.collection.mutable.Map

object Main1 {
  def main(args: Array[String]): Unit = {
    //var p:Person=new Person
    var listnew = List("hello world", "you me").flatMap(_.split(" "))
    // println(listnew)
    var listzip = List("jack", "leo", "peter", "jan").zip(List(1, 2, 3, 4))
    // println(listzip)

    var list = List("hello world", "hello how are you")
    var list1 = list.flatMap(_.split(" ")) //{(line:String) => line.split(" ")}
    var list2 = list1.map { (name: String) => (name, 1) }
    var map = Map[String, Int]()
    for (els <- list2) {
      var key = els._1
      var value = els._2
      map += (key -> value)
    }

    println(map)
    var maptuple = list2.map(_._2)
    var reduce = maptuple.reduceLeft(_ + _)
    println(list2)
  }
}