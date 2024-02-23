package org.kh.object1;
//메서드(함수) : 정의 => 호출
public class Compute01 {
	//반환값, 매개변수의 유무에 따른 여러가지 메서드 유형
	void fnc1() {
		System.out.println("메서드 1 호출");
	}
	
	void fnc2(int i) {
		System.out.println(i+"를 입력하였습니다.");
	}
	
	int fnc3() {
		return 999;
	}
	
	String fnc4(int point) {
		if(point >= 80) return "합격";
		else return "불합격";
	}
}
