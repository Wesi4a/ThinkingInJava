package initialization;


class Car{
	boolean filled = true;
	Car(boolean filled){
		filled = filled;
	}
	void empty() {
		filled = false;	
	}
	protected void finalize() {
		if(filled)
			System.out.println("Error");
	}
}

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car(true);
		bmw.empty();;
		new Car(true);
		System.gc();
	}

}
