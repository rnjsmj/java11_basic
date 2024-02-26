package sec2;

public class Bus {
	int no;		//버스 번호
	int cnt;	//탑승객 수
	int money; //요금
	
	public Bus(int no) {
		this.no = no;
	}
	
	//버스 탑승
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	//버스 현재 정보 출력
	public void show() {
		System.out.println("버스 번호 : "+this.no+" , 수입 금액 : "+this.money+ " , 탑승객 수 : " + this.cnt);
	}
	
	

}
