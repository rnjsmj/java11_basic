package exam;

public class Exam3 {

	public static void main(String[] args) {
		// Q3
		for (int i=2; i<=9; i++) {
			//break문 사용 x
//			for (int j=1; j<=i; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
			
			//break문 사용
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				if (j==i) break;
			}
			System.out.println();
			
		}
	}

}
