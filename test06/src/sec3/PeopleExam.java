package sec3;

public class PeopleExam {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;
		p1.name = "권민지";
		p1.age = 24;
		p1.addr = "연신내";
		
		People p2 = new People();
		p2.selNum = 300;
		p2.name = "신희성";
		p2.age = 22;
		p2.addr = "백석";
		
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();
		p2.print1();
		
		p1.print2();
		p2.print2();
		
		//정적 요소 : static으로 선언된 필드 또는 메서드 / 객체 생성 없이 활용 가능
		//정적 메서드 : 객체의 생성 없이 해당하는 클래스에서 바로 활용하는 메서드
		//				 ==> 정적 메서드 == 클래스 메서드
		System.out.println("======정적메서드======");
		People.print2();
		People.selNum = 500;
		System.out.println(People.selNum);

	}

}
