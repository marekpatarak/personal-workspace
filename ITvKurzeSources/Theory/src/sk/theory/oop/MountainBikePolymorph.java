package sk.theory.oop;

public class MountainBikePolymorph extends BikePolymorph {
	private String suspension;

	public MountainBikePolymorph(int startCadence, int startSpeed, int startGear, String suspensionType) {
		super(startCadence, startSpeed, startGear);
		this.setSuspension(suspensionType);
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspensionType) {
		this.suspension = suspensionType;
	}

	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("The " + "MountainBike has a" + getSuspension() + " suspension.");
	}
}
