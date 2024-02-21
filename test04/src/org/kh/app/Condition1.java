package org.kh.app;

public class Condition1 { //조건문 if

	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		
		//점수가 70점 이상이면 "합격", 아니면 "불합격"
		if (point>=70) {
			pass = "합격";
		}
		
		System.out.printf("\n당신의 점수는 %d이며, 판정은 %s입니다.", point, pass);
		
		String pass2 = (point >= 70) ? "합격" : "불합격";

	}

}
