package loop;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print(i + "번째 숫자를 입력 : ");
			num = scan.nextInt();
			
			sum += num;
			System.out.println(i + "번째 합계 : " + sum);
			
		}
		
		scan.close();
		
		

	}

}
