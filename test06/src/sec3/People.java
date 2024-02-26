package sec3;

//static
public class People {
	public static int selNum = 100;	//고유번호 => static : 정적필드
	public String name;			//이름
	public int age;				//나이
	public String addr;			//주소
	
	public void print1() {
		System.out.println("selNum : "+ this.selNum);
		System.out.println("name : "+ this.name);
	}
	
	//static 메서드에는 this 사용 불가
//	public static void print2() {
//		System.out.println("name : "+ this.name);
//		System.out.println("age : "+ this.age);
//	}
	
	public static void print2() { //정적(static) 메서드
	System.out.println("name : 아무개");
	System.out.println("age : 28");
}
}
