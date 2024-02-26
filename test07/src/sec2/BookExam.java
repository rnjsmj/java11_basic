package sec2;

public class BookExam {

	public static void main(String[] args) {
		Book[] book = new Book[100];
		
		book[0] = new Book("태백산맥", "조정래");
		book[1] = new Book("데미안", "헤르만 헤세");
		book[2] = new Book("어떻게 살 것인가", "유시민");
		book[3] = new Book("토지", "박경리");
		book[4] = new Book("어린왕자", "생텍쥐페리");

		for (int i = 0; i<5; i++) {
			System.out.println(book[i].toString());
		}
	}

}
