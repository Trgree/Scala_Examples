package org.ace

object For_examples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  var l = List("ace", "trgree", "lsj");System.out.println("""l  : List[String] = """ + $show(l ));$skip(36); 

  for (
    s <- l
  ) println(s);$skip(29); 
  for(i <- l){
  	println(i)
  };$skip(51); 
   for(i <-0 until l.length){
  	println(l(i))
  };$skip(76); 
  
  for (
    s <- l
    if (s.length() == 3) // filter
  ) println(s);$skip(117); 
  var upper_for = for {
    s <- l
    s1 = s.toUpperCase()
    if (s1 != "")
  } yield (s1);System.out.println("""upper_for  : List[String] = """ + $show(upper_for ));$skip(37);  // 导出，把s1放在新的collection
  
  for(i <- 1 to 3){
  	println(i)
  };$skip(45); 
  
   for(i <- 1 until 3){
  	println(i)}
  }
  
 
  
}
