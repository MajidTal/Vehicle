
package Vehiclesuc;

public class Vehicle extends Engine implements Honkable {
	private String make;
	private int model;
	private int year;
	private String color;
	private int numberOfWheels;
	private int weight;

	public void start() {
		System.out.println("Vehicle started.");
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void stop() {
		System.out.println("Vehicle stopped");
	}
	public void drive(int numberOfMiles) {
		System.out.println("Vehicle driven " + numberOfMiles + " miles");
	}
	public void honk() {
		System.out.println("Honk Honk!");
	}
	@Override
	public void startEngine() {
		
		
	}
}
