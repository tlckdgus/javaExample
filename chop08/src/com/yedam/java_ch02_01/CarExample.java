package com.yedam.java_ch02_01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.backRightTire = new KumhoTire();
		
		myCar.run();
	}

}
