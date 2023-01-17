package com.yedam.object;

public class Student {
	
	//필드, 객체의 속성(정보,데이터)가 저장되는 부분
	//이름
	final String school ="예담" ;   //js const == 상수
	String name;
	int age;
	String schoolName;
	int kor;
	int eng;
	int math;
	
	//생성자, 객체 초기화(생성)할 때
	//어떠한 행동(생성자 안에 정의된)을 하고 객체를 생성해라.
	//기본 생성자 -> 생성하지 않아도 컴파일(실행) 자바에서 알아서 생성.
	//생성자 -> 매개변수, 객체 생성시 실행문 정의.
	Student(){
		//System.out.println("객체 생성중");
	}
	
	Student(String name, String school){
		this.name = name;
	}
	
	Student(int age){
		if(age>0)
			this.age = age;
		else
			this.age = 0;
	}
	
	Student(String name, int age){
		this(age);
		//this.age = age;
		this.name = name;
	}
	
	//메소드, 객체를 생성 후 기능을 사용할 때 정의 하는 부분
	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("다니고 있는 학교 : " + schoolName);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
	}
	
	
	
	
}
