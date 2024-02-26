package sec2;

public class Subway {
	int no;		//노선
	String station; //역 이름
	int cnt;	//탑승객 수
	int money;	//요금
	
	public Subway(int no) {
		this.no = no;
	}
	
	//지하철 탑승
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	//지하철 정보 출력
	public void show() {
		System.out.println("지하철 "+this.no+"호선 누적요금 : "+
				this.money+", 탑승객 수: "+ this.cnt);
	}
}
