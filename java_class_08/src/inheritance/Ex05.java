package inheritance;

import java.util.Scanner;

class CoffeePrice {
	
	private int americanoPrice = 3000;
	private int lattePrice = 4000;
	private int orangeJuicePrice = 3500;
	private int strawberryJuicePrice = 3500;
	
	public int getAmericanoPrice() {
		return americanoPrice;
	}
	
	public int getLattePrice() {
		return lattePrice;
	}
	
	public int getOrangeJuicePrice() {
		return orangeJuicePrice;
	}
	
	public int getStrawberryJuicePrice() {
		return strawberryJuicePrice;
	}
	
}

class CoffeeShop extends CoffeePrice {
	
	// 아메리카노, 라떼, 오렌지주스, 딸기주스를 주문받는 메소드 만들기
	// 메소드는 정수타입의 매개변수로 매개값(돈)을 받아 주문을 받은다음
	// 잔돈을 반환(정수반환)해주는 메소드이다.
	// 받은 돈이 음료가격보다 작으면 주문을 할 수 없다.
	// 받은 돈을 그대로 반환해주어야 한다.
	
	public int americanoOrder(int money) {
		
		if(money >= getAmericanoPrice()) {
			System.out.println("아메리카노 주문 들어갔습니다!!");
			return money - getAmericanoPrice();
		}else {
			System.out.println("돈이 부족합니다...");
			return money;
		}
		
	}
	
	public int latteOrder(int money) {
		
		if(money >= getLattePrice()) {
			System.out.println("라떼 주문 들어갔습니다!!");
			return money - getLattePrice();
		}else {
			System.out.println("돈이 부족합니다...");
			return money;
		}
		
	}
	
	public int orangeJuiceOrder(int money) {
		
		if(money >= getOrangeJuicePrice()) {
			System.out.println("오렌지주스 주문 들어갔습니다!!");
			return money - getOrangeJuicePrice();
		}else {
			System.out.println("돈이 부족합니다...");
			return money;
		}
		
	}
	
	public int strawberryJuiceOrder(int money) {
		
		if(money >= getStrawberryJuicePrice()) {
			System.out.println("딸기주스 주문 들어갔습니다!!");
			return money - getStrawberryJuicePrice();
		}else {
			System.out.println("돈이 부족합니다...");
			return money;
		}
		
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		CoffeeShop coffeeShop = new CoffeeShop();
		
		System.out.print("커피숍에 가져갈 돈 입력 : ");
		int myMoney = scan.nextInt();
		
		while(true) {
			
			System.out.println("##########################################");
			System.out.println("## [1]아메리카노(3000원) [2]카페라떼(4000원) ##");
			System.out.println("## [3]오렌지주스(3500원) [4]딸기주스(3500원) ##");
			System.out.println("## [5]금액 충전하기      [6]커피숍 나가기    ##");
			System.out.println("##########################################");
			
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1 :
				myMoney = coffeeShop.americanoOrder(myMoney);
				System.out.println("남은 잔액 : " + myMoney + "원 입니다.");
				break;
			case 2 :
				myMoney = coffeeShop.latteOrder(myMoney);
				System.out.println("남은 잔액 : " + myMoney + "원 입니다.");
				break;
			case 3 :
				myMoney = coffeeShop.orangeJuiceOrder(myMoney);
				System.out.println("남은 잔액 : " + myMoney + "원 입니다.");
				break;
			case 4 :
				myMoney = coffeeShop.strawberryJuiceOrder(myMoney);
				System.out.println("남은 잔액 : " + myMoney + "원 입니다.");
				break;
			case 5 :
				System.out.print("충전할 금액 : ");
				int money = scan.nextInt();
				myMoney += money;
				System.out.println(money + "원 금액이 충전되었습니다.");
				System.out.println("내 총 잔액은 : " + myMoney + "원 입니다.");
				break;
			case 6 :
				System.out.println("커피숍을 나왔습니다!!");
				System.exit(0);
				default :
					System.out.println("잘못입력 하였습니다.");
			
			
			}
			
			
		}
		

	}

}









