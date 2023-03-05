package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		int score = scan.nextInt();
		
		// if문을 사용해서 A, B, C 등급 나누기
		// score 가 80점 미만이라면 C등급 출력
		// score 가 80 ~ 89점 이면 B등급 출력
		// score 가 90 ~ 100점 이면 A등급 출력
		
		if(score < 80) {
			System.out.println("C등급 입니다.");
		}
		
		if(score >= 80 && score <= 89) {
			System.out.println("B등급 입니다.");
		}
		
		if(score >= 90 && score <= 100) {
			System.out.println("A등급 입니다.");
		}
		
		// if문 만으로도 코드를 작성할 수 있다.
		// 하지만 좀 더 편리하게 사용하기 위해 else가 나왔다.
		
		if(score < 80) {
			System.out.println("C등급 입니다.");
		}else if(score < 90) {
			System.out.println("B등급 입니다.");
		}else {
			System.out.println("A등급 입니다.");
		}
		
		
		

	}

}
