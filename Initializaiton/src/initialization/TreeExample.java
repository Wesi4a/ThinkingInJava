package initialization;

public class TreeExample {
	
	//without static it gives error
	//Why we use static?
	//By making the Tree class static, you are essentially telling the compiler that it is 
	//not associated with any instance of the outer class and can be instantiated
	//without an instance of the outer class. This makes it possible to use the 
	//Tree class in a static context such as the main method.

	//So in summary, when you make the Tree class static, 
	//it can be used in a static context and does not require an instance of
	//the outer class to be created before it can be instantiated.
	 static class Tree{
		int height;
		Tree(){
			System.out.println("Planting a seeding");
			height = 0;
		}
		Tree(int initialHeight){
			height = initialHeight;
			System.out.println("Creating new Trtee that is   " + height + "feet tall");
		}
		void info() {
			System.out.println("Tree is "+ height+"feet tall");
		}
		void info(String s) {
			System.out.println(s + ": Tree is "+ height+"feet tall");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("OVerloaded method");
			
			
		}
		new Tree();
	}

}
