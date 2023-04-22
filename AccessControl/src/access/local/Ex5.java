package access.local;

public class Ex5 {
	public int a ;
	private int b;
	protected int c;
	int d;//package access
	
	public void f1() {
		
	}
	private void f2() {
		
	}
	protected void f3() {
		
	}
	void f4() {
		//package access
	}
	
	public static void main(String args[]) {
		Ex5 test = new Ex5();
		
		test.a = 1;
		test.b = 2;
		test.c = 3;
		test.d = 4;
		test.f1();
		test.f2();
		test.f3();
		test.f4();
	}
}
