package Vehiclesuc;

public class Tester {

	public static void main(String[] args) {
        
		Vehicle ve = new Vehicle();
		
		ve.model=1688;
		ve.color="Red";
		ve.start();
		ve.drive(200);
		
		
		Car c = new Car();
		c.numberOfDoors=4;
		System.out.println("the car has " + c.numberOfDoors + " doors");
		c.openTrunk();
		
		Truck tr =new Truck();
		tr.capacityInTons=2000;
		tr.numberOfAxles=2;
		tr.load(2000);
	}

}
