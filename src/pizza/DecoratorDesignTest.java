package pizza;

public class DecoratorDesignTest {
	
	public static void main(String[] args) {
		Pizza PanPizza = new PanPizza();
		//
		PanPizza = new Tomatoes(PanPizza);
		PanPizza = new Onions(PanPizza);
		PanPizza = new Cheese(PanPizza);
		
		System.out.println();
	}

}
