package pk14;

public class SmartTelevision implements Seachable, Remote{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다. ");
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume>Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
			System.out.println("더 이상 볼륨을 높일 수 없습니다. ");
		}
		else if(volume<Remote.MIN_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
			System.out.println("더 이상 볼륨을 낮출 수 없습니다. ");
		}
		else
			System.out.println("현재 볼륨 : "+volume);
	}

	@Override
	public void search(String url) {
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다. ");
	}
	
}
