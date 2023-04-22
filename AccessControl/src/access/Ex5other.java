package access;

import access.local.Ex5;

public class Ex5other {
	public Ex5other(){
		Ex5 test = new Ex5();
		//ONLY THE PUBLIC HAS ACCESS WHEN THE DIRECTORY IS IN ANOTHER PACKAGE
		test.a = 1;
	//test.b cant acces because it is private
		//test.c = 3;
		//test.d = 4;
		test.f1();
		//test.f2 private
		//test.f3();
		//test.f4();
	}
}
