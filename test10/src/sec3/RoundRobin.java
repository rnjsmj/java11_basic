package sec3;

public class RoundRobin implements Scheduler{
	//순서대로 (시분할)
	
	@Override
	public void getNextCall() {
		System.out.println("10분씩 나누어 상담을 하고, 해당 순번이 되어 대기줄에서 들어옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순번 호명");
		
	}
	
}
