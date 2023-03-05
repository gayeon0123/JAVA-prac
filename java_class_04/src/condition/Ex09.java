package condition;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// 출생연도를 입력받아 띠 맞추기
		
		// 쥐, 소, 범, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지
		// 출생년도에서 12로 나누면 원숭이띠가 나머지 0
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		
		System.out.print("출생년도를 입력 : ");
		year = scan.nextInt();
		
		// switch ~ case 문으로 띠 알아보기
		
		switch(year % 12) {
			case 0 :
				System.out.println("원숭이띠!");
				break;
			case 1 :
				System.out.println("닭띠!");
				break;
			case 2 :
				System.out.println("개띠!");
				break;
			case 3 :
				System.out.println("돼지띠!");
				break;
			case 4 :
				System.out.println("쥐띠!");
				break;
			case 5 :
				System.out.println("소띠!");
				break;
			case 6 :
				System.out.println("범띠!");
				break;
			case 7 :
				System.out.println("토끼띠!");
				break;
			case 8 :
				System.out.println("용띠!");
				break;
			case 9 :
				System.out.println("뱀띠!");
				break;
			case 10 :
				System.out.println("말띠!");
				break;
			case 11 :
				System.out.println("양띠!");
				break;
		}
		
		
		
	}

}
