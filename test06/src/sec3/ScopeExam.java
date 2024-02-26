package sec3;

public class ScopeExam {
	int a = 10;
	static int b = 100; 
	
	public static void main(String[] args) {
		int a = 20;
		System.out.println("지역변수 a =" + a);
		run();
		run(30);
	}
	
	public static void run() {
		System.out.println("b = " + b);
	}
	public static void run(int a) {
		System.out.println("매개변수 a = " + a);
	}
}
