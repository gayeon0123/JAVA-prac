package clazz.field;

class Car3 {
	
	private String color;
	private int speed; // 필드를 바로 접근 불가능
	// private : 외부접근 허용안됨 // 데이터 보호를 위해 사용
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		
		if(speed < 30) {
			speed = 30;
		}
		
		return speed;
	}
	
	public void setSpeed(int speed) {
		
		if(speed < 0 || speed > 200) {
			return;
		}else {
			this.speed = speed;
		}
	}
	
	
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		// 필드로 바로접근
//		myCar.color = "파랑";
//		myCar.speed = -100;
//		
//		System.out.println("내 자동차 색상 : " + myCar.color);
//		System.out.println("내 자동차 속도 : " + myCar.speed);
		
		System.out.println();
		
		// 메소드로 필드를 접근
		myCar.setColor("빨강");
		myCar.setSpeed(10);
		
		System.out.println("내 자동차 색상 : " + myCar.getColor());
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());

	}

}




