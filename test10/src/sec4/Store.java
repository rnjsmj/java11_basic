package sec4;

public class Store extends Pay{

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
	
}
