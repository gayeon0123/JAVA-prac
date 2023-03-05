package modifier;

import java.util.Scanner;

// Machine 클래스를 만든다.
// 필드는 private static int ticketSu = 10; 
// 티켓수를 출력해주는 showTicket 정적 메소드를 만든다.
// 정수 하나를 매개변수로 받아서 티켓을 구입하는 buyTicket 메소드를 만든다.
// (받은 정수가 티켓수보다 많으면 구입할 수 없고, 티켓수가 0이되면 프로그램 종료하기)

class Machine {
	
	private static int ticketSu = 10;
	
	public static void showTicket() {
		System.out.println("현재 남은 티켓수는 : " + ticketSu + "장 입니다.");
	}
	
	public void buyTicket(int number) {
		
		if(number > ticketSu) {
			showTicket();
			System.out.println("티켓을 구입할 수 없습니다.");
			return;
		}else {
			ticketSu -= number;
			System.out.println(number + "장의 티켓을 구입하였습니다.");
		}
		
		if(ticketSu == 0) {
			System.out.println("티켓이 모두 판매되었습니다.");
			System.out.println("티켓판매 프로그램 종료합니다.");
			System.exit(0);
		}
		
	}
	
	
}



public class Ex03 {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("## 1.첫번째 티켓판매기 2.두번째 티켓판매기 ##");
			System.out.println("## 3.티켓수 확인하기  4.티켓 프로그램 종료 ##");
			System.out.println("-------------------------------------");
			System.out.print("선택 : ");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			
				case 1 :
					System.out.print("몇장의 티켓을 구입할까요? : ");
					int number1 = scan.nextInt();
					machine1.buyTicket(number1);
					break;
				case 2 :
					System.out.print("몇장의 티켓을 구입할까요? : ");
					int number2 = scan.nextInt();
					machine2.buyTicket(number2);
					break;
				case 3 :
					Machine.showTicket();
					break;
				case 4 :
					System.out.println("티켓 프로그램 종료합니다.");
					System.exit(0);
				default :
					System.out.println("잘못 입력 하였습니다..");
			
			}
			
			
		}
		
		
		

	}

}









