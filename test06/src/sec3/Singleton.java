package sec3;

//싱글톤 => 하나의 객체 생성만 허용
public class Singleton {
	private static Singleton instance; //정적 객체 선언
	private Singleton() {} //private => 외부에서 생성 불가
	
	//정적, 동기화, 리턴값 Singleton
	//instance가 비어있을 때만 새로운 instance 생성하는 함수
	public static synchronized Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}
	
	
}
