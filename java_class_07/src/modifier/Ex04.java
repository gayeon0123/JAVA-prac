package modifier;

public class Ex04 {
	
	// static 필드 초기화 역할
	static {
		
		System.out.println("static 블록 입니다.");		
	}
	
	// 객체생성시 호출되어 초기화 역할
	{
		System.out.println("인스턴스 블록 입니다.");
	}
	
	public Ex04() {
		System.out.println("생성자 입니다.");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("메인 메소드 시작!");
		
		new Ex04();
		
		System.out.println();
		
		new Ex04();
		
		System.out.println("메인 메소드 끝!");

	}

}
