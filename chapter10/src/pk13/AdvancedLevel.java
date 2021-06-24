package pk13;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("높이 Jump 합는다");
	}
	@Override
	public void turn() {
		System.out.println("Turn은 무서워요~~");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("********중급자 입니다********");
	}

}
