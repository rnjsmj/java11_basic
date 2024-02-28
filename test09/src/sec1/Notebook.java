package sec1;

public class Notebook implements Computer{

	@Override
	public void display() {
		System.out.println("노트북 기본 해상도 : ");
	}

	@Override
	public void typing() {
		System.out.println("노트북은 ");
	}

	@Override //오버라이딩
	public void power(boolean sw) {
		if (sw) System.out.println("노트북의 전원을 켭니다.");
		else System.out.println("노트북의 전원을 끕니다.");
	}
	
	//오버로딩
	public void power(String name, boolean sw) {
		
	}
	
}
