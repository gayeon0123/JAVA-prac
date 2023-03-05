package method;

public class Ex04 {
	
	// 메소드 오버로딩
	// 조건 : 매개변수의 타입, 갯수, 순서 중 하나가 달라야 한다.
	
	public static void profile(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void profile(String name, int age, String tel) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
	}
	
	public static void main(String[] args) {
		
		profile("홍길동");
		System.out.println();
		profile("성춘향", 20);
		System.out.println();
		
		profile("이순신", 22, "010-1111-2222");

	}

}
