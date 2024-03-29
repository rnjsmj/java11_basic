package org.kh.java;

//형변환1 (Auto Casting, Force Casting) = type conversion
public class Casting1 {

	public static void main(String[] args) {
		//Auto Casting (묵시적)
		//작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮기면서 형변환
		byte b = 20;   	//1byte
		short s = b;	//2
		int i = s;		//3
		long l = i;		//4
		
		//Force Casting (명시적)
		//큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 통해 형변환
		//int i2 = l; //불가능
		int i2 = (int)l;
		short s2 = (short)i;
		byte b2 = (byte)s;
		
		//p.69 - Q4
		int num1 = 10;
		float num2 = 2.0f;
		
		System.out.println((int)(num1+num2));
		System.out.println((int)(num1-num2));
		System.out.println((int)(num1*num2));
		System.out.println((int)(num1/num2));
		
		//Q5
		//글 - AE00
		char char1 = '\uAE00';
		System.out.println(char1);
	}

}
