package sec2;

public class Television implements Screen{

	int volume;
	int lightness;
	int zoom;
	
	//RemoteController를 상속받은 Screen을 상속받았기 때문에
	//RemoteController의 메서드를 구현할 수 있음
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
	}

	@Override
	public int light() {
		if(0 < this.lightness && this.lightness < 255) {
			this.lightness++;
		}
		return lightness;
	}

	@Override
	public int dark() {
		if(0 < this.lightness && this.lightness < 255) {
			this.lightness--;
		}
		return lightness;
	}

	@Override
	public int zoomin() {
		if(-500 < this.zoom && this.lightness < 500) {
			this.zoom += 50;
		}
		return zoom;
	}

	@Override
	public int zoomout() {
		if(-500 < this.zoom && this.lightness < 500) {
			this.zoom -= 50;
		}
		return zoom;
	}
	
}
