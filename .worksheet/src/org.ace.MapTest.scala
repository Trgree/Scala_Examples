package org.ace

object MapTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  var m = Map(1 ->"a",2 -> "b");System.out.println("""m  : scala.collection.immutable.Map[Int,String] = """ + $show(m ));$skip(32); 
  var m2 = Map((3,"c"),(4,"d"));System.out.println("""m2  : scala.collection.immutable.Map[Int,String] = """ + $show(m2 ));$skip(7); val res$0 = 
  m(1);System.out.println("""res0: String = """ + $show(res$0));$skip(16); val res$1 = 
  m.contains(2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(9); val res$2 = 
  m.keys;System.out.println("""res2: Iterable[Int] = """ + $show(res$2));$skip(11); val res$3 = 
  m.values;System.out.println("""res3: Iterable[String] = """ + $show(res$3));$skip(27); val res$4 = 
  m + (4 -> "e");System.out.println("""res4: scala.collection.immutable.Map[Int,String] = """ + $show(res$4));$skip(39);   // 新的map
                  
 var m3 =  m - (1);System.out.println("""m3  : scala.collection.immutable.Map[Int,String] = """ + $show(m3 ));$skip(18); val res$5 = 
 // + 多个
 m ++ m2;System.out.println("""res5: scala.collection.immutable.Map[Int,String] = """ + $show(res$5));$skip(28); val res$6 = 
 m ++ List(6->"f",7 -> "g");System.out.println("""res6: scala.collection.immutable.Map[Int,String] = """ + $show(res$6));$skip(26); val res$7 = 
 // -多个
 m -- List(1,2,3);System.out.println("""res7: scala.collection.immutable.Map[Int,String] = """ + $show(res$7));$skip(12); 
 println(m)}
}
