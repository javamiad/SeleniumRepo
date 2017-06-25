package pizza;

public class Onions extends PizzaToppings{
	
	public Onions(Pizza pizza){
		this.pizza=pizza;
	}

	@Override
	public String Description() {
		return "Onions";
	}

	@Override
	public double cost() {
		return pizza.cost()+1.5;
	}
	

}
