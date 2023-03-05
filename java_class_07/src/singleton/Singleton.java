package singleton;

public class Singleton {
	
	// 싱글톤 : 객체를 하나만 생성하도록 보장 하는 것
	
	private Singleton() {}
	
	// 정적필드
	private static Singleton instance = new Singleton();
	
	// 정적메소드
	public static Singleton getInstance() {
		return instance;
	}
	
	
}
