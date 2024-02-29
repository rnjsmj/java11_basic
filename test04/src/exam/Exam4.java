package exam;

public class Exam4 {

	public static void main(String[] args) {
		//Q4
		System.out.println("====Q4====");
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q5
		//if~else 응용해서 해보기 (i 크기별로 if문 조건)
		System.out.println("====Q5====");
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<4; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<8-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====Q5 - 2====");
//		for (int i=1; i<=7; i++) {
//			if (i<=4) {
//				for (int j=1; j<=4-i; j++) {
//					System.out.print(" ");
//				}
//				for (int k=1; k<2*i; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			else { //i>5
//				for (int j=1; j<i-3; j++) {
//					System.out.print(" ");
//				}
//				for (int k=1; k>10-i; k++)
//			}
//		}

	}

}
