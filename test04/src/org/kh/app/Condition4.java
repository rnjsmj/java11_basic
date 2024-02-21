package org.kh.app;

import java.util.Scanner;

public class Condition4 { //다단계 if문 활용
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100] : ");
		int point = scan.nextInt();
		
		String result; 
		String grade = "";
		/*점수 90~100 : 'A', 80~89 : 'B', 70~79 : 'C',
			60~69 : 'D', 60미만 : 'F' 
			+ 7~10 : ++, 3~6 : 0, 0~2 : -
			A++ : 학업우수상, A0: 노력상, A- : 아차상, 나머지 : ''
			*/
		
		//int pointD = point % 10;
		
		if (point >= 90) {
			result = "A";
			if (point>= 97) {
				result += "+";
			} else if (point >= 93) {
				result += "0";
			} else {
				result += "-";
			}
		} else if (point >= 80) {
			result = "B";
			if (point>= 87) {
				result += "+";
			} else if (point >= 83) {
				result += "0";
			} else {
				result += "-";
			}
		} else if (point >= 70) {
			result = "C";
			if (point>= 77) {
				result += "+";
			} else if (point >= 73) {
				result += "0";
			} else {
				result += "-";
			}
		} else if (point >= 60) {
			result = "D";
			if (point>= 67) {
				result += "+";
			} else if (point >= 63) {
				result += "0";
			} else {
				result += "-";
			}
		} else {
			result = "F";
		}
		
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
		System.out.println("\n당신의 학점은 " + result + " 입니다.");
		
		switch (result) {
		case "A+" : grade = "학업우수상"; break;
		case "A0" : grade = "노력상"; break;
		case "A-" : grade = "아차상"; break;
		default : grade = "";
		}
		
		if (grade != "") {
			System.out.println("시상내용은 " + grade + "입니다.");
		}
			
	}

}
