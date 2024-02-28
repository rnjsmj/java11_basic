package sec1;

public class CalcExam4 {

	public static void main(String[] args) {
		//인터페이스는 메서드의 구현 내용이 없어 생성자로 객체를 생성할 수 없으나,
		//메서드의 구현 내용을 별도로 기술하면 객체 생성 가능

		int num1 = 100;
		int num2 = 3;
		
		Calculator cal1;
		cal1 = new Calculator() {
			public int add(int num1, int num2) {
				return num1 + num2;
			}
			public int subtract(int num1, int num2) {
				int num = 0;
				if(num1 > num2) {
					num = num1 - num2;
				} else {
					num = num2 - num1;
				}
				return num;
			}
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
		}; //semicolon
		
		System.out.println("덧셈 : " + cal1.add(num1, num2));
		System.out.println("뺄셈 : " + cal1.subtract(num1, num2));
		System.out.println("곱셈 : " + cal1.multiply(num1, num2));
		System.out.println("나눗셈 : " + cal1.divide(num1, num2));
		System.out.println("원주율 : " + cal1.PI);
		System.out.println("오류 : " + cal1.ERROR);
	}

}
