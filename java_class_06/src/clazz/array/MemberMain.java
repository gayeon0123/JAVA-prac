package clazz.array;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		Scanner scan = new Scanner(System.in);
		
		service.memberInsert();
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("## 1.회원 목록보기  2.회원정보 수정하기 ##");
			System.out.println("## 3.회원 프로그램 종료하기           ##");
			System.out.println("------------------------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			
				case 1 :
					service.memberList();
					break;
				case 2 :
					service.memberEdit();
					break;
				case 3 :
					System.out.println("회원 프로그램 종료합니다.");
					System.exit(0);
				default :
					System.out.println("잘못입력 하였습니다.");
			
			}
			
			
		}
		
		
		

	}

}
