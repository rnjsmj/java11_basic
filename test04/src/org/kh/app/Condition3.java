package org.kh.app;

import java.util.Scanner;

public class Condition3 { //조건문 if~elseif~(else~)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100] : ");
		int point = scan.nextInt();
		
		char result; 
		/*점수 90~100 : 'A', 80~89 : 'B', 70~79 : 'C',
			60~69 : 'D', 60미만 : 'F' */
		if (point >= 90) {
			result = 'A';
		} else if (point >= 80) {
			result = 'B';
		} else if (point >= 70) {
			result = 'C';
		} else if (point >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
		System.out.println("\n당신의 학점은 " + result + " 입니다.");
	}

}
