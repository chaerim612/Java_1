package pk14;



public class SmartTelevision implements Searchable, Remote{
	
    private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// if
		if(volume > Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
		}else if(volume < Remote.MIN_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
	     /*방법2
		if( volume > Remote.MAX_VOLUME  |  volume < Remote.MIN_VOLUME) {
			System.out.println("현재 볼륨 : "+ this.volume+" 은 지정되지 않은 볼륨입니다.");
		}else {
			System.out.println("현재 볼륨 : "+ this.volume);
		*/
		System.out.println("현재의 TV볼륨 : "+this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다");
		
	}
	
	
	

}
