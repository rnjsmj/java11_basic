package sec1;

public abstract class User { //추상 클래스 : 추상화 메서드가 존재하는 클래스
	protected String ip;
	protected int port;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	
	//abstract ; 추상화 => 해당 클래스는 추상 클래스 => 클래스 정의 시 지시어 작성 (public abstract class ... )
	public abstract void connect(); 
	//추상 메서드 : 메서드의 기능 구현 내용을 기술하지 않고, 선언만 한 메서드
	//필수적인 메서드를 추상 클래스에서 선언
	
}
