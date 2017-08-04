package com.yangyang.traitchain

trait SignatureValidHandle extends Handler{
  override def handler(data:String){
    println("check signature "+data)
    super.handler(data)
  }
}