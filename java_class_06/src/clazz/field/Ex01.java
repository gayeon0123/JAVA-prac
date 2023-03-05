package clazz.field;


class Student { // 설계도
	
	// 필드 field : class에 선언된 변수(멤버변수)
	// 필드와 메소드에 선언된 변수와는 틀리다.
	// (class에 선언된변수 > 전역변수, method에 선언된 변수 > 지역변수)
	
	int studentID = 202301;
	String name = "홍길동";
	
	public void study() {
		
		String place = "도서관";
		int time = 2;
		// 지역변수는 메모리의 스택(stack)영역에 저장된다.
		// 스택영역은 메소드의 호출과 함께 할당되며,
		// 메소드의 호출이 완료되면 소멸한다.
		
		System.out.println("공부장소 : " + place);
		System.out.println("공부시간 : " + time + "시간");
	}
	
	public void profile() {
		
//		System.out.println(place);
//		System.out.println(time);
		
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Student student = new Student();// 객체 생성
		
		// 객체사용 > 객체이름.필드
		System.out.println(student.studentID);
		System.out.println(student.name);
		System.out.println();
		
		// 객체사용 > 객체이름.메소드명()
		student.study();
		System.out.println();
		student.profile();
		
		
		
		
	}

}






