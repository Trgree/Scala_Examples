package org.ace

object other_examples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 
	
	
	def str2int(str:String, defVal:Int) = {
	  try{
	  	Integer.parseInt(str)
	  } catch{
	  	case ex: Exception => defVal
	  } finally{
	  	println("always be printed")
	  }
  };System.out.println("""str2int: (str: String, defVal: Int)Int""");$skip(20); val res$0 = 
  
  str2int("2",1);System.out.println("""res0: Int = """ + $show(res$0));$skip(128); 
  var result_try = try {
  	Integer.parseInt("dog")
  } catch{
  	case _ => 0
  } finally {
  	println("always be printed")
  };System.out.println("""result_try  : Int = """ + $show(result_try ));$skip(14); 
   val code=4;System.out.println("""code  : Int = """ + $show(code ));$skip(128); 
   var result_match = code match {
   		case 1 => "one"
   		case 2 => "two"
   		case 3 => "three"
   		case _ => "other"
   };System.out.println("""result_match  : String = """ + $show(result_match ))}
}
