package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		
		System.out.printf("\nf1 = %.3f", f1);
		System.out.printf("\nf2 = %.2f", f2);
		
		int kor = 90, eng = 80, mat = 90;
		//float avg = (kor + eng + mat) / 3.0f;   // 실수 연산 1
		float avg = (float)(kor + eng + mat) / 3; // 실수 연산 2
		System.out.printf("\n평균 : %.2f", avg);
	}

}
