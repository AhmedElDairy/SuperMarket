package products;

public class GroceryProduct extends Product {
	double quantity;
	String unit;
	double calories;

	public GroceryProduct(String name, double price, double discount, double quantity, String unit, double calories) {
		super(name, price, discount);
		this.quantity = quantity;
		this.calories = calories;
		this.unit = unit;

	}

	public String getAllInfo() {

		return super.getAllInfo() + ("/n the quantity is: " + quantity + "/n the calories are :" + calories + unit);

	}

	public boolean equals(Object o) {

		if (o instanceof GroceryProduct && super.equals(o)) {
			GroceryProduct d = (GroceryProduct) o;
			return (quantity == d.quantity && calories == d.calories && unit == d.unit);

		} else {

			return false;
		}

	}
}
