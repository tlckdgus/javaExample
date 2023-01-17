package com.yedam.java_ch02_02;

public interface RemoteControl {
	// 상수
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;  //상수 안에는 static final이 있어야한다,
	                           //아니면 값을 입력
	                           //인터페이스는 필드=상수, 메소드는=추상메소드
	
	
	//추상 메소드
	//인터페이스 에서는 default값을 입력해야한다
	//추상메소드에서는 실행 블록이 있으면 안됨
	
	//실행블록 {} 없으면 사용가능
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

}
