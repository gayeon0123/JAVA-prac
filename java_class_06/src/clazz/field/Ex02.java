package clazz.field;

class Car {
	
	// field 
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 200;
	int speed; // default : 0
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		// Car클래스로부터 Car객체생성
		Car myCar = new Car();
		
		// 객체사용 (필드출력)
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
	}

}





