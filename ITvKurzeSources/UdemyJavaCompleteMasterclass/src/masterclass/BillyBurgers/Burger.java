package masterclass.BillyBurgers;

public class Burger {
	public String rollType;
	public String meat;
	public int extrasAdded;
	public double basePrice = 5.5;
	Addition[] extras;

	public Burger(String rollType, String meat) {
		this.rollType = rollType;
		this.meat = meat;
		this.extras = new Addition[4];
		this.extrasAdded = 0;
	}

	public void addExtra(String extra, double price) {
		if (this.extrasAdded < (this.extras.length)) {
			System.out.println("Adding extra " + extra + ", price: " + price);
			this.extras[extrasAdded] = new Addition(extra, price);
			this.extrasAdded++;
		} else {
			System.out.println("Maximum extras added, cant add another extra");
		}
	}

	public void showPrice() {
		double grandTotal = this.basePrice;
		System.out.println(getClass().getSimpleName());
		System.out.println("Base price: " + this.basePrice);

		for (int i = 0; i < this.extras.length; i++) {
			if (this.extras[i] != null) {
				grandTotal += this.extras[i].price;
				System.out.println(this.extras[i].name + " " + this.extras[i].price);
			}

		}
		System.out.println("Grand total: " + grandTotal);

	}

}
