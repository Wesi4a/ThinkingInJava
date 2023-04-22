package initialization;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a ;
		Random rand = new Random();
		a = new int [rand.nextInt(20)];
		//The size of the array is randomly 
		System.out.println("lenght of a: " + a.length);
		System.out.println("empty: "+Arrays.toString(a));
		//int his way the result is empty string 
		
		for(int i =0;i<a.length;i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		//with for loop we indicate to which number the string will be full with
	}

}
