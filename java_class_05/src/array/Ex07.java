package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 정수5개를 입력받아 intArray 배열의 각요소에 저장하기
		for(int i = 0; i < intArray.length; i++) {
			
			System.out.print(i+1 + "번째 정수를 입력 : ");
			intArray[i] = scan.nextInt();
			
		}
		
		// 2. 배열의 각 요소를 출력 (3의 배수만 출력)
		
		for(int i = 0; i < 5; i++) {
			if(intArray[i] % 3 == 0) {
				System.out.println("intArray[" + i + "] : " + intArray[i]);
			}
			
		}
		
		

	}

}
