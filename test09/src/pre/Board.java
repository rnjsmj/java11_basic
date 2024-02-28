package pre;

public class Board {
	private int bno; //글번호
	private String title; //제목
	private String content; //내용
	private String userid; //user
	private String resdate; //작성일
	private int visited; //조회수
	//private => getter/setter 필요
	
	//생성자
	public Board() {}
	
	//제목, 내용, userid 입력 생성자 (나머지는 자동) => this() 생성자 사용
	public Board(String title, String content, String userid) {
		this(1, title, content, userid, "2024-02-27", 0);
	}

	public Board(int bno, String title, String content, String userid, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.userid = userid;
		this.resdate = resdate;
		this.visited = visited;
	}
	
	//public void print() {
	// 		System.out.print("표현식...");
	//}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}

	
}
