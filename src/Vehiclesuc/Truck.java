
package Vehiclesuc;

public class Truck extends Vehicle {
	public int numberOfAxles;
	public int capacityInTons;

	public void load(int weight) {
		System.out.println("Loaded " + weight + " tons.");
	}
}
