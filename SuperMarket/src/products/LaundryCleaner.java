package products;

public class LaundryCleaner extends HouseholdProduct {

	private String form;

	public LaundryCleaner(String name, double price, double discount, double weight, double washes, String form) {

		super(name, price, discount, weight, washes);
		this.form = form;
	}

	public String getAllInfo() {

		return super.getAllInfo() + ("/n the form is : " + form);
	}

	public boolean equals(Object o) {
		if (o instanceof LaundryCleaner && super.equals(o)) {
			LaundryCleaner d = (LaundryCleaner) o;
			return form == d.form;
		} else {
			return false;
		}
	}
}
