package initialization;

public class Exercise8 {
	public void a() {
		b();
		this.b();
	}
	public void b() {
		System.out.println("b() called");
	}
	public static void main(String ars[]) {
		Exercise8 exercise8 = new Exercise8();
		exercise8.a();
	}
}
