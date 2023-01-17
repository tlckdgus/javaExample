package com.yedam.java_ch02_01;

public class DriverExampl {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());

	}

}
