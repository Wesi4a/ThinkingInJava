package access;

import access.connection.*;

public class Ex8ConnectionMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c =  ConnectionManager.getConnection();
		while(c != null) {
			System.out.println(c);
			c.doSomething();
			c = ConnectionManager.getConnection();
		}
	}

}
