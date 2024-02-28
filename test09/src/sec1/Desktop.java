package sec1;

public class Desktop implements Computer{

	@Override
	public void display() {
		System.out.println("데스크탑 모니터 기본 해상도 : 1920 x 1080");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑은 별도의 키보드를 타이핑합니다.");
	}

	@Override //오버라이딩
	public void power(boolean sw) {
		if (sw) System.out.println("데스크탑의 전원을 켭니다.");
		else System.out.println("데스크탑의 전원을 끕니다.");
	}
	
	//오버로딩
	public void power(String name, boolean sw) {
		
	}
}
