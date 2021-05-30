package com.avinash.InterfaceExample;

interface Vehicle {
	public void start();

	public void stop();
	
	//public void newMethod();
	
	default void myNewMethod() {
		System.out.println("Hello from default method");
	}
	
	public static void myStaticMethod() {
		System.out.println("Hello from interface static method");
	}
}

class Car implements Vehicle {
	/*
	@Override
	public void myNewMethod() {
		System.out.println("Default method overridden by Car");
	}
	*/
	
	@Override
	public void start() {
		System.out.println("Starting Car Engine");

	}

	@Override
	public void stop() {
		System.out.println("Stopping Car Engine");

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Destroying car 0bject ....");
	}


	
	
}

class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Starting Truck Engine");

	}

	@Override
	public void stop() {
		System.out.println("Stopping Truck Engine");

	}

}

class Train implements Vehicle {

	@Override
	public void start() {
		System.out.println("Starting Train Engine");

	}

	@Override
	public void stop() {
		System.out.println("Stopping Train Engine");

	}

	
}

public class Starter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		Vehicle train = new Train();
		
		car.myNewMethod();
		Vehicle.myStaticMethod();
		
		
		Car c = new Car();
		c= null;
		System.out.println();
		System.out.println(car.toString());
		System.out.println(car.equals(truck));
		System.out.println(car.getClass());
		
		startVehicle(car);
		startVehicle(truck);
		stopVehicle(truck);
		stopVehicle(car);

		startVehicle(train);
		stopVehicle(train);
		
		
		
		System.gc();
	}

	public static void startVehicle(Vehicle v) {
		v.start();

	}

	public static void stopVehicle(Vehicle v) {
		v.stop();

	}

}
