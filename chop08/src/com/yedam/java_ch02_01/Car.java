package com.yedam.java_ch02_01;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	public void run() {
		frontLeftTire.roll();
		frontLeftTire.roll();
		backLeftTire.roll();
		backLeftTire.roll();
	}
}
