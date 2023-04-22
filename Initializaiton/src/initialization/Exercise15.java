package initialization;



public class Exercise15 {
	String s; 
	 { s = "'instance initialization'"; } 
	 public Exercise15() { 
	 System.out.println("Default constructor; s = " + s); 
	 } 
	 public Exercise15(int i) { 
	 System.out.println("int constructor; s = " + s); 
	 } 
	 public static void main(String args[]) { 
	 new Exercise15(); 
	 new Exercise15(1); 
	 } 
}
