package clazz.constructor;

class Student {
	
	// 필드
	String school = "IT 학교";
	int studentID;
	String name;
	int age;
	
	// 생성자
	// 1. 생성자를 명시하지 않으면 자바컴파일러는 기본생성자를 자동으로 만들어준다.
	// 2. 그러나 생성자를 명시해주면 만들지 않는다.
	// 3. 생성자는 반환타입이 없고 클래스 이름과 같은 이름이다.
	public Student(int studentID, String name, int age) {
		
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		
		studentProfile();
		
	}
	
	
	public void studentProfile() {
		System.out.println("------------------");
		System.out.println("학교 : " + school);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("------------------");
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		new Student(202301, "홍길동", 20);
		// 객체를 생성하면 생성자가 호출이 되고
		// 필드초기화와 메소드호출 등 객체를 사용할 준비를 한다.
		
		new Student(202305, "성춘향", 26);
		
		
		
	}

}






