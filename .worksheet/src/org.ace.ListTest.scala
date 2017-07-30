package org.ace

object ListTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
	// 列表创建
  val a = List(1, 2, 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(18); 
  var empty = Nil;System.out.println("""empty  : scala.collection.immutable.Nil.type = """ + $show(empty ));$skip(17); 
  var g = List();System.out.println("""g  : List[Nothing] = """ + $show(g ));$skip(29); 
  var f = 1 :: 2 :: 3 :: Nil;System.out.println("""f  : List[Int] = """ + $show(f ));$skip(10); val res$0 = 
  
  a(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 
  
  // 添加元素
  val b = 0 :: a;System.out.println("""b  : List[Int] = """ + $show(b ));$skip(17); 
  var c = 2 +: a;System.out.println("""c  : List[Int] = """ + $show(c ));$skip(17); 
  var d = b :: a;System.out.println("""d  : List[Any] = """ + $show(d ));$skip(28); 
  // 列表连接
  var e = b ::: a;System.out.println("""e  : List[Int] = """ + $show(e ));$skip(29); 
  var e2 = List.concat(a, b);System.out.println("""e2  : List[Int] = """ + $show(e2 ));$skip(20); 
  var e3 = b.:::(a);System.out.println("""e3  : List[Int] = """ + $show(e3 ));$skip(85); 
  // 二维
  var h = (1 :: 2 ::3 :: Nil)::(4 :: 5 ::6 :: Nil)::(7 :: 8 ::9 :: Nil)::Nil;System.out.println("""h  : List[List[Int]] = """ + $show(h ));$skip(27); 
  // 列表操作
  val i = a.head;System.out.println("""i  : Int = """ + $show(i ));$skip(17); 
  val j = a.tail;System.out.println("""j  : List[Int] = """ + $show(j ));$skip(12); val res$1 = 
  j.isEmpty;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(32); 
  val k = List.fill(3)("hello");System.out.println("""k  : List[String] = """ + $show(k ));$skip(20); 
  var l = a.reverse;System.out.println("""l  : List[Int] = """ + $show(l ));$skip(16); val res$2 = 
  a.contains(3);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(36); 
  
  
  // 遍历
   a.foreach(println);$skip(100); 
  // Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法。
	  val it = Iterator("Baidu", "Google", "Runoob", "Taobao");System.out.println("""it  : Iterator[String] = """ + $show(it ));$skip(22); 
	  var n = a.iterator;System.out.println("""n  : Iterator[Int] = """ + $show(n ));$skip(35); 
	  println("the max is:" + n.max );$skip(46); 
	  while(n.hasNext){
	  	println(n.next)
	  };$skip(41); val res$3 = 
	  
    // 高阶函数
   a.filter(s => s > 2 );System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(19); val res$4 = 
   a.filter(_ > 2);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(23); val res$5 = 
  "99 Red Ball".toList;System.out.println("""res5: List[Char] = """ + $show(res$5));$skip(57); val res$6 = 
	 "99 Red Ball".toList.filter(x => Character.isDigit(x));System.out.println("""res6: List[Char] = """ + $show(res$6));$skip(49); val res$7 = 
   "99 Red Ball".toList.takeWhile(x => x != 'B');System.out.println("""res7: List[Char] = """ + $show(res$7));$skip(59); 
	 
	 //通过给定的方法将所有元素重新计算
	 var biga =  a.map(x => x + 1000);System.out.println("""biga  : List[Int] = """ + $show(biga ));$skip(29); 
	 var big2 = a.map(_ + 1000);System.out.println("""big2  : List[Int] = """ + $show(big2 ));$skip(25); val res$8 = 
	 k.map(_.toUpperCase());System.out.println("""res8: List[String] = """ + $show(res$8));$skip(40); val res$9 = 
	 h.map(x => x.filter(x => x % 2 == 0));System.out.println("""res9: List[List[Int]] = """ + $show(res$9));$skip(20); val res$10 = 
	 h.flatMap(x => x);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(44); val res$11 = 
	 h.flatMap(x => x.filter(x => x % 2 == 0));System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(43); val res$12 = 
	 h.flatMap(_.filter(_ % 2 == 0));System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(31); val res$13 =  // 返回的是x
	 a.reduceLeft((x,y) => x + y);System.out.println("""res13: Int = """ + $show(res$13));$skip(22); val res$14 = 
	 a.reduceLeft(_ + _);System.out.println("""res14: Int = """ + $show(res$14));$skip(78); val res$15 = 
	 // 0 + a(1) + a(2) + ...
	 a.foldLeft(0)((x, y) => x + y);System.out.println("""res15: Int = """ + $show(res$15));$skip(23); val res$16 = // 返回的是x,即输入的初始值类型
	 a.foldLeft(0)(_ + _);System.out.println("""res16: Int = """ + $show(res$16));$skip(50); val res$17 = 
	 // 1 * a(1) * a(2) * ...
	 a.foldLeft(1)(_ * _);System.out.println("""res17: Int = """ + $show(res$17));$skip(75); val res$18 = 
	 // a(1)*a(1) + a(2)*a(2) + a(3)*a(3)
	 a.foldLeft(0)((z,v) => z + v * v);System.out.println("""res18: Int = """ + $show(res$18));$skip(138); 
	 
	 //求List的元素个数，元素和，元素平方和
	 def sumSq(l : List[Int]) : (Int, Int, Int)= l.foldLeft(0,0,0)((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v));System.out.println("""sumSq: (l: List[Int])(Int, Int, Int)""");$skip(13); val res$19 = 
    sumSq(a);System.out.println("""res19: (Int, Int, Int) = """ + $show(res$19))}
}
