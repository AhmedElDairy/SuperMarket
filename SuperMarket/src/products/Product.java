package products;

public class Product {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	private double discount;

	public Product(String name, double price, double discount) {

		this.name = name;
		this.price = price;
		this.discount = discount;

	}

	public Product() {

	}

	public final double getActualPrice() {

		return (price - (price * (discount / 100)));
	}

	public final String toString() {

		return (name + " " + discount + "%" + " " + getActualPrice());

	}

	public String getAllInfo() {

		return ("Name:\t" + name + "\n Price :\t " + price + "LE" + "\n Discount:\t" + discount + "%");

	}

	public boolean equals(Object o) {

		if (o instanceof Product) {
			Product d = (Product) o;
			return (name.equals(d.name) && price == d.price && discount == d.discount);

		} else {

			return false;
		}

	}

}
