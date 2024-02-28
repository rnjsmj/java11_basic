package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		RemoteController r1;
		r1 = new RemoteController() {
			int volume;
			public void turnOff() {
				System.out.println("전원 OFF");
			}
			public void turnOn() {
				System.out.println("전원 ON");
			}
			public void setVolume(int volume) {
				if (volume > MAX) {
					this.volume = RemoteController.MAX;
				} else if (volume < MIN) {
					this.volume = RemoteController.MIN;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 볼륨 : " + volume);
			}
		};
		
		//static => 객체 생성 없이 사용
		RemoteController.changeBattery();
		
		r1.turnOn();
		r1.setVolume(20);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();

	}

}
