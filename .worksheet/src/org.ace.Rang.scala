package org.ace

object Rang {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); val res$0 = 
	1 to 10;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(18); 
  val a = 1 to 10;System.out.println("""a  : scala.collection.immutable.Range.Inclusive = """ + $show(a ));$skip(21); 
  val b = 1 until 10;System.out.println("""b  : scala.collection.immutable.Range = """ + $show(b ));$skip(23); 
  val c = 1 to 10 by 2;System.out.println("""c  : scala.collection.immutable.Range = """ + $show(c ));$skip(19); 
  val d = a.toList;System.out.println("""d  : List[Int] = """ + $show(d ));$skip(51); 
  
  
  var z = Array("Runoob", "Baidu", "Google");System.out.println("""z  : Array[String] = """ + $show(z ));$skip(7); val res$1 = 
  z(1);System.out.println("""res1: String = """ + $show(res$1));$skip(71); 
  
  // Stream is a lazy List
  val e = 1 #:: 2 #:: 3 #:: Stream.empty;System.out.println("""e  : scala.collection.immutable.Stream[Int] = """ + $show(e ));$skip(33); 
  val f = (1 to 100000).toStream;System.out.println("""f  : scala.collection.immutable.Stream[Int] = """ + $show(f ));$skip(9); val res$2 = 
  f.head;System.out.println("""res2: Int = """ + $show(res$2));$skip(9); val res$3 = 
  f.tail;System.out.println("""res3: scala.collection.immutable.Stream[Int] = """ + $show(res$3))}
}
