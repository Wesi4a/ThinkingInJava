package initialization;

public class Exercise14 {

		static String s1 = "Initializited at defintion";
		static String s2;
		static {
			s2="Initializted in block";
		}
			
	public static void main(String[] args) {	
		System.out.println("s1==" + s1);
		System.out.println("s2==" + s2);
	}

}
