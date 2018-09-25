package masterclass.BillyBurgers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger burger = new Burger("zemla", "hovadzie");
		Burger burger2 = new HealthyBurger("kuracie");
		Burger burger3 = new DeluxeBurger("sladka zemla", "hovadzie", "Cola zero");

		burger.addExtra("lettuce", 0.3);
		burger.addExtra("tomato", 0.4);


		burger.showPrice();

		burger2.addExtra("lettuce", 0.3);
		burger2.addExtra("tomato", 0.4);
		burger2.addExtra("carrot", 0.2);
		burger2.addExtra("cabbage", 0.1);
		burger2.addExtra("pickles", 0.2);
		burger2.addExtra("bacon", 0.8);
		burger2.addExtra("ketchup", 0.3);

		burger2.showPrice();

		burger3.addExtra("lettuce", 0.3);
		burger3.showPrice();
	}

}
