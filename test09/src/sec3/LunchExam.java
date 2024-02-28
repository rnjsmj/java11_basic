package sec3;

public class LunchExam {
	public static void main(String[] args) {
		Lunch l;
		
		System.out.println("Korean 객체 생성");
		l = new Korean();
		l.eating("김치찌개");
		
		System.out.println("Chinese 객체 생성");
		l = new Chinese();
		l.eating("우육면");
		
		System.out.println("Japanese 객체 생성");
		l = new Japanese();
		l.eating("초밥");
	}
}
