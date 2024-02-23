package org.kh.object1;
//Student 클래스 => 학생의 점수(kor, eng, mat)의 tot()과 avg()를
//resulting() 메서드를 통해 출력
public class Student {
//	String name;
//	int kor;
//	int eng;
//	int mat;

  //초기화
	String name = "ㅇㅇㅇ";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	
	public int tot() {
		return kor + eng + mat;
	}
	
	public float avg() {
		return tot() / 3.0f;
	}
	
	void resulting() {
		System.out.printf(this.name + "의 총점은 %d, 평균점수는 %.1f %n", this.tot(), this.avg());
	}

}
