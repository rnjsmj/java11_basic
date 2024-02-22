package org.kh.app2;
//반복문
public class Loop1 {

	public static void main(String[] args) {
		int n = 0;
		/*for (int i = 0; i < 10; i++) {
			n = n + 1;
		}
		System.out.println("n="+n);*/

		int[] nums = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};
		String names[] = {"김", "이", "박", "최", "정","오", "배", "강", "장","계"};
		
		System.out.println("\n이름\t점수\t학점\t판정");
	
		int max = nums[0];
		int min = nums[0];
		
		int tot = 0;
		for (int i = 0; i < 10; i++) {
			tot += nums[i];
			System.out.print(names[i] + "\t");
			System.out.print( nums[i] + "\t");
			
			//최대최소값 구하기
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
			
			if (nums[i] >= 90) {
				System.out.print("A\t");
			} else if (nums[i] >= 80) {
				System.out.print("B\t");
			} else if (nums[i] >= 70) {
				System.out.print("C\t");
			} else if (nums[i] >= 60) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			if (nums[i] >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("탈락");
			}
		}
		
		//System.out.println("nums : " + nums); //해당 배열의 주소 출력 => 참조형
		
		//평점1
		System.out.println("전체 총점 : " + tot);
		System.out.println("전체 평균 : " + (tot/10.0f));
		
		//평점2
		/*
		float avg;
		avg = (float)tot / nums.length;
		System.out.println("평균 점수 : " + avg);*/
		
		
	
		System.out.println("최대 점수 : " + max );
		System.out.println("최소 점수 : " + min);
		
	}

}
