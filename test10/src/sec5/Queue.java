package sec5;

public interface Queue {
	void enQueue(String title); //데이터의 끝
	String deQueue();			//데이터의 시작
	int getSize();				//Queue에 저장된 개수
	
}
