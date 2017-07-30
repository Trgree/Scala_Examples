package org.ace

import java.util.Date

object Func_examples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(127); 
  def hello(name: String): String = {
    s"Hello ${name}"
  };System.out.println("""hello: (name: String)String""");$skip(15); val res$0 = 
  hello("ace");System.out.println("""res0: String = """ + $show(res$0));$skip(71); 

  def hello2(name: String) = { // 自动识别返回值类型
    s"Hello ${name}"
  };System.out.println("""hello2: (name: String)String""");$skip(46); 
  def hello3(name: String) = s"Hello ${name}";System.out.println("""hello3: (name: String)String""");$skip(18); val res$1 = 

  hello2("ace");System.out.println("""res1: String = """ + $show(res$1));$skip(36); 

  def add(x: Int, y: Int) = x + y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(12); val res$2 = 
  add(5, 6);System.out.println("""res2: Int = """ + $show(res$2));$skip(99); 

  // 高阶函数,输入参数为一个函数(这个函数输入是2个Int,返回是Int)
  def operate(f: (Int, Int) => Int) = {
    f(4, 4)
  };System.out.println("""operate: (f: (Int, Int) => Int)Int""");$skip(62); 

  def operate2(f: (String) => String) = {
    f("ace2")
  };System.out.println("""operate2: (f: String => String)String""");$skip(68); 

  def operate3(f: (String) => String, v: String) = {
    f(v)
  };System.out.println("""operate3: (f: String => String, v: String)String""");$skip(45); val res$3 = 
  operate2(hello3);System.out.println("""res3: String = """ + $show(res$3));$skip(27); val res$4 =  //输入参数是hello3,而不是hello3()
  operate3(hello3, "haha");System.out.println("""res4: String = """ + $show(res$4));$skip(47); 

  def apply(f: Int => String, v: Int) = f(v);System.out.println("""apply: (f: Int => String, v: Int)String""");$skip(49); 
  def layout[A](x: A) = "[" + x.toString() + "]";System.out.println("""layout: [A](x: A)String""");$skip(20); val res$5 = 
  apply(layout, 10);System.out.println("""res5: String = """ + $show(res$5));$skip(71); 

  // 高阶函数,返回值是函数
  var greeting = (name: String) => s"Hello ${name}";System.out.println("""greeting  : String => String = """ + $show(greeting ));$skip(19); val res$6 = 
  greeting("ace2");System.out.println("""res6: String = """ + $show(res$6));$skip(89); 
  //匿名函数，以上的(name: String) => s"Hello ${name}" 就是
  var add2 = (x: Int, y: Int) => x + y;System.out.println("""add2  : (Int, Int) => Int = """ + $show(add2 ));$skip(13); val res$7 = 
  add2(3, 4);System.out.println("""res7: Int = """ + $show(res$7));$skip(70); 

  // 不设置参数
  var userDir = () => { System.getProperty("user.dir") };System.out.println("""userDir  : () => String = """ + $show(userDir ));$skip(12); val res$8 = 
  userDir();System.out.println("""res8: String = """ + $show(res$8));$skip(46); 

  //正常函数
  def add3(x: Int, y: Int) = x + y;System.out.println("""add3: (x: Int, y: Int)Int""");$skip(52); 
  // 柯里化函数
  def curriedAdd(x: Int)(y: Int) = x + y;System.out.println("""curriedAdd: (x: Int)(y: Int)Int""");$skip(19); val res$9 = 
  curriedAdd(2)(3);System.out.println("""res9: Int = """ + $show(res$9));$skip(58); 

  val addone = curriedAdd(1)_;System.out.println("""addone  : Int => Int = """ + $show(addone ));$skip(45);  // 即 curriedAdd(1)(_:Int)
  var addone2 = (x: Int) => curriedAdd(1)(x);System.out.println("""addone2  : Int => Int = """ + $show(addone2 ));$skip(12); val res$10 = 
  addone(3);System.out.println("""res10: Int = """ + $show(res$10));$skip(13); val res$11 = 
  addone2(2);System.out.println("""res11: Int = """ + $show(res$11));$skip(79); 

  // 偏应用函数
  def log(date: Date, msg: String) = println(date + "----" + msg);System.out.println("""log: (date: java.util.Date, msg: String)Unit""");$skip(22); 
  val date = new Date;System.out.println("""date  : java.util.Date = """ + $show(date ));$skip(85); 
  // 偏应用函数，不用新定义函数，只需要使用把新的函数值的索引的赋给变量
  val logWithDateBound = log(date, _: String);System.out.println("""logWithDateBound  : String => Unit = """ + $show(logWithDateBound ));$skip(68); 
  // 正常函数
  val logWithDateBound2 = (msg: String) => log(date, msg);System.out.println("""logWithDateBound2  : String => Unit = """ + $show(logWithDateBound2 ));$skip(31); 
  logWithDateBound("message1");$skip(32); 
  logWithDateBound2("message1");$skip(104); 

  // 递归函数，需要多个栈,
  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$12 = 
  factorial(3);System.out.println("""res12: Int = """ + $show(res$12));$skip(158); 
  
  // 尾递归,只需要一个栈,m保留上个函数的结果
//  @annotation.tailrec   // 加上注解
  def factorial2(n:Int, m:Int): Int  = {
  	if(n <=0 ) m
  	else factorial2(n - 1, m * n)
  };System.out.println("""factorial2: (n: Int, m: Int)Int""");$skip(19); val res$13 = 
  factorial2(3, 1);System.out.println("""res13: Int = """ + $show(res$13))}
}
