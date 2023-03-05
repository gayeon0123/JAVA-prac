package clazz.constructor;

import java.util.Scanner;

// Car 클래스를 만든다.
// 필드는 String color; int speed; 로 하고 외부접근 금지가 되게한다.
// 생성자에서 매개변수로 매개값을 받아 필드 초기화 하자
// speed 가 30미만이거나, 200을 초과할 경우 속도를 50으로 초기화 한다.
// 필드를 출력해주는 carProfile 메소드를 만들어서 생성자에서 호출하기

class Car {
	
	private String color; 
	private int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		if(speed < 30 || speed > 200) {
			System.out.println("속도는 30 이상 200이하여야 합니다.");
			System.out.println("속도를 50으로 초기화 합니다.");
			this.speed = 50;
		}else {
			this.speed = speed;
		}
		
		carProfile();
		
	}
	
	public void carProfile() {
		
		System.out.println("자동차 색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
		
	}
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("생성할 자동차 색상 : ");
		String color = scan.next();
		
		System.out.print("생성할 자동차 속도 : ");
		int speed = scan.nextInt();
		
		new Car(color, speed);
		
		scan.close();
	}

}






