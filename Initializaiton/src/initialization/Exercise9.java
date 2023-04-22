package initialization;

public class Exercise9 {

	public Exercise9(String s) {
		System.out.println("s="+s);
	}
	public Exercise9(int i) {
		this("i="+i);
	}
	public static void main(String args[]) {
		
		 new Exercise9("Gosho");
		 new Exercise9(17);
	}
	
}
