package sec3;

import java.io.IOException;

public class SchedulerExam1 {

	public static void main(String[] args) throws IOException {
		//키보드로 알파벳[A-Z] 입력받아 입력 값이 
		//'R'이면 RoundRobin의 객체,
		//'P'이면 PriorityAllocation의 객체, 
		//'L'이면 LeastJob의 객체가 생성되고
		//그 밖의 문자는 "지원하지 않는 스케줄링입니다." 출력
		
		Scheduler s;
		s = null;
		System.out.print("전화 상담 방식 선택 [A-Z] : ");
		int ch = System.in.read();
		
		if (ch == 'R' || ch == 'r') {
			s = new RoundRobin();
		} else if (ch == 'P' || ch == 'p') {
			s = new PriorityAllocation();
		} else if (ch == 'L' || ch == 'l') {
			s = new LeastJob();
		} else {
			System.out.println("지원하지 않는 스케줄링입니다.");
			
		}
		
		if (s != null) {
			s.getNextCall();
			s.sendCallToAgent();
		}
	
	}

}
