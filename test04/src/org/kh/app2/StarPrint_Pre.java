package org.kh.app2;

public class StarPrint_Pre {

	public static void main(String[] args) {
		/*1번
		 ******
		 ******
		 ******
		 ****** 
		 */
		System.out.println("====1번====");
		for (int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*2번
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		 */
		System.out.println("====2번====");
		for (int i=1; i<7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*3번
		 ******
		 *****
		 ****
		 ***
		 **
		 * 
		 */
		//1)
		System.out.println("====3번====");
		for (int i=6; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2)
		/*
		for (int i=1; i<=6; i++) {
			for (int j=0; j<7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*4번
		  ******
		   *****
		    ****
		     ***
		      **
		       * 
		 */
		System.out.println("====4번====");
		for (int i=0; i<6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<7-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 5번
		       *
		      **
		     ***
		    ****
		   *****
		  ******
		 */
		
		System.out.println("====5번====");
		for (int i=0; i<6; i++) {
			for (int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* 6번
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *****
		 ****
		 ***
		 **
		 * 
		 */
		System.out.println("====6번====");
		for (int i=1; i<7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 7번
		 ******
		 *****
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 */
		System.out.println("====7번====");
		for (int i=6; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=2; i<7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*8번
		      *
		     **
		    ***
		   ****
		  *****
		 ******
		  *****
		   ****
		    ***
		     **
		      *
		 */
		
		System.out.println("====8번====");
		for (int i=0; i<6; i++) {
			for (int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<7-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 9번
		      *
		     ***
		    *****
		   *******
		  *********
		 */
		System.out.println("====9번====");
		for (int i=1; i<6; i++) {
			for (int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 10번
	 	  *********
	 	   *******
	 	    *****
	 	     ***
	 	      *
		 */
		System.out.println("====10번====");
		for (int i=1; i<6; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<12-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 11번
		 	  *
		     ***
		    *****
		   *******
		  *********
		   *******
	 	    *****
	 	     ***
	 	      *
		 */
		System.out.println("====11번====");
		for (int i=1; i<6; i++) {
			for (int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=2; i<6; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<12-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		/* 12번
		 ***** *****
		 ****   ****
		 ***     ***
		 **       **
		 *         *
		 **       **
		 ***     ***
		 ****   ****
		 ***** *****         
		  
		 */
		
		

	}

}
