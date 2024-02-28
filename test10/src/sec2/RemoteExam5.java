package sec2;

public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteController r;
		//여러 클래스로 형변환

		r = new RemoteController() {
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
		
		System.out.println("===RemoteController 객체 생성===");
		r.turnOn();
		r.setMute(true);
		r.setVolume(10);
		r.turnOff();
		RemoteController.changeBattery();
		
		r = new Screen() {
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
		System.out.println("===Screen 객체 생성===");
		//RemoteController에서 선언되지 않은 메서드 사용 불가
		r.turnOn();
//		r.light();
//		r.dark();
		r.turnOff();
		
		r = new Television();
		System.out.println("===Television 객체 생성===");
		
		r = new Audio();
		System.out.println("===Audio 객체 생성===");
	}

}
