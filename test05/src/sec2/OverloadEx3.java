package sec2;

public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board();
		Board b2 = new Board(101);
		Board b3 = new Board(102, "게시글 제목", "user1", "게시글 내용", "2024-02-23", 0);
		
		b1.setBno(100);
		System.out.println(b1.getBno());
		
		System.out.println(b2.getBno());
		
		System.out.println(b3.getBno());
		System.out.println(b3.toString());
		
		Notice n1 = new Notice(101, "공지사항 제목", "user2", "공지사항 내용", "2024-02-23", 0);
		System.out.println(n1.toString());
	
		News new1 = new News();
		System.out.println(new1.toString());
	}

}
