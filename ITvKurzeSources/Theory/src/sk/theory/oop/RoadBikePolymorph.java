package sk.theory.oop;

public class RoadBikePolymorph extends BikePolymorph {
	// In millimeters (mm)
	private int tireWidth;

	public RoadBikePolymorph(int startCadence, int startSpeed, int startGear, int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(newTireWidth);
	}

	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
	}
}
