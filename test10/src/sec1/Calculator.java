package sec1;

public interface Calculator {
	double PI = 3.1415; //인터페이스에서 선언한 필드 => 상수 (final static 생략)
	int ERROR = -999999999;
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
}
