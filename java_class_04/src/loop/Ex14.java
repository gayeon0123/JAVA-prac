package loop;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// 커피숍 주문받기
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("주문하시겠습니까???");
			System.out.println("<1>아메리카노 <2>라떼 <3>아이스티 <4>그만주문");
			menu = scan.nextInt();
			
			switch(menu) {
			
				case 1 :
					System.out.println("#아메리카노 주문을 합니다.");
					break;
				case 2 :
					System.out.println("#라떼 주문을 합니다.");
					break;
				case 3 :
					System.out.println("#아이스티 주문을 합니다.");
					break;
				case 4 :
					System.out.println("#커피숍을 나옵니다..");
					break;
				default :
					System.out.println("#잘못주문 하였습니다.");
			
			}
			
			
		}while(menu != 4);
		
		
		
		
		

	}

}
