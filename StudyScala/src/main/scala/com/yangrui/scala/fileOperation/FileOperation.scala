package com.yangrui.scala.fileOperation

import scala.io.Source
import com.sun.javafx.geom.LineIterator

object FileOperation {
  def main(args: Array[String]): Unit = {
    val  source=Source.fromFile("C:\\Users\\admin\\Desktop\\112.txt", "UTF-8")
//    val  lineIterator=source.getLines()
//    for(line <- lineIterator){
//      println(line)
//    }
    val array=source.getLines().toArray
    println(array)
  }
}