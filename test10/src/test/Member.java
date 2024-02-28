package test;

public class Member {
	private String name;
	private int age;
	private String address;
	private String hobby;
	
	public Member() {}
	
	public Member(String name, int age, String address, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
