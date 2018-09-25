package masterclass.BillyBurgers;

public class DeluxeBurger extends Burger {

	public DeluxeBurger(String roll, String meat, String drink) {
		super(roll, meat);
		this.extras = new Addition[] { new Addition("Chips", 0.5), new Addition(drink, 0.5) };
		this.extrasAdded = 2;

	}

}
