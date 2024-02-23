package org.kh.object1;

//Member 클래스 => id, pw, email, 생년(birth), 전화번호(tel) 등
//회원정보 출력 => toString()
public class Member {
	private String id;
	private String pw;
	private String email;
	private int birth;
	private String tel;
	
	//멤버변수를 private로 선언한 경우 
	//메서드를 public으로 선언하여 다른 클래스에서 접근할 수 있도록 함
	//=> getter & setter 사용
	//멤버변수명 = 매개변수명 인 경우 this check
	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getEmail() {
		return email;
	}

	public int getBirth() {
		return birth;
	}

	public String getTel() {
		return tel;
	}

	@Override
	//문자열 값 반환
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	
	
	
}
