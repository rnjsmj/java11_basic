package sec4;

public class MarketExam {

	public static void main(String[] args) {
		System.out.println("===Buy => market===");
		Buy buy;
		buy = new Market();
		buy.buy();
		
		System.out.println("===Sell => market===");
		Sell sell;
		sell = new Market();
		sell.sell();

	}

}
