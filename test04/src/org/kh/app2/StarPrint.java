package org.kh.app2;

public class StarPrint {

	public static void main(String[] args) {
		//중첩 for문을 활용한 별 그리기
		/*
		  ******
		  ******
		  ******
		  ******
		 */
		for (int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		*
		**
		***
		****
		*****
		******
		 */
		
		for (int i=1; i<7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 ******
		 *****
		 ****
		 ***
		 **
		 * 
		 */
		//1
		for (int i=6; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2
		for (int i=1; i<=6; i++) {
			for (int j=0; j<7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
