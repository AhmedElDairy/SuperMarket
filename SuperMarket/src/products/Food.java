package products;

public class Food extends GroceryProduct {

	String type;

	public Food(String name, double price, double discount, double d, String unit, double calories, String type) {
		super(name, price, discount, d, unit, calories);
		this.type = type;
	}

	public String getAllInfo() {

		return super.getAllInfo() + ("/n the type is: " + type);

	}

	public boolean equals(Object o) {
		if (o instanceof Food && super.equals(o)) {
			Food d = (Food) o;
			return type == d.type;
		} else {
			return false;
		}
	}

}
