package sec5;
//Queue : FIFO구조 <=> Stack : LIFO구조
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf(); //Queue의 메서드 사용하기 위해 Queue로 선언
		que.enQueue("관악산 등산 경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		//System.out.println(que.deQueue());
		//배열의 항목 개수보다 더 remove하면 오류
		
		
	}

}
