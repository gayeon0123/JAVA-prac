package condition;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력 : ");
		int score = scan.nextInt();
		
		// switch 문을 사용해서 A ~ F 학점 나누기
		// 90 ~ 100점 : A학점
		// 80 ~ 89점 : B학점
		// 70 ~ 79점 : C학점
		// 60 ~ 69점 : D학점
		// 그 외      : F학점
		
		switch(score / 10) {
		
			case 10 :
			case 9 :
				System.out.println("A학점 입니다.");
				break;
			case 8 :
				System.out.println("B학점 입니다.");
				break;
			case 7 : 
				System.out.println("C학점 입니다.");
				break;
			case 6 :
				System.out.println("D학점 입니다.");
				break;
			default :
				System.out.println("F학점 입니다.");
		
		}
		
		
		
		
		
	}

}
