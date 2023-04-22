package initialization;

public class Exercise19 {

	static void printStrings(String ...strs) {
		for(String s : strs)
			System.out.println(s);
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//Exercise 19: (2) Write a method that takes a vararg String array. 
		//Verify that you can 
		//pass either a comma-separated list of Strings or a String[] 
		//into this method.
		printStrings("Goshoo","Pesho","Tosho");
		printStrings(
				new String[] {
						"Gosho","Tosho"
				}
				);
	}

}
