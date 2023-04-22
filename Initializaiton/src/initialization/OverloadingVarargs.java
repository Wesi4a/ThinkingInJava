package initialization;

public class OverloadingVarargs {
	static void f(Character ...args) {
		System.out.print("First");
		for(Character c : args)
			System.out.print(" "+c );
		System.out.println();
	}
	static void f(Integer ...args) {
		System.out.print("Second");
		for(Integer i :args)
			System.out.print(" "+i);
		System.out.println();
	}
	static void f(Long ...ars) {
		System.out.print("Third");
	}	
	public static void main(String[]ars) {
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
	}
}
