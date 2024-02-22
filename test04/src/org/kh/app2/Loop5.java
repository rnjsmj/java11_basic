package org.kh.app2;

public class Loop5 {

	public static void main(String[] args) {
		//do~while~
		//while문의 조건식이 거짓이어도 do문에서 실행문을 처리
		int a = 0;
		do {
			System.out.println("a="+a);
		} while(a>10);
		
		int b = 0;
		for(;;) {
			b++;
			System.out.println("b="+b);
			if(b>10) break;
		}
		
		//0~100 짝수만 합
		//1
		int tot = 0;
		for (int j = 0; j<=100; j++) { 
			if(j%2 == 1) continue; //홀수일 경우 밑의 실행문을 건너뜀
			tot += j;
		}
		System.out.println("tot="+ tot);
		
		//2
		int hap = 0;
		for (int k = 0; k <= 100; k+=2) {
			hap += k;
		}
		System.out.println("hap="+hap);
		
	}

}
