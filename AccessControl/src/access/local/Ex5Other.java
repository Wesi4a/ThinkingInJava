package access.local;

public class Ex5Other {
	public Ex5Other(){
		Ex5 test = new Ex5();
		test.a = 1;
		//test.b cant acces because it is private
		test.c = 3;
		test.d = 4;
		test.f1();
		//test.f2 private
		test.f3();
		test.f4();
	}

}
