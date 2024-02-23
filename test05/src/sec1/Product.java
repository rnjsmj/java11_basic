package sec1;

public class Product {
	//정보 은닉
	private String pname; //상품명
	private int pcode; 	//상품코드
	private int price;	//가격
	private int size; 	//사이즈
	private int amount; //수량
	private String remark; //상품설명
	
	/*메서드 오버로딩 (Method Overload)*/
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String pname) {
		System.out.println("제품이름 : " + pname);
	}
	public void print(int amount) {
		System.out.println("제품수량 : " + amount);
	}
	public void print(String pname, int amount) {
		System.out.println("제품이름 : " + pname);
		System.out.println("제품수량 : " + amount);
	}
	public void print(int amount, String pname) {
		System.out.println("제품이름 : " + pname);
		System.out.println("제품수량 : " + amount);
	}
	
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
}
