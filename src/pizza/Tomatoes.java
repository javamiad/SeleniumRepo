package pizza;

public class Tomatoes extends PizzaToppings{
	
	public Tomatoes(Pizza pizza){
		this.pizza=pizza;
	}

	@Override
	public String Description() {
		return "Tomatoes";
	}

	@Override
	public double cost() {
		return pizza.cost()+1.0;
	}
	

}
