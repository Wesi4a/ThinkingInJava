package initialization;

public class Exercise4 {
	
	Exercise4() {
		System.out.println("Default");
	}
	Exercise4(String s ){
		System.out.print("String const, ");
		System.out.println(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise4();
		new Exercise4("Overloaded");
	}

}
