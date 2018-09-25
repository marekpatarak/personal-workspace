package sk.theory.oop;

public class TestBikesPolymorph {

	public static void main(String[] args) {
		BikePolymorph bike01, bike02, bike03;

		bike01 = new BikePolymorph(20, 10, 1);
		bike02 = new MountainBikePolymorph(20, 10, 5, " Dual");
		bike03 = new RoadBikePolymorph(40, 20, 8, 23);

		bike01.printDescription();
		bike02.printDescription();
		bike03.printDescription();
	}

}
