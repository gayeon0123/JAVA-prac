package inner;

// Outer 클래스의 static 멤버클래스 예제

class Outer3 {
	
	private int x = 100;
	private static int y = 200;
	
	static class Inner3 { // 정적멤버 클래스
		
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			//System.out.println("Outer x : " + x);
			System.out.println("Outer y : " + y);
			System.out.println("Inner z : " + z);
			System.out.println("Inner zz : " + zz);
		}
		
	}
	
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		Outer3.Inner3 inner = new Outer3.Inner3();
		
		inner.disp();

	}

}







