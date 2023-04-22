package access.local;

class Man{
	protected int a;
}


public class Ex6 {
	public static void main(String args[]) {
		Man mani = new Man();
		mani.a = 15;
		System.out.println("mani.a = "+mani.a);
		//This show that protected also mean package access
		//You can always access protected fields within the same package.
		
	}
}


