package com.yedam.java_ch02_01;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		}
		vehicle.run();
		
		
		
	}

}
