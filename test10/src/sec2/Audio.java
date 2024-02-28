package sec2;

public class Audio implements RemoteController{

	int volume;
	
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX) {
			this.volume = RemoteController.MAX;
		} else if (volume < MIN) {
			this.volume = RemoteController.MIN;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
}
