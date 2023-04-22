package initialization;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test[] array = new Test[5];
		for(int i = 0;i< array.length;i++) {
			array[i] = new Test(Integer.toString(i));
		}
	}

}
