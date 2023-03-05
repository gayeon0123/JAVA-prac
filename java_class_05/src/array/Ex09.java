package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// 5개의 숫자를 작은수부터 나열하기
		
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[5];
		
		// 1. for문을 사용해서 5개의 정수를 입력받아 배열의 각 요소에 저장하기
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print(i+1 + "번째 정수 입력 : ");
			number[i] = scan.nextInt();
			
		}
		
		int temp = 0;
		
		// 2. 이중 for문 / if문 / temp변수를 사용해서 
		//    number 배열의 인덱스 0부터 작은수로 만들기
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = i; j < 5; j++) {
				
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
				
			}
			
		}
		
		
		System.out.printf("작은수로 정렬 : %d, %d, %d, %d, %d\n", 
				number[0], number[1], number[2], number[3], number[4]);
		
		scan.close();
		
	}

}
