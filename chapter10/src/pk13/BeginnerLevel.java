package pk13;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("Jump가 뭐예요?");
	}
	@Override
	public void turn() {
		System.out.println("Turn은 무서워요~~");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("********초보자 입니다********");
	}

}
