package com.yedam.array;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//국영수의 데이터를 담는 배열
		int[] point = new int[3];
//		point[0] = 80;
//		point[0] = 85;
//		point[0] = 90;
		
		System.out.println("국어점수>");
		point[0] = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어점수>");
		point[1] = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학점수>");
		point[2] = Integer.parseInt(sc.nextLine());
		
		//array.length
		//1) 점수의 총 합계
		int sum = 0;
		System.out.println("배열의 크기 : " + point.length);
		
		for(int i = 0; i <point.length; i++) {
			System.out.println();
			sum += point[i];
		}
		System.out.println("총 합계 : " + sum);
		
		
        double avg = (double)sum/point.length;	
        
		System.out.println("총 평균 : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
