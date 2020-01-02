package products;

public class DishwasherProduct extends HouseholdProduct {
	private String type;

	public DishwasherProduct() {
	  	super();
	}

	public DishwasherProduct(String name, double price, double d, double e, double f, String type) {
		super(name, price, d, e, f);

		this.type = type;
	}

	public String getAllInfo() {
		return super.getAllInfo() + "\n type" + type;
	}

	public boolean equals(Object o) {
		if (o instanceof DishwasherProduct && super.equals(o)) {
			DishwasherProduct d = (DishwasherProduct) o;
			return type.equals(d.type);
		} else {
			return false;
		}
	}

}
