package modifier;

class Box {
	
	static int boxID = 0;
	// static 멤버변수 : 메모리상의 정적이다.
	// 프로그램 시작 시 메모리의 메소드영역(최상단)에 할당된다.
	// 공유되는 전역 변수이다.
	
	int idNum = 0;
	// 인스턴스 변수
	// 객체생성 시 메모리의 힙 영역에 할당된다.
	
	public void increase() {
		boxID++;
		idNum++;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID : " + box1.boxID);
		System.out.println("idNum : " + box1.idNum);
		System.out.println();
		
		box2.increase();
		System.out.println("boxID : " + box2.boxID);
		System.out.println("idNum : " + box2.idNum);
		System.out.println();
		
		box3.increase();
		System.out.println("boxID : " + box3.boxID);
		System.out.println("idNum : " + box3.idNum);
		System.out.println();
		
		// 인스턴스 멤버변수는 객체마다 공유되지 않는다.
		// static 멤버변수는 모든 객체가 공유된다.
		System.out.println("boxID는 : " + Box.boxID);
		// 정적 필드는 원칙적으로 클래스명으로 접근한다.

	}

}





