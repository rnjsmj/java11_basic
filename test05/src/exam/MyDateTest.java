package exam;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValidString());
		MyDate date2 = new MyDate(2, 10, 2019);
		System.out.println(date2.isValidString());
	}

}
