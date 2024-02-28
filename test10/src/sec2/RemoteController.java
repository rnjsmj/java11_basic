package sec2;

public interface RemoteController {
	int MAX = 10;
	int MIN = 0;
	
	//추상 메서드 (public)
	void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	
	//인터페이스의 메서드는 기본이 추상메서드이므로 선언만 해야하며, 기본 접근제한자는 public
	//이때 구현내용을 기술하려면 접근 제한자를 default 로 명시하거나, static 지시자를 선언
	// default method
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	// static method (정적 메서드)
	// 객체 생성 없이 실행 가능, 오버라이딩 불가
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
