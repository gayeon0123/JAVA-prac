package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 2개의 정수를 입력받아 if ~ else문을 사용해서 
		// 몇번째 입력받은 수가 큰 수 인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("첫번째 입력한 수가 큰 수 입니다.");
		}else if(num2 > num1) {
			System.out.println("두번째 입력한 수가 큰 수 입니다.");
		}else {
			System.out.println("입력한 두 수는 같은 수 입니다.");
		}
		
		scan.close();
		
		
		
	}

}
