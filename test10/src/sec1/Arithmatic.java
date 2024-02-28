package sec1;

public class Arithmatic extends Repeator {
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int num = 0;
		if(num1 > num2) {
			num = num1 / num2;
		} else {
			num = num2 / num1;
		}
		return num;
	}
	
	@Override
	int power(int num1, int num2) {
		int tmp = num1;
		for (int i=1; i<num2; i++) {
			num1 = num1 * tmp;
		}
		return num1;
	}

	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}
	
}
