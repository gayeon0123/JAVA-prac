package inheritance;

/*final*/ class Suv {
	
	private String color;
	int speed = 100;
	
	// 부모클래스의 private 접근제한을 갖는 
	// 필드 및 메소드는 자식이 물려받을 수 없다.
	// 부모와 자식클래스가 서로 다른 패키지에 있다면
	// default 접근제한을 갖는 필드 및 메소드도 
	// 자식이 물려받을 수 없다.
	// 그 외의 경우는 모두 상속의 대상이 된다.
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
	
}

class Santafe extends Suv {
	
	int speed = 120;
	
	@Override
	public void run() { // 메소드 재정의 (오버라이딩)
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	// 어노테이션
	// - 소스코드에 메타코드를 주는 것.
	// - 실행 시 특정기능을 실행하도록 정보제공
	
	// @Override 어노테이션
	// - 컴파일러에게 코드문법 에러를 체크하도록 정보제공
	// - 메소드 선언 시 사용되며 메소드가 오버라이드(재정의) 된 것임을 컴파일러에게 
	//   알려주어 컴파일러가 검사를 하도록 한다.
	// - 오버라이드가 되지 않았다면, 컴파일러는 에러를 발생시킨다.
	
	public void disp() {
		
		System.out.println("SUV 속도 : " + super.speed); // 부모필드
		
		System.out.println("싼타페 속도 : " + this.speed); // 자식필드
	}
	
	// 부모클래스에서 상속받은 멤버필드의 이름과 자식클래스에서 만든 멤버필드의 이름이 
	// 같을경우, 부모의 멤버를 사용하기 위해서는 super 라는 키워드를 사용해야 한다.
	// 자식클래스는 this가 생략되어 있어서 그냥 사용하면 자식클래스의 멤버가 사용된다.
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		
		santafe.run();
		
		santafe.disp();

	}

}
