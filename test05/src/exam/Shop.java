package exam;

public class Shop {
	private String no;
	private String id;
	private String date;
	private String name;
	private String prodName;
	private String addr;
	public Shop(String no, String id, String date, String name, String prodName, String addr) {
		super();
		this.no = no;
		this.id = id;
		this.date = date;
		this.name = name;
		this.prodName = prodName;
		this.addr = addr;
	}
	public Shop() {
		super();
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Shop \n주문번호 : " + no + "\n주문자 아이디 : " + id + "\n주문 날짜 : " + date + "\n주문자 이름 : " + name + "\n상품번호 : " + prodName
				+ "\n배송 주소 : " + addr;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
