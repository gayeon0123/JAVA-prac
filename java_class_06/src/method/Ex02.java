package method;

public class Ex02 {
	
	public static void hello() {
		
		int i = 0;
		
		while(i < 10) {
			System.out.println("안녕하세요");
			i++;
			
			if(i == 3) {
				//System.exit(0); // 프로그램 강제종료
				return;
				// return 값이 없는 void 메소드에서
				// return 문을 사용하면 메소드 강제종료
			}
			
		}
		
	}
	
	public static void name() {
		System.out.println("저는 홍길동 입니다.");
	}
	
	
	public static void main(String[] args) {
		
		hello();
		
		name();
		

	}

}
