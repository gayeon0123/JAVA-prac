package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		double avg;
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		
		System.out.print("세번째 정수 입력 : ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if(num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
		}else if(num2 < num3) {
			min = num2;
		}else {
			min = num3;
		}
		
		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균 : " + avg);
		

	}

}








