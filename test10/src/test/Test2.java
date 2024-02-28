package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};

		System.out.print("이름 검색 : ");
		
		//String searchName = sc.nextInt(); 
		String searchName = sc.next(); 
		
		boolean result = false;
		
		for(int i=1; i<=memberArr.length; i++) {
//			if(memberArr[i] == searchName) {
			if(searchName.equals(memberArr[i-1])) {
				result = true;
				break;
			}
		}
		
		if(!result) {
			System.out.println("회원존재x");
		} else {
			System.out.println("회원존재o");
		}

	}

}
