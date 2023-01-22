
package Vehiclesuc;

public class Vehicle {
	public String make;
	public int model;
	public int year;
	public String color;
	public int numberOfWheels;
	public int weight;

	public void start() {
		System.out.println("Vehicle started.");

	}

	public void stop() {
		System.out.println("Vehicle stopped");
	}

	public void drive(int numberOfMiles) {
		System.out.println("Vehicle driven " +numberOfMiles +" miles");
	}

	public void honk() {
		System.out.println("Honk Honk!");
	}

}
