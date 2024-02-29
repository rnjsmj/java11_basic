package exam;
//p.168 Q4
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public boolean isValid() {
		boolean valid = false;
		if (year < 1) {
			return false;
		}
		switch (month) {
			
			case 1: case 3: case 5: case 7: 
			case 8: case 10: case 12:
				if (1 <= day && day <= 31) valid = true; break;
			case 2 :
				if (1<= day && day <= 28) valid = true;break;
			case 4 : case 6: case 9 : case 11:
				if (1<=day && day<=30) valid = true;break;
			default : valid = false;
		}
		
		return valid;
	}
	
	public String isValidString() {
		if (this.isValid() == true) {
			return "유효한 날짜입니다.";
		}
		return "유효하지 않은 날짜입니다.";
	}
	
}
