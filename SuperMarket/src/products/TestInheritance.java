package products;

public class TestInheritance {
	public static void main(String[] args) {
		DairyProduct p1 = new DairyProduct("milk", 7.00, 10.0, 1.5, "liter", 1000, "skimmed");
		Beverages p2 = new Beverages("cola", 2.5, 10.0, 335, "ml", 1, "light");
		Food p3 = new Food("Burgers", 25, 10.0, 125, "grams", 1000, "meat");
		LaundryCleaner p4 = new LaundryCleaner("Persil", 25.0, 10, 2, 40, "powder");
		DishwasherProduct p5 = new DishwasherProduct("Persil", 25, 10, 2, 40, "salt");
		HouseholdCleaner p6 = new HouseholdCleaner("Persil", 20, 10, 2, 40, "glass");

		if ((p1 instanceof Product) && p1 instanceof GroceryProduct)
			System.out.println("Correct hierarchy for DairyProduct");
		else {
			if (!(p1 instanceof Product))
				System.out.println("Product should be a superclass of DairyProduct");
			if (!(p1 instanceof GroceryProduct))
				System.out.println("GrocceryProduct should be a superclass of DairyProduct");
		}
		if ((p2 instanceof Product) && p2 instanceof GroceryProduct)
			System.out.println("Correct hierarchy for Beverages");
		else {
			if (!(p2 instanceof Product))
				System.out.println("Product should be a superclass of Beverages");
			if (!(p2 instanceof GroceryProduct))
				System.out.println("GrocceryProduct should be a superclass of Beverages");
		}
		if ((p3 instanceof Product) && p3 instanceof GroceryProduct)
			System.out.println("Correct hierarchy for Food");
		else {
			if (!(p3 instanceof Product))
				System.out.println("Product should be a superclass of Food");
			if (!(p3 instanceof GroceryProduct))
				System.out.println("GrocceryProduct should be a superclass of Food");
		}
		if ((p4 instanceof Product) && p4 instanceof HouseholdProduct)
			System.out.println("Correct hierarchy for HouseholdCleaner");
		else {
			if (!(p4 instanceof Product))
				System.out.println("Product should be a superclass of HouseholdCleaner");
			if (!(p4 instanceof HouseholdProduct))
				System.out.println("HouseholdProduct should be a superclass of HouseholdCleaner");
		}
		if ((p5 instanceof Product) && p5 instanceof HouseholdProduct)
			System.out.println("Correct hierarchy for DishWasherProduct");
		else {
			if (!(p5 instanceof Product))
				System.out.println("Product should be a superclass of DishWasherProduct");
			if (!(p5 instanceof HouseholdProduct))
				System.out.println("HouseholdProduct should be a superclass of DishWasherProduct");
		}
		if ((p6 instanceof Product) && p6 instanceof HouseholdProduct)
			System.out.println("Correct hierarchy for Laundry");
		else {
			if (!(p6 instanceof Product))
				System.out.println("Product should be a superclass of Laundry");
			if (!(p6 instanceof HouseholdProduct))
				System.out.println("HouseholdProduct should be a superclass of Laundry");
		}
	}

}
