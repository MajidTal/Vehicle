package Vehiclesuc;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		Vehicle ve = new Vehicle();
         System.out.println("Enter the published year of a car");
         int year = sc.nextInt();
         ve.setYear(year);
         
         Car ca =new Car();
          ca.setNumberOfDoors(4);
          
          Truck tr = new Truck();
          tr.setCapacityInTons(2000);
          tr.setNumberOfAxles(4);
	     
          System.out.println("The number of the doors are: " + ca.getNumberOfDoors()); 
          System.out.println("The CapacityInTons are: " + tr.getCapacityInTons()); 
          System.out.println("The NumberOfAxles are: " + tr.getNumberOfAxles()); 


           
	}
	
}

