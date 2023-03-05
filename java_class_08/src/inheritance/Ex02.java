package inheritance;

class Sedan {
	
	String color; 
	
	public Sedan(String color) {
		this.color = color;
		System.out.println("Sedan 클래스 생성자 입니다.");
	}
	
}

class Sonata extends Sedan {
	
	public Sonata(String color) {
		super(color); // 부모생성자 호출
		// 첫줄에만 와야 한다.
		System.out.println("Sonata 생성자 입니다.");
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata("파랑");
		
		System.out.println("쏘나타 색상 : " + sonata.color);
		
	}

}
