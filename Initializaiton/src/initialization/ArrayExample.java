package initialization;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4,5};
		
		int [] a2;
		//a2 is assigned later
		a2 = a1;
		
		for(int i=0;i< a2.length;i++) 
			a2[i] = a2[i]+1;
		for(int i =0;i<a1.length;i++)
			System.out.println("a1[" + i + "] = " + a1[i]);
		//Since a2 and a1 are initialized to the same array the changes affect both of the arrays
	}

}
