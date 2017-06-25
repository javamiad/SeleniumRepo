package beverage;

public class DecorationTest {
	
	 public static void main(String[] args) {
		
		 Beverage milkWith2Sugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		 System.out.println(milkWith2Sugars.getDescription());
	}

}
