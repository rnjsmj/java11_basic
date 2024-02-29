package exam;

public class Person {
	private int age;
	private String name;
	private boolean isMarried;
	private int child;
	
	public Person() {}
	public Person(int age, String name, boolean isMarried, int child) {
		super();
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.child = child;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Person [이 사람의 나이=" + age + "\n이 사람의 이름=" + name + "\n이 사람의 결혼 여부=" + isMarried + "\n이 사람의 자녀 수=" + child + "]";
	}
	
	
	
}
