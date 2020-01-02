package products;

public class DairyProduct extends GroceryProduct {

	String Fat;

	public DairyProduct(String name, double price, double discount, double quantity, String unit, double calories,
			String Fat) {
		super(name, price, discount, quantity, unit, calories);
		this.Fat = Fat;
	}

	public String getAllInfo() {

		return super.getAllInfo() + " /n the Fat Level is: " + Fat;

	}

	public boolean equals(Object o) {
		if (o instanceof DairyProduct && super.equals(o)) {
			DairyProduct d = (DairyProduct) o;
			return Fat == d.Fat;
		} else {
			return false;
		}
	}
}