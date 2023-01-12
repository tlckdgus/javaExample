package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소가 같다");
		}else {
			System.out.println("strVal1과 strVal2는 메모리 주소가 다르다");
		}

		if (strVal1.equals(strVal2)) {
			System.out.println("데이터 동일");
		}else {
			System.out.println("데이터 다름");
		}
		
	    //new 연산자를 활용	
		//힙에 데이터를 넣을수있는 새로운 공간을 만든다
	
		String strVal3 = new String("yedam"); //새로운 공간(100번지)
		String strVal4 = new String("yedam"); //새로운 공간(200번지)
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조가 같다");
		}else {
			System.out.println("strVal3과 strVal4는 참조가 다르다");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("데이터 동일");
		}else {
			System.out.println("데이터 다름");
		}
		
		//String strVal1 = "yedam";
		//String strVal4 = new String("yedam");
	
		if(strVal1 == strVal3) {
			System.out.println("strVal3과 strVal4는 참조가 같다");
		}else {
			System.out.println("strVal3과 strVal4는 참조가 다르다");
		}		
		//다르다
		if (strVal1.equals(strVal3)) {
			System.out.println("데이터 동일");
		}else {
			System.out.println("데이터 다름");
		}
		//같다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
