package sec1;


public interface Computer { //인터페이스(interface) : 모든 메서드가 추상메서드 => 메서드에 abstract 지시어 사용 안해도 됨
	//구현 클래스에서 반드시 인터페이스에서 정의한 매개변수와 반환값의 타입대로 구현해야 함
	void display();
	void typing();
	void power(boolean sw);
	
	
	
	
}
