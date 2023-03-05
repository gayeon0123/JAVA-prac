package method;

import java.util.Scanner;

public class Ex05 {
	
	// 1. 전원을 켭니다. 출력해주는 powerOn 메소드 만들기
	//    전원을 끕니다. 출력해주는 powerOff 메소드 만들기
	
	// 2. 정수값 2개를 받아서 더한다음 결과를 반환해주는 add 메소드
	//    정수값 2개를 받아서 뺀 다음 결과를 반환해주는 subtract 메소드
	//    정수값 2개를 받아서 곱한다음 결과를 반환해주는 multiply 메소드
	//    실수값 2개를 받아서 나눈다음 결과를 실수로 반환해주는 divide 메소드
	
	// 3. 정수값 하나를 매개변수로 받아서 결과를 출력해주는 outPut 메소드
	//    실수값 하나를 매개변수로 받아서 결과를 출력해주는 outPut 메소드
	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
		System.exit(0); // 프로그램 강제종료
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static double divide(double x, double y) {
		return x / y;
	}
	
	public static void outPut(int result) {
		System.out.println("결과 : " + result);
	}
	
	public static void outPut(double result) {
		System.out.println("결과 : " + result);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		powerOn();
		
		while(true) {
			
			System.out.println("-------------------------------");
			System.out.println("##  (1)더하기  (2)빼기  (3)곱하기 ##");
			System.out.println("##  (4)나누기  (5)전원끄기       ##");
			System.out.println("-------------------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 5) {
				powerOff();
			}else if(choice < 1 || choice > 5) {
				System.out.println("잘못입력 하였습니다.");
				continue;
			}
			
			System.out.print("첫번째 수 입력 : ");
			int x = scan.nextInt();
			
			System.out.print("두번째 수 입력 : ");
			int y = scan.nextInt();
			
			switch(choice) {
				
				case 1 :
					outPut(add(x, y));
					break;
				case 2 :
					outPut(subtract(x, y));
					break;
				case 3 :
					outPut(multiply(x, y));
					break;
				case 4 :
					outPut(divide(x, y));
					break;
				
			
			}
			
			
			
			
		}
		
	}

}










