package sec4;

public class ShopExam {

	public static void main(String[] args) {
		Shop s1;
		Delivery s2;
		
		s1 = new Shop();
		s2 = new Shop();
		
		System.out.println("Shop => Shop()");
		s1.buy();
		s1.sell();
		s1.delivery();
		
		System.out.println("Delivery => Shop()");
		s2.buy();
		s2.sell();
		s2.delivery();

	}

}
