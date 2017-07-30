object worksheet_ace {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(12); 
  var a = 3;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
  val b = 4;System.out.println("""b  : Int = """ + $show(b ));$skip(13); 
  println(a);$skip(15); 
  lazy val c=a;System.out.println("""c: => Int = <lazy>""");$skip(3); val res$0 = 
	c;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
  a + a;System.out.println("""res1: Int = """ + $show(res$1));$skip(14); 
  var d:Int=4;System.out.println("""d  : Int = """ + $show(d ));$skip(8); val res$2 = 
  c + a;System.out.println("""res2: Int = """ + $show(res$2));$skip(33); 
  var e:AnyRef = new String("a");System.out.println("""e  : AnyRef = """ + $show(e ));$skip(38); 
  var f = new Integer(a);System.out.println("""f  : Integer = """ + $show(f ));$skip(17);  // java 引用类型
  var g:Long = c;System.out.println("""g  : Long = """ + $show(g ));$skip(13); 
  var h = ();System.out.println("""h  : Unit = """ + $show(h ));$skip(27); 
  var is:Unit = ();System.out.println("""is  : Unit = """ + $show(is ));$skip(38);  // Void
  def foo() = throw new Exception("");System.out.println("""foo: ()Nothing""");$skip(19); 
 	var name = "ace";System.out.println("""name  : String = """ + $show(name ));$skip(29); 
 	println(s"Hello ${name}!");$skip(59); 
 	
 	
 	// call by value
 	def test1(x:Int, y:Int) = x * y;System.out.println("""test1: (x: Int, y: Int)Int""");$skip(60); 
 	// call by name
 	def test2(x: => Int, y: => Int) = x * y;System.out.println("""test2: (x: => Int, y: => Int)Int""");$skip(32); val res$3 = 
 	test1(3+2,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(30); val res$4 =   // 会先算出3+2，再传给x
 	test2(3+2,3)  // 相当于(3+2)*3;System.out.println("""res4: Int = """ + $show(res$4))}
}
