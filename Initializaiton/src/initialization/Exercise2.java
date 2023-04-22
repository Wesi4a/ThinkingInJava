package initialization;

public class Exercise2 {

	String s1 = "at definition";
	String s2;
	 public Exercise2(String s2i) { 
		 s2 = s2i; 
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 si = new Exercise2("Initialization at constructor");
		System.out.println("si.s1 " + si.s1);
		System.out.println("si.s2 " + si.s2);
		//The s1 field is initialized before the constructor is entered; technically, so is the 
		//s2 field, which is set to null as the object is created. The more flexible s2 field 
		//lets you choose what value to give it when you call the constructor, whereas s1
		//always has the same value.
	}

}
