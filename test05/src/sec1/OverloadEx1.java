package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		Product prod1 = new Product();
		prod1.print();
		prod1.print("망고요거트");
		prod1.print(400);
		prod1.print("딸기쿠앤크", 5);
		prod1.print(27, "아메리카노");
	}

}
