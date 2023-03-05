package method;

public class Ex01 {
	
	public static void method1() {
		System.out.println("void 메소드는 돌려줄 값이 없음");
	}
	
	public static int method2() {
		System.out.println("리턴 타입은 int 형인 메소드");
		int b = 100;
		return b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 메소드");
		
		method1(); // void 메소드 호출
		
		int a = method2(); // int 리턴타입 메소드 호출
		
		System.out.println(a);
		
		
	}

}
