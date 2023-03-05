package clazz.field;

// Person 클래스를 만든다.
// 필드는 String name; int age; String tel; 이다.
// 필드를 외부접근 금지가 되게한다.
// getter / setter 메소드를 만들어서 필드를 메소드로 접근하도록 한다.
// 나이를 성인나이 20살부터 60살까지만 초기화 할 수 있도록 
// setAge 메소드를 수정한다.

class Person {
	
	private String name; 
	private int age; 
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age < 20 || age > 60) {
			System.out.println("나이는 20살부터 60살까지 입니다.");
			System.out.println("나이를 20살로 초기화 합니다.");
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("홍길동");
		person.setAge(15);
		person.setTel("010-1111-2222");
		
		System.out.println("이름 : " + person.getName());
		System.out.println("나이 : " + person.getAge());
		System.out.println("전화번호 : " + person.getTel());
		

	}

}
