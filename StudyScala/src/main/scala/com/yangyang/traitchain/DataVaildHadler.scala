package com.yangyang.traitchain

trait DataVaildHadler extends Handler {
  
   override def handler(data:String){
     println("check data :"+data)
     super.handler(data)
   }
   
}