package pizza;

public class PanPizza implements Pizza{

	@Override
	public String Description() {
		return "Pan Pizza";
	}

	@Override
	public double cost() {
		return 10.0;
	}
	

}
