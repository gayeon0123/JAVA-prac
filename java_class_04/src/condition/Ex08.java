package condition;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 주민번호를 입력받아 성별 맞추기
		
		char gender = ' '; // 성별
		String ssn = " "; // 주민번호
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ex) 123456-1234567");
		System.out.println("위 예시대로 -를 포함한 주민번호를 입력해주세요");
		System.out.print("입력 : ");
		
		ssn = scan.next();
		
		gender = ssn.charAt(7);
		// 문자 중에 0부터 시작해서 7번째 문자를 뽑는다.
		// 123456-1234567
		// 01234567
		
		switch(gender) {
		
			case '1' :
			case '3' :
				System.out.println("남자 입니다.");
				break;
				
			case '2' :
			case '4' :
				System.out.println("여자 입니다.");
				break;
				
			default :
				System.out.println("유효하지 않은 주민번호 입니다.");
		}
		
		scan.close();

	}

}










