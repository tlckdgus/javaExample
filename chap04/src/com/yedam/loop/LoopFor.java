package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		//for문
		
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}

		int result = 0;
		for(int i=1; i<100; i++) {
			result += i;
		}
		System.out.println("1~100까지의 합 : " + result);
		
		
		
		//1~100사이의 짝수 구하기
		//짝수 성질 =>
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i+"는 짝수");
			} else if(!(i%2==0)) {
				System.out.println(i+"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너를 활용해서 값을 하나 입력
		//입력 받은 값에 대한 구구단 출력
		//2를 입력 -> 2*1 = 2...2*9 = 18
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		int gugu =  Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=9; i++) {
			System.out.println(gugu + "*"+i+" = " + (gugu*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
		//스캐너 -> 데이터 입력
		//데이터 받을 갯수->5
	    //데이터 입력 횟수가 5번: 1, 20, 40, 30, 10
		//총합: 값을 입력 받을 때마다 변수에 저장
		//평균: 총합 / 갯수
		//최대값: 입력할때마다 비교, 최대값인지 아닌지
		//최소값: 입력할때마다 비교, 최소값인지 아닌지
	    System.out.println("갯수 입력>");
	    int count = Integer.parseInt(sc.nextLine());
	    
	    int total =0;
	    int avg = 0;
	    int max = 0;
	    int min = 0;
	   
	    for(int i = 0; i <count; i++) {
	    	System.out.println("데이터 입력>");
	    	int data = Integer.parseInt(sc.nextLine());
	    	total += Integer.parseInt(sc.nextLine());
	    	total += data;
	    	if(i==0) {
	    		max = data;
	    		min = data;
	    	}
	    	if (max < data) {
	    		max = data;
	    	}
	    	if (min > data) {
	    		min = data;
	    	}
	    }
	    
	    System.out.printf("평균 :%5.2f", (double)total/count);
	    
	    //랜덤
	    int randomNo = (int) (Math.random()*100)+1;
	    
	    for(int i = 0; i < 5; i++) {
	    	System.out.println("Up & Down>>");
	    	int num = Integer.parseInt(sc.nextLine());
	    	
	    	if(randomNo == num) {
	    		System.out.println("정답입니다");
	    		break;
	    	}else if(randomNo > num) {
	    		System.out.println("더 큰 수 입력");
	    	}else {
	    		System.out.println("더 작은 수 입력");
	    	}if (i==4) {
	    		System.out.println("5번의 기회를 다 소진 하였습니다");
	    	}
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
