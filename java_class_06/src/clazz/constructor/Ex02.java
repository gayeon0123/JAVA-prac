package clazz.constructor;


class Student2 {
	
	String school = "IT 학교";
	int studentID;
	String name;
	int age;
	
	// 기본 생성자
	public Student2() {}
	
	// 생성자 오버로딩
	public Student2(int studentID) {
		this(studentID, null, 0); // 다른 생성자 호출
		// 첫줄에만 올 수 있다.
		//this.studentID = studentID;
	}
	
	public Student2(int studentID, String name) {
		this(studentID, name, 0);
		//this.studentID = studentID;
		//this.name = name;
	}
	
	public Student2(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	public void studentInfo() {
		System.out.println("------------------");
		System.out.println("학교 : " + school);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("------------------");
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Student2 student = new Student2(202301, "이순신", 20);
		
		student.studentInfo();
		
	}

}
