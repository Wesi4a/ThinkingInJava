package initialization;

class Dog2{
	public void bark(int i,double d ) {
		System.out.println("int,double bark");
	}
	public void bark(double d,int i ) {
		System.out.println("double,int bark");
	}
}


public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog = new Dog2();
		dog.bark(1.2, 1);
		dog.bark(1, 2.5);
	}

}
