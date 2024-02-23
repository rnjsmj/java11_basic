package org.kh.object1;

public class ComputeEx1 {

	public static void main(String[] args) {
		Compute01 comp = new Compute01();
		comp.fnc1();
		comp.fnc2(100);
		int a = comp.fnc3();
		System.out.println(comp.fnc3());
		System.out.println(a);
		String pass = comp.fnc4(75);
		System.out.println(pass);
		
		System.out.println("===해당 클래스 함수 사용===");
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이 : " + fnc4(5));
	}

	//함수
	public static void fnc1() {
		System.out.println("반환 x, 매개변수 x");
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 : "+ a);
	}
	public static int fnc3() {
		return 500;
	}
	public static double fnc4(int radius) {
		return radius * radius * 3.1415f;
	}
	
}
