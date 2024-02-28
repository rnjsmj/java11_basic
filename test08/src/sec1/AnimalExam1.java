package sec1;

public class AnimalExam1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
		//자식 => 부모 생성 불가
		//Mammal m1 = new Animal();
		Mammal m2 = new Mammal();
		//Mammal m3 = new Birds();
		
		Animal a4; //선언만 하고 객체 생성 안된 상태
		a4 = new Animal(); // Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Mammal(); // Mammal 객체로 형 변환
		//a4.setLegs(4); //선언을 Animal로 했기 때문에 불가
		a4.setName("호랑이");
		System.out.println(a4.print());
		
		a4 = new Birds(); //Birds로 형 변환
		//a4.setWings(0); //선언을 Animal로 했기 때문에 불가
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		//메서드 오버라이딩 : 부모 클래스로부터 상속받은 메서드를 다르게 구현하는 것
		// => 부모클래스로 선언된 객체는 자신 부모 자신 또는 자식 생성자를 활용하여 다향하게 형 변환 가능
		// => 다형성
		
		//  클래스 => 캡슐화, 정보 은닉, 재사용성, 다형성, 추상화		
	}

}
