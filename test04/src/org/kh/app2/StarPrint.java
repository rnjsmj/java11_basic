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
		
		
	}

}
