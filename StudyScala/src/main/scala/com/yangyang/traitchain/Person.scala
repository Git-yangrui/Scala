package com.yangyang.traitchain

class Person(val name: String) extends SignatureValidHandle with DataVaildHadler {
  def sayHello={
    println("hello ,"+name)
    handler(name)
  }
}