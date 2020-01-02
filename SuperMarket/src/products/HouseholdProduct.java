package products;

public class HouseholdProduct extends Product {

	private double washes;
	private double weight;

	public HouseholdProduct() {
		super();

	}

	public HouseholdProduct(String name, double price, double discount, double washes, double weight) {

		super(name, price, discount);
		this.washes = washes;
		this.weight = weight;
	}

	public String getAllInfo() {

		return super.getAllInfo() + ("No of washes is: " + washes + "weight is :" + weight);

	}

	public boolean equals(Object o) {
		if (o instanceof HouseholdProduct && super.equals(o)) {

			HouseholdProduct d = (HouseholdProduct) o;

			return washes == d.washes && weight == d.weight;
		} else {
			return false;
		}
	}
}