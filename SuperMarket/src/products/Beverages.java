package products;

public class Beverages extends GroceryProduct {

	String sugar;

	public Beverages(String name, double price, double discount, double d, String unit, double calories, String sugar) {
		super(name, price, discount, d, unit, calories);
		this.sugar = sugar;
	}

	public String getAllInfo() {

		return super.getAllInfo() + "/n  sugar level : " + this.sugar;

	}

	public boolean equals(Object o) {
		if (o instanceof Beverages && super.equals(o)) {
			Beverages d = (Beverages) o;
			return sugar == d.sugar;
		} else {
			return false;
		}
	}
}
