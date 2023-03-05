package method;

public class Ex03 {
	
	
	public static void profilePrint(String name, int age) { // 매개변수
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		
	}
	
	
	public static void main(String[] args) {
		
		profilePrint("홍길동", 20);
		
		String name = "성춘향";
		int age = 23;
		
		profilePrint(name, age);
		
		
		
		
	}

}
