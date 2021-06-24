package pk13;

public class MainBoard {

	public static void main(String[] args) {
		
		//기본 게임 레벨 1단계
		Player player=new Player();
		player.play(1);
		

		//레벨 2단계
		AdvancedLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);//중급자 레벨로 세팅
		player.play(2); //aLevel.go
		
		
		//레벨 3단계
		SuperLevel sLever=new SuperLevel();
		player.upgradeLevel(sLever);
		player.play(3);//sLevel.go
		
	}

}
