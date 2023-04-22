package initialization;

enum PaperCurrency{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(PaperCurrency s : PaperCurrency.values()) 
			System.out.println(s + ", ordinal " + s.ordinal());
	}

}
