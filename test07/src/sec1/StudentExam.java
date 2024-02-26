package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		s1.setNo(100);
		s1.setKor(90);
		s1.setEng(75);
		s1.setMat(80);
		s1.getTot();
		s1.getAvg();
		s1.getGrade();
		s1.show();
		
		Student s2 = new Student(200, 100, 70, 100);
		s2.show();
		
		Student s3 = new Student(300, 85, 70, 75);
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\t학점\n");
		s3.print();
		*/
		
		//5명의 국, 영, 수 점수 Scanner로 입력받아 총점, 평균, 학점 계산하여 출력
		Student[] s = new Student[5]; //Student 객체가 들어갈 수 있는 배열 객체 선언
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			s[i] = new Student(); //배열에 Student 객체 하나를 생성
			s[i].setNo(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scan.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scan.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scan.nextInt());
		}
		
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\t학점\n");
		for (int i=0; i<5; i++) {
			s[i].print();
		}
		
	}

}
