package sec2;

public class StudentExam1 {

	public static void main(String[] args) {
		Student s1 = new Student("권민지", 1, 100000);
		Student s2 = new Student("박은종", 2, 200000);
		Student s3 = new Student("신희성", 3, 300000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//s2가 101 버스 2번, 지하철 2호선 3번 이용 => 학생, 버스, 지하철 정보 출력
		Subway sub2 = new Subway(2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSub(sub2);
		s2.takeSub(sub2);
		s2.takeSub(sub2);
		
		s2.print();
		bus1.show();
		sub2.show();
	}

}
