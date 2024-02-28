package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수입력 : ");
			int input = sc.nextInt();
			
			if(2 <= input && input <= 9) {
				for (int num=1; num<=9; num++) {
					System.out.printf("%d * %d = %d\n", input, num, (input*num));
				}
				break;
			} else {
				System.out.println("입력조건");
			}
		}

	}

}
