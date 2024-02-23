package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {
	
		Member m = new Member();
		//default Modifier => 다른 패키지에서 사용 불가
		//public => 다른 패키지에서 사용 가능
		/*
		m.id = "mem";
		m.pw = "pass";
		m.email = "mem@kh.org";
		m.birth = 2001;
		m.tel = "010-1111-2222";*/
		
		m.setId("mem");
		m.setPw("pass");
		m.setEmail("mem@kh.org");
		m.setBirth(2001);
		m.setTel("010-1111-2222");
		
		System.out.println(m.toString());

		
	}

}
