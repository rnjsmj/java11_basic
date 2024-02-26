package sec1;

public class BirthdayEx1 {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("권민지");
		birth1.setYear(2001);
		birth1.setMonth(8);
		birth1.setDay(20);
		
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("아무개");
		birth2.setYear(2003);
		birth2.setMonth(11);
		birth2.setDay(9);
		
		birth2.birth();
		birth2.birthAddr();
	}

}
