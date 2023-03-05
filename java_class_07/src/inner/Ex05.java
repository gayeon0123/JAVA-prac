package inner;

class Outer5 {
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		
		Outer5 outer = new Outer5() { // 익명클래스 
			
			public void bbb() { // 메소드 재정의
				System.out.println("bbbbb");
			}
			
		}; // 세미콜론 해준다.
		
		outer.aaa();
		outer.bbb();
		outer.ccc();

	}

}
