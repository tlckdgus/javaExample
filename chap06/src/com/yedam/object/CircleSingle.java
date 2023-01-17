package com.yedam.object;


public class CircleSingle {
	//싱글톤
	static CircleSingle instance = new CircleSingle();
	static CircleSingle getInstance(){
		return instance;
	}
	
	static final double pi = 3.14;
	double r;	
	
	private CircleSingle(){
	}
	
	double area() {
		double result = pi * r * r;
		return result;
	}
}
