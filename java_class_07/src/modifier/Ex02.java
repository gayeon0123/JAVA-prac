package modifier;


class Player {
	
	String name = "홍길동"; // 인스턴스 멤버변수
	static String gameID = "기사"; // static 멤버변수
	
	// 정적메소드
	public static void gamePlay() {
		
		//System.out.println(name);
		// 정적메소든 내부에서는 인스턴스 필드나
		// 인스턴스 메소드를 사용할 수 없다.
		System.out.println(gameID + "로 게임을 플레이 합니다.");
	}
	
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.gamePlay();
		
		Player.gamePlay();
		// 정적 메소드는 원칙적으로 클래스이름으로 접근
		
		Math.random();
		

	}

}





