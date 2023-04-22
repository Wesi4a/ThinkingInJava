package initialization;

public class Exercise22 { 
	 static void describe(PaperCurrency pct) { 
	 System.out.println(pct + " has a portrait of "); 
	 switch(pct) { 
	 case ONE: System.out.println("Thomas Jefferson");
	 break;
	 case TWO: System.out.println("Thomas Jefferson");
	 break; 
	 case FIVE: System.out.println("Thomas Jefferson");
	 break; 
	 case TEN: System.out.println("Thomas Jefferson");
	 break; 
	 case TWENTY: System.out.println("Thomas Jefferson");
	 break; 
	 case FIFTY: System.out.println("Thomas Jefferson");
	 break; 
	 } 
	 } 
	
	 public static void main(String args[]) { 
		 for(PaperCurrency s : PaperCurrency.values()) 
		 describe(s); 
		 }
	}


