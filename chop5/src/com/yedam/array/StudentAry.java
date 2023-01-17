package com.yedam.array;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		//한 학생의 성적을 입력
		
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
	
	
		
		while(true) {
			System.out.println("====================================");
			System.out.println("1.과목수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("====================================");
			System.out.println("메뉴 입력>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("과목수>");
				subjectNum = Integer.parseInt(sc.nextLine());
				
				scores = new int[subjectNum];
			}else if (selectNo == 2) {
				for(int i = 0; i<scores.length; i ++) {
					System.out.println("점수입력>");
			   scores[i] = Integer.parseInt(sc.nextLine());
					}
			}else if (selectNo == 3) {
				for(int i = 0; i<scores.length; i ++) {
					System.out.println(scores[i]);
				}
				
			}else if (selectNo == 4) {
				int sum = 0;
		
				for(int i = 0; i <scores.length; i++) {
					System.out.println();
					sum += scores[i];
				}
				System.out.println("총 합계 : " + sum);		
				
		        double avg = (double)sum/scores.length;	
		        
				System.out.println("총 평균 : " + avg);
				
			}else if (selectNo == 5) {
				System.out.println("end of prog");
				break;
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}

	}

}
