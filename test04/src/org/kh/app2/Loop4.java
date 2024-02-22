package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		//while문
		/*
		int i = 0, tot = 0;
		while (i<=5) {
			i++;
			tot += i;
		}
		System.out.println("결과 :"+ tot);*/

		//숫자입력 > 해당 숫자 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력[2-9] : ");
		int n = sc.nextInt();
		int i = 0;
		
		while (i<9) {
			i++;
			System.out.println(n + " * " + i +" = " + (n*i));
		}
		
		for (int k = 1; k < 10; k++) {
			System.out.println(n + " * " + k +" = " + (n*k));
		}
	}

}
