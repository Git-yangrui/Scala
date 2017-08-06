package com.yangrui.scala.fileOperation
import java.io._
object ScalaAndJavaFile {
  def main(args: Array[String]): Unit = {
    var file=new File("C:\\Users\\admin\\Desktop\\112.txt")
    var fis=new FileInputStream(file)
    var intArray=file.length().toInt

    var byts=new Array[Byte](1024)

    fis.read(byts)

  }
}
