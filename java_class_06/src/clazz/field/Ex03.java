package clazz.field;

class Car2 {
	
	String color;
	int speed;
	
	public void upSpeed(int value) {
		speed += value;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		myCar.color = "빨강";
		myCar.speed = 100;
		
		myCar.upSpeed(30);
		
		System.out.println("내 자동차 색상 : " + myCar.color);
		System.out.println("내 자동차 속도 : " + myCar.speed);
		
	}

}





