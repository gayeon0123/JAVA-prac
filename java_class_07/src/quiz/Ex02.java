package quiz;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// 3개의 정수를 입력받아 몇번째 입력받은 수가 제일 큰수인지 알아보기
		// (if - else - if 문 사용)
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		
		System.out.print("세번째 정수 입력 : ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("첫번째 입력한 수가 제일 큰 수 입니다.");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("두번째 입력한 수가 제일 큰 수 입니다.");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("세번째 입력한 수가 제일 큰 수 입니다.");
		}else {
			System.out.println("중복된 수가 있습니다.");
		}
		
		
	}

}
