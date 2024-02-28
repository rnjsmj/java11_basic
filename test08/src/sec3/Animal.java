package sec3;

public class Animal {
	//protected ; 같은 패키지, 상속 관계에서 접근 허용
	protected String name;
	protected boolean spine;
	
	
	
	public String print() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	
	

}
