package inner;


// Inner 클래스에서 Outer 클래스멤버 접근예제

class Outer1 {
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class Inner1 { // 인스턴스 멤버클래스
		
		//private static int y = 200;
		// 인스턴스 멤버클래스에서 정적멤버는 만들 수 없다.
		
		private int z = 300;
		
		public void disp() {
			
			System.out.println("Outer x : " + x);
			System.out.println("Outer y : " + y);
			System.out.println("Inner z : " + z);
			outerMethod1();
			outerMethod2();
		}
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Outer1 outer = new Outer1();
		//우선 Outer1 클래스로부터 객체생성을 해준다.
		
		Outer1.Inner1 inner = outer.new Inner1();
		// 생성된 객체로 Inner1 클래스 객체를 생성할 수 있다.
		
		inner.disp();

	}

}







