package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		//숫자 맞추기 게임
		//0~100에서 랜덤으로 숫자 지정 => 맞출 때 까지 수 입력, 맞추면 문장 출력
		int quiz = (int) (Math.random()*100);
		//System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력 [0-100] : ");
			int n = s.nextInt();
			
			if (quiz == n) {
				System.out.println("축하합니다. 맞추셨습니다.");
				break;
			}
			/*
			else if (quiz > n) {
				System.out.println("up");
			}
			else{
				System.out.println("down");
			}*/
		}
	}

}
