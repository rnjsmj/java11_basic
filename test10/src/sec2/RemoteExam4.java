package sec2;

public class RemoteExam4 {
	public static void main(String[] args) {
		Audio a1 = new Audio();
		
		RemoteController.changeBattery();
		a1.turnOn();
		a1.setVolume(5);
		a1.setVolume(20);
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
	}
}
