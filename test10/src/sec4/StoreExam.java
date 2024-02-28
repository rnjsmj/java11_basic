package sec4;

public class StoreExam {

	public static void main(String[] args) {
		System.out.println("===Inventory => store===");
		Inventory store;
		store = new Store();
		store.inventory();

		System.out.println("===Pay => pay===");
		Pay pay;
		pay = new Pay();
		pay.inventory(); //상속
		pay.pay();
		
		System.out.println("===Pay => store===");
		pay = new Store();
		pay.inventory();
		pay.pay();
	}

}
