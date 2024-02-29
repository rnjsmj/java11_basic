package exam;

public class Exam2 {

	public static void main(String[] args) {
		// Q2
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
//				continue 사용 x
//				System.out.println(i + "*" + j + "=" + i*j);
//				continue 사용
				if (i%2 == 1) {
					continue;
				} else {
					System.out.println(i + "*" + j + "=" + i*j);
				}
			}
			System.out.println();
		}

	}

}
