package com.yangrui.scala

object MainObject {
  
  def main(args: Array[String]): Unit = {
    var re=sum(1,2,3,4,5)
    print(re)
    val array=new Array[Int](10);
    array.apply(1)
    println(array.toList)
  }
  
  def sum(suns:Int*)={
    var result=0
    for(suma <- suns){
       result+=suma
    }
    result
  }
  
}