package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("도둑맞은 집중력");
		b1.setPrice(16000);
		b1.setAuthor("요한 하리");
		b1.setPub("어크로스");
		
		Book b2 = new Book();
		b2.print(102, "자바 프로그래밍 입문");
		b2.print("자바 프로그래밍 입문", "박은종", 23000);
		System.out.println();
		
		Book b3 = new Book();
		b3.print();
		b3.print(b1.getBno(), b1.getBname());
		b3.print(b1.getBname(), b1.getAuthor(), b1.getPrice());
	}

}
