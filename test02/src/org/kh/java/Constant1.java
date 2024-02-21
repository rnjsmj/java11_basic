package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		//상수(Constant)와 리터럴(Literal)
		final int MAX_POINT = 100;
		final int MIN_POINT = 0;
		final double PI = 3.141592;
		final String MY_NAME = "권민지";
		//MY_NAME = "a";  //상수값 변경 불가
		
		System.out.println("최소 점수 : " + MIN_POINT);
		System.out.println("최고 점수 : " + MAX_POINT);
		System.out.println("나의 이름 : " + MY_NAME);
		System.out.println("반지름이 10인 원의 둘레의 길이 : " + (10*2*PI));
	}

}
