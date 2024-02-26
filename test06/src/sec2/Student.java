package sec2;


public class Student {
	private String name;
	private int grade;
	private int money;
	
	public Student() {
		this("권민지");
	}
	
	public Student(String name) {
		this(name, 1);
	}
	
	public Student(String name, int grade) {
		this(name, grade, 1000);
	}

	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//학생 => 버스 탑승 => 버스 수입금액은 올라가고, 학생의 돈은 줄어듦
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//학생 => 지하철 탑승
	public void takeSub(Subway sub) {
		sub.take(1500);
		this.money -= 1500;
	}

	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}
	
	
}
