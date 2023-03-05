package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("동전으로 교환할 돈 입력해주세요");
		System.out.print("입력 : ");
		
		int money = scan.nextInt();
		
		System.out.println("교환할 돈 : " + money + "원");
		
		// 500원부터 동전의 갯수를 출력
		// 예) 1780원 >> 500원 : 3개, 100원 : 2개
		//              50원 : 1개, 10원 : 3개
		
		// for문과 배열을 사용해서 동전의 갯수 출력
		
		for(int i = 0; i < coin.length; i++) {
			
			System.out.println(coin[i] + "원 : " + (money / coin[i]) + "개");
			
			money %= coin[i];
			
		}
		
		System.out.println("잔돈 : " + money + "원");
		
		scan.close();
		
	}

}
