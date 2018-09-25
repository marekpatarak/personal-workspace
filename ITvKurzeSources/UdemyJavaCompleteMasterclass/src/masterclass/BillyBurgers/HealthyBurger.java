package masterclass.BillyBurgers;

public class HealthyBurger extends Burger {

	public HealthyBurger(String meat) {
		super("Brown Rye Bread Roll", meat);
		super.extras = new Addition[6];
		super.extrasAdded = 0;
	}
}
