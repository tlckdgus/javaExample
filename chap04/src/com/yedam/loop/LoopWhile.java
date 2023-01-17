package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//1~100사이의 2의 배수
//		int i = 1;
//		while(i<=100) {
//			if(i % 2 ==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
		//계산기 프로그램
		//무한 루프 조건으로 프로그램 실행
		//event(trigger) 프로그램 종료 -> break;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				System.out.println("더하고자 하는 두 수를 입력");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				int result = num1 + num2;
				System.out.println(num1 + " , " + num2 + "의 결과" + result);
				break;
			case 2:
				System.out.println("빼고자 하는 두 수를 입력");
				System.out.println("1>");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num4 = Integer.parseInt(sc.nextLine());
				int result1 = num3 - num4;
				System.out.println(num3 + " , " + num4 + "의 결과" + result1);
				break;
			case 3:
				System.out.println("곱하고자 하는 두 수를 입력");
				System.out.println("1>");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num6 = Integer.parseInt(sc.nextLine());
				int result2 = num5 * num6;
				System.out.println(num5 + " , " + num6 + "의 결과" + result2);
				break;
			case 4:
				run = false;
				System.out.println("end of prog");
				break;
			default:
				System.out.println("1~4사이 수를 입력해주세요.");
				break;
			}
		}
		
		//게임 만들기
		//컴퓨터와 가위, 바위, 보
		//앞, 뒤 맞추기
		//한 판에 500원
		int money;
		System.out.println("====insert coin====");
		money = Integer.parseInt(sc.nextLine());
		//10000 -> 20번
		//1500 -> 3번
		boolean flag = true;
		while(money >= 500 && flag) {
			
			System.out.println((money/500) + "번의 기회가 남았습니다");
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추기 | 3. 종료");
			
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1:
				//컴퓨터와 가위,바위,보
				//가위 -> 1, 바위 -> 2, 보 -> 3
				//랜덤 값 추출
				//입력 한 값이랑 비교
				System.out.println("가위, 바위, 보 입력");
				System.out.println("입력>");
				String RSP = sc.nextLine();
				int randomNo = (int)(Math.random()*3)+1;
				
				if(RSP.equals("가위")) {
					if(randomNo == 1) {
						System.out.println("비겼다");
					}else if(randomNo == 2) {
						System.out.println("졌다");
					}else if(randomNo == 3) {
						System.out.println("이겼다");
					}
					
				}else if(RSP.equals("바위")) {
					if(randomNo == 1) {
						System.out.println("이겼다");
					}else if(randomNo == 2) {
						System.out.println("비겼다");
					}else if(randomNo == 3) {
						System.out.println("졌다");
					}
					
				}else if(RSP.equals("보")) {
					if(randomNo == 1) {
						System.out.println("졌다");
					}else if(randomNo == 2) {
						System.out.println("이겼다");
					}else if(randomNo == 3) {
						System.out.println("비겼다");
					}
				}
				money -= 500;
				break;
			case 2:
				System.out.println("앞,뒤 입력");
				System.out.println("입력>");
				String FB = sc.nextLine();
				int randomFB = (int)(Math.random()*2)+1;
				
				if(FB.equals("앞")) {
					if(randomFB == 1) {
						System.out.println("맞춤");
					}else if(randomFB == 2) {
						System.out.println("못맞춤");
					
					}else if(FB.equals("뒤")) {
					      if(randomFB == 1) {
							System.out.println("못맞춤");
					}else if(randomFB == 2) {
							System.out.println("맞춤");
					}
				  }
				}
				money -= 500;
				break;
			case 3:
				flag = false;
				System.out.println("게임 종료.");
				break;
			default:
				System.out.println("없는 메뉴 입니다. 다시 입력하세요");
				break;
			}
			if(money < 500) {
				System.out.println("금액이 부족합니다");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
