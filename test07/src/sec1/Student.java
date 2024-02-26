package sec1;
//field : 번호, 국어, 영어, 수학 점수
//method : getter/setter, 총점, 평균, 학점 계산하고 모든 학생 정보 출력
public class Student {
	private int no;
	private int kor;
	private int eng;
	private int mat;
	
	private int tot;
	private float avg;
	private String grade;
	
	public Student () {}
	
	public Student(int no, int kor, int eng, int mat) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		getTot();
		getAvg();
		getGrade();
	}
	
	public int getTot() {
		this.tot = this.kor + this.eng + this.mat;
		return tot;
	}
	
	public float getAvg() {
		this.avg = this.tot / 3.0f;
		return avg;
	}
	
	public String getGrade() {
		if (this.avg >= 90) {
			this.grade = "A";
		} else if (this.avg >= 80) {
			this.grade = "B";
		} else if (this.avg >= 70) {
			this.grade = "C";
		} else if (this.avg >= 60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
		return grade;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg=" + avg
				+ ", grade=" + grade + "]";
	}

	public void show() {
		System.out.println(this.toString());
	}
	
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", this.no, this.kor, this.eng, this.mat, this.getTot(), this.getAvg(), this.getGrade());
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	
	
	
	
	
	
}
