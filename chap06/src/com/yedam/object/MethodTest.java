package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		//StringUtil su = new StringUtil();
		StringUtil.greet();
		Integer.parseInt("50");
		
		//gooodmorning 출력
		StringUtil.greet("goodmorning");
		
		long l= StringUtil.greetLength("goodmorning");
		System.out.println(l);
	}
}
