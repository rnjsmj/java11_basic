package exam;

public class Exam1 {

	public static void main(String[] args) {
		//Q1
		int num1 = 10;
		int num2 = 2;
//		char operator = '+';
//		char operator = '-';
//		char operator = '*';
		char operator = '/';
		
		int num = 0;
		
		//if문
		if (operator == '+') {
			num = num1+num2;
		} else if (operator == '-' ) {
			num = num1-num2;
		} else if (operator == '*' ) {
			num = num1*num2;
		} else {
			num = num1/num2;
		} 
		
		System.out.println("if문 : " + num);
		
		
		//switch문
		num = 0;
		switch(operator) {
			case '+' : num = num1 + num2; break;
			case '-' : num = num1 - num2; break;
			case '*' : num = num1 * num2; break;
			default : num = num1 / num2; 
		}
		System.out.println("switch문 : " + num);
	}

}
