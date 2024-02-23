package sec2;

public class Notice {
	private int bno; //글번호
	private String title; //제목
	private String uname; //user
	private String content; //내용
	private String resdate; //작성자
	private int visited; //조회수
	
	
	public Notice(int bno, String title, String uname, String content, String resdate, int visited) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return "Notice [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	//====> getter/setter지정 x => 개별 요소에 접근 불가
	
}
