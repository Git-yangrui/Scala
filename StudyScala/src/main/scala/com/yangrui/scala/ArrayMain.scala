package com.yangrui.scala

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.List

object ArrayMain {
  def main(args: Array[String]): Unit = {
    var arrayBuffer = ArrayBuffer[Int]()
    arrayBuffer += (1, 2, 3, 4, 5)
    println(arrayBuffer)
    var array = Array(1, 2, 34, 5)
    var array2 = for (ele <- array) yield ele * ele
    println(array2.toBuffer)
    var array3 = for (els <- array if els % 2 == 0) yield els * els
    println(array3.toBuffer)
   var list= List(1,2,3)
  }

}