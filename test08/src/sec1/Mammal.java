package sec1;
//상속
//Animal >> 부모클래스(=super), Mammal >> 자식클래스(=sub)
public class Mammal extends Animal {
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String print() {
		//return "Mammal [name=" + name + ", spine=" + spine + ", leg=" + leg + "]";
		return "Mammal [leg=" + leg + "]";
	}
	
}
