package inheritance;


class Parent { // 부모클래스
	
	int parentField = 50;
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드 입니다.");
	}
	
}

class Child extends Parent { // 자식클래스
	
	int childField = 20;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드 입니다.");
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println("child.childField : " + child.childField);
		child.childMethod();
		
		System.out.println();
		
		System.out.println("child.parentField : " + child.parentField);
		child.parentMethod();
		

	}

}
