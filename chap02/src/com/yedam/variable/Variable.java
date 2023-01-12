package com.yedam.variable;

public class Variable {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//이스케이프 문자(console 출력 할 때)
		//String에서 사용
		//\t : tab만큼 벌려라
		//\n : enter
		//\r : 맨 앞줄로 이동 
		
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수
		//float, double
		
		//float
		float vqr1 = 3.14F;
		double var2 = 3.14;
		
		float var3 = 0.12345667890312123123f;
		double var4 = 0.1243675535345256545;
		
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		double var6 = 3e6;
		float  var7 = 3e-3f;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		
		//논리 타입(Boolean)
		
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다");
		}
		
		
		byte a =5;
		int b = a;
		System.out.println(b);
		

	}

}
