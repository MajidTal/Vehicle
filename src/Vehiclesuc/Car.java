
package Vehiclesuc;

public class Car extends Vehicle {

	private int numberOfDoors;

	private void openTrunk() {
		System.out.println("Trunk opened.");
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
