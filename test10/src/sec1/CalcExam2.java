package sec1;

public class CalcExam2 {

	public static void main(String[] args) {
		Calculator cal1;
		
		//구현 내용 기술되지 않은 추상체 => 객체 생성 불가
		//cal1 = new Calculator(); 
		//cal1 = new Repeator(); //추상메서드를 포함하고 있기 때문에 추상체
		cal1 = new Arithmatic(); //구현내용이 모두 기술되어 있기 때문에 생성 가능
		int num1 = 100;
		int num2 = 3;
		
		//Calculator로 선언되었기 때문에 서브클래스의 메서드(print(), power()) 사용 불가
		// ㄴ 해당 클래스에 선언되어있지 않음
		//cal1.print();
		System.out.println("덧셈 : " + cal1.add(num1, num2));
		System.out.println("뺄셈 : " + cal1.subtract(num1, num2));
		System.out.println("곱셈 : " + cal1.multiply(num1, num2));
		System.out.println("나눗셈 : " + cal1.divide(num1, num2));
		//System.out.println("거듭제곱 : " + cal1.power(num1, num2));
		System.out.println("원주율 : " + cal1.PI);
		
		//=> 조상 인터페이스로 선언되어 자식 클래스의 생성자로 생성된 인스턴스(객체)는
		//   조상 인터페이스에서 선언된 메서드만 사용할 수 있으며, 
		//   실행되는 내용은 (생성된) 자식 클래스에서 기술한 내용대로 실행됨
		
		// interface => class : implements (구체화)     <-> abstract (추상화)
		// class => class : extends (확장)
		// interface => interface : extends 
		
		//추상체 객체에 구현 내용 기술
//		cal1 = new Repeator() {
//			
//		}
		
		
		
	}

}
