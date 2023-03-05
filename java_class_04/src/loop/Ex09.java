package loop;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// while문
		
		int i = 0;
		
		while(i < 5) {
			
			System.out.println("while문 안입니다. i : " + i);
			i++;
			
		}
		
		System.out.println("while문을 나왔습니다. i : " + i);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정답을 입력해주세요");
		
		System.out.print("10 + 20 : ");
		
		int answer = scan.nextInt();
		
		while(answer != 30) {
			
			System.out.println("정답이 아닙니다.");
			System.out.println("다시 입력해주세요");
			System.out.print("10 + 20 : ");
			answer = scan.nextInt();
			
		}
		
		System.out.println("정답을 맞추셨습니다.");
		
		scan.close();
	}

}
