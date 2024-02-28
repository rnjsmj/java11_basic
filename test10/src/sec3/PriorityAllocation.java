package sec3;

public class PriorityAllocation implements Scheduler{
	//우선순위에 따라
	
	@Override
	public void getNextCall() {
		System.out.println("그 다음 우선순위 상담 시작");	
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("기준대로 우선순위 배정");	
	}
}
