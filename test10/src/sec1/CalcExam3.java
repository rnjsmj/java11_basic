package sec1;

public class CalcExam3 {

	public static void main(String[] args) {
		Repeator rep1;
		
		//rep1 = new Calculator(); //자식 클래스로 선언된 객체는 부모 생성자로 생성 불가
		//rep1 = new Repeator(); //추상클래스 객체 생성 불가
		
		rep1 = new Arithmatic();
		int num1 = 50;
		int num2 = 4;
		
		
		//rep1.print();
		//rep1은 Repeator로 선언되어 있으므로 하위 클래스의 메서드(print()) 사용 불가
		System.out.println("덧셈 : " + rep1.add(num1, num2));
		System.out.println("뺄셈 : " + rep1.subtract(num1, num2));
		System.out.println("곱셈 : " + rep1.multiply(num1, num2));
		System.out.println("나눗셈 : " + rep1.divide(num1, num2));
		System.out.println("거듭제곱 : " + rep1.power(num1, num2));
		//power()는 (추상메서드로) 선언되어 있으므로 사용 가능하며, 
		//자식클래스에서 구현한 코드가 실행됨
		System.out.println("원주율 : " + rep1.PI);
		
	}

}
