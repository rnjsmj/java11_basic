package sec1;

public abstract class Repeator implements Calculator{
	//추상체(abstract class)가 추상체(interface)를 상속받는 경우
	//일부만 추상화(선언) 할 수도 있고, 상속된 메서드 중 원하는 메소드만 구현 가능
	//별도의 추상메서드 정의 가능
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int subtract(int num1, int num2) {
		int num = 0;
		if(num1 > num2) {
			num = num1 - num2;
		} else {
			num = num2 - num1;
		}
		return num;
	}
	
	//제곱
	abstract int power(int num1, int num2);
	
	
}
