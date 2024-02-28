package sec3;

public class LeastJob implements Scheduler{
	//짧은 대기열 먼저
	
	@Override
	public void getNextCall() {
		System.out.println("현재 상담 완료 다음 상담 시작");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 시간 적은 순서대로 우선 배정");
		
	}
}
