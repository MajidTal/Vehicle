package Vehiclesuc;

public class ElectricVehicle extends Vehicle {

	public int batteryCapacity;
	public int chargeLevel;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	@Override
	public void drive(int numberOfMiles) {

		System.out.println("Electric vehicle driven " + numberOfMiles + " miles");
	}

	public void charge() {
		chargeLevel++;
	}
}
