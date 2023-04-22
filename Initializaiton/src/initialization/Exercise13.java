//: initialization/E13_LeftToReader.java 
/****************** Exercise 13 ***************** 
 * Comment the line marked (1) in 
 * ExplicitStatic.java and verify that the static 
 * initialization clause is not called. Now 
 * uncomment one of the lines marked (2) and 
 * verify that the static initialization clause 
 * is called. Finally, uncomment the other line marked 
 * (2) and verify that static initialization 
 * occurs only once. 
 ************************************************/ 
package initialization;



	class Cup{
		Cup(int marker){
			System.out.println("Cup(" + marker + ")");
		}
		void  f(int marker) {
			System.out.println("f(" + marker + ")");
		}
	}
	
	class Cups{
		static Cup cup1;
		static Cup cup2;
		static {
			cup1 = new Cup(1);
			cup2  = new Cup(2);
		}
		Cups(){
			System.out.println("Cups()");
		}
	}
	public class Exercise13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		Cups.cup1.f(99);	
	}
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
	

}
