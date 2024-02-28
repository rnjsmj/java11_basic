package sec1;

//구현 클래스 : 상속받은 추상클래스의 추상메서드를 구현해야 함
public class Member extends User{
	//
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
	
	//추상메서드 기능 정의 => 구현
	@Override
	public void connect() {
		System.out.println("회원으로 연결하였습니다. \n ID : " + id + ", PW : ********");
	}
	
	
}
