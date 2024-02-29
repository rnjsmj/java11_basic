package sec5;
//두 개의 인터페이스 상속 => 각각의 인터페이스에 선언된 메서드를 하나의 클래스로 합칠 수 있음
//두 개의 클래스 상속 => 허용하지 않으므로, 하나의 부모와 자식클래스를 구성하고
// 			그 자식클래스를 상속받은 부모와 자식클래스의 메서드를 하나의 클래스로 합칠 수 있음
//하나의 클래스, 인터페이스 상속 => 클래스의 필드와 생성자, 인터페이스의 메서드를 하나의 클래스로 합칠 수 있음

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
