package sec1;

public class Book {
	private int bno; //교재코드
	private String bname; //교재명
	private int price; //가격
	private String author; //저자
	private String pub; //출판사
	
	public void print() {
		System.out.println("교재 정보");
	}
	public void print(int bno, String bname) {
		System.out.println(bno + "번 교재: " + bname);
	}
	public void print(String bname, String author, int price) {
		System.out.println("교재이름 : " + bname);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
	
	
	

}
