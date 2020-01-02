package products;

public class HouseholdCleaner extends HouseholdProduct {
	String intendedpurpose;

	public HouseholdCleaner(String name, double price, double discount, double weight, double washes,
			String intendedpurpose) {
		super(name, price, discount, weight, washes);

		this.intendedpurpose = intendedpurpose;
	}

	public String getAllInfo() {
		return super.getAllInfo() + "\n intendedpurpose" + intendedpurpose;
	}

	public boolean equals(Object o) {
		if (o instanceof HouseholdCleaner && super.equals(o)) {
			HouseholdCleaner d = (HouseholdCleaner) o;
			return intendedpurpose.equals(d.intendedpurpose);
		} else {
			return false;
		}
	}

}
