package operation;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int a, b, result;
		
		Scanner scan = new Scanner(System.in);
		
		// 두 정수를 입력받아 a, b 변수에 저장 후 
		// 사칙연산 계산후 결과 출력하기
		
		System.out.print("첫번째 정수 입력 : ");
		a = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		b = scan.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
		scan.close();
		
	}

}
