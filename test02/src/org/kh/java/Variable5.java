package org.kh.java;

public class Variable5 {
	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 82;
		char ch4 = '\u2665'; //유니코드 표현
		char ch5 = 121;
		char ch6 = '\u26BD';
		
		System.out.println("ch1 : " + ch1);
		
		//숫자를 문자형으로 출력하면 ASCII코드 값에 해당되는 문자 출력
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("ch4 : " + ch4);
		System.out.println("ch5 : " + ch5);
		System.out.println("ch6 : " + ch6);
		System.out.println("ch7 : " + ch6);
		
		System.out.println("코드 넘버"); //0 < ASCII 코드 < 128 
		System.out.println("c1 : " + (int)ch1); //형변환
		System.out.println("c2 : " + (int)ch2);
		System.out.println("c3 : " + (int)ch3);
		System.out.println("c4 : " + (int)ch4);
		
	}
}
