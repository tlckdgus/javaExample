package com.yedam.jave_ch01_01;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();
		
		RemoteControl rc = tv;         //경우에 따라서 인터페이스에 집어넣어서 사용
		Searchable searchable = tv;
		
	}

}
