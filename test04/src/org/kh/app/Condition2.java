package org.kh.app;

public class Condition2 { //조건문 if~else~

	public static void main(String[] args) {
		char sel = '1';
		//성별코드 sel이 1이거나 3이면 "남성", 아니면 "여성"
		String gender;
		if (sel == '1' || sel == '3') {
			gender = "남성";
		}
		else {
			gender = "여성";
		}
		System.out.printf("%n당신의 성별은 %s", gender);
	}

}
