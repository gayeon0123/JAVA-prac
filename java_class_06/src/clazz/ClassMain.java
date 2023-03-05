package clazz;


class Person { // 설계도
	// 클래스 안에 구성멤버는
	// 필드, 생성자, 메소드
	
	// 필드 (객체의 속성)
	// class에 선언된 변수를 필드라고 한다.
	String name;
	int age;
	
	// 생성자 (객체초기화 역할)
	// 생성자는 클래스이름과 같은 이름이다.
	public Person() {}
	
	// 메소드 (객체의 기능[동작])
	public void run() {}
	public void eat() {}
	
}


public class ClassMain {

	public static void main(String[] args) {
		
		Person object = new Person();
		// 클래스타입 클래스변수 = new 생성자
		System.out.println(object);
		
		
		
		
	}

}








