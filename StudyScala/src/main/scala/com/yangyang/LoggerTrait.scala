package com.yangyang

trait LoggerTrait {
   val msg:String
   def sayHello(name:String)=println("hello "+msg +"  , "+name)
   def log(context:String)=println("log contxt is "+context)
}