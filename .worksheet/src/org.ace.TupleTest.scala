package org.ace

object TupleTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); val res$0 = 
  (1,2);System.out.println("""res0: (Int, Int) = """ + $show(res$0));$skip(20); val res$1 =      // Pair
  1 -> 2;System.out.println("""res1: (Int, Int) = """ + $show(res$1));$skip(32);     // Pair
 var t =  (1,"ace","Math",99.5);System.out.println("""t  : (Int, String, String, Double) = """ + $show(t ));$skip(6); val res$2 = 
 t._1;System.out.println("""res2: Int = """ + $show(res$2));$skip(6); val res$3 = 
 t._2;System.out.println("""res3: String = """ + $show(res$3));$skip(33); 
 var b = (1,"ace",("Math",99.5));System.out.println("""b  : (Int, String, (String, Double)) = """ + $show(b ));$skip(9); val res$4 = 
 b._3._1;System.out.println("""res4: String = """ + $show(res$4))}
 
}
