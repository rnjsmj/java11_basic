package sec1;

public class CalcExam5 {

	public static void main(String[] args) {
		Repeator cal1;
		cal1 = new Repeator () {
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
			public int divide(int num1, int num2) {
				int num = 0;
				if(num1 > num2) {
					num = num1 / num2;
				} else {
					num = num2 / num1;
				}
				return num;
			}
			int power(int num1, int num2) {
				int tmp = num1;
				for (int i=1; i<num2; i++) {
					num1 = num1 * tmp;
				}
				return num1;
			}
			//Repeator의 (추상)메서드가 아니기 때문에 print()는 구현하지 않아도 됨
			/*
			public void print() {
				System.out.println("계산기, 중계기, 연산기를 구현합니다.");
			}*/
		};
		
		int num1 = 100;
		int num2 = 3;
		
		System.out.println("덧셈 : " + cal1.add(num1, num2));
		System.out.println("뺄셈 : " + cal1.subtract(num1, num2));
		System.out.println("곱셈 : " + cal1.multiply(num1, num2));
		System.out.println("나눗셈 : " + cal1.divide(num1, num2));
		System.out.println("원주율 : " + cal1.PI);
		System.out.println("오류 : " + cal1.ERROR);

	}

}
