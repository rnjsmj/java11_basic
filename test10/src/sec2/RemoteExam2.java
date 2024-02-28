package sec2;

public class RemoteExam2 {

	public static void main(String[] args) {
		Screen s1 = new Screen() {
			int volume;
			int lightness;
			int zoom;
			
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
			}
			public int light() {
				if(0 < this.lightness && this.lightness < 255) {
					this.lightness++;
				}
				return lightness;
			}
			public int dark() {
				if(0 < this.lightness && this.lightness < 255) {
					this.lightness--;
				}
				return lightness;
			}
			public int zoomin() {
				if(-500 < this.zoom && this.lightness < 500) {
					this.zoom += 50;
				}
				return zoom;
			}
			public int zoomout() {
				if(-500 < this.zoom && this.lightness < 500) {
					this.zoom -= 50;
				}
				return zoom;
			}
		};
		
		RemoteController.changeBattery();
		s1.turnOn();
		s1.light();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomin();
		s1.zoomin();
		s1.zoomout();
		s1.setVolume(20);
		s1.setMute(true);
		s1.setMute(false);
		s1.turnOff();
		
		//print문으로 동작 확인해보기
	}

}
