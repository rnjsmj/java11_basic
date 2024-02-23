package org.kh.object3;

//다른 패키지의 클래스 사용할 경우 import
import org.kh.object1.Member;

public class MemberEx3 {

	public static void main(String[] args) {
	
		Member m = new Member();
		//setter를 사용한 값 입력하기
		m.setId("mem");
		m.setPw("pass");
		m.setEmail("mem@kh.org");
		m.setBirth(2001);
		m.setTel("010-1111-2222");
		
		System.out.println(m.toString());
		
		//getter를 사용한 값 가져오기
		System.out.println("id : " + m.getId());
		System.out.println("pw : " + m.getPw());
		System.out.println("email : " + m.getEmail());
		System.out.println("birth : " + m.getBirth());
		System.out.println("tel : " + m.getTel());

	}
}
