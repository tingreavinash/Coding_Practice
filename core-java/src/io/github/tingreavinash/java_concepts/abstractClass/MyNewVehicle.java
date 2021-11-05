package io.github.tingreavinash.java_concepts.abstractClass;

interface interf{
	void I_method();
}

abstract class Vehicle implements interf{
	abstract void shift_gear(int gear);
	
	int default_speed = 20;
	int speed(int increment) {
		return increment+default_speed;
	}
	
}

class car extends Vehicle{

	@Override
	void shift_gear(int gear) {
		System.out.println("Car gear changed to : "+gear);
		int speed = super.speed(gear*20);
		System.out.println("New speed is : "+speed);
	}

	@Override
	public void I_method() {

	}


	
}

class bike extends Vehicle{
	int gear;
	@Override
	void shift_gear(int gear) {
		this.gear = gear;
		System.out.println("Car gear changed to :"+gear);
		int speed = super.speed(gear*10);
		System.out.println("New speed is : "+speed);
	}
	@Override
	public void I_method() {

	}

	
}

public class MyNewVehicle{
	public static void main(String[] args) {
		Vehicle bike = new bike();
		Vehicle car = new car();
 		bike.shift_gear(3);
		car.shift_gear(3);
		
		
	}
}
