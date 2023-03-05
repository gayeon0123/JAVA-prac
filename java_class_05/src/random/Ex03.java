package random;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 로또 게임
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] myLotto = new int[6];
		
		int count = 0;
		
		// 중복수 없이 1 ~ 45 정수중 6개를 뽑아서
		// lotto 배열의 각 요소에 저장하기
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 내가 1 ~ 45까지 정수 중 6개를 입력하여 
		// myLotto 배열의 각 요소에 저장하기
		// 나도 1 ~ 45까지의 정수만 입력, 나도 중복수 X
		
		for(int i = 0; i < 6; i++) {
			
			System.out.print(i+1 + "번째 로또번호를 입력 : ");
			myLotto[i] = scan.nextInt();
			
			if(myLotto[i] < 1 || myLotto[i] > 45) {
				System.out.println("1에서 45 사이의 정수를 입력해주세요~!!!");
				i--;
				continue;
			}
			
			for(int j = 0; j < i; j++) {
				
				if(myLotto[i] == myLotto[j]) {
					System.out.println("전과 같은번호를 입력할 수 없습니다!!!");
					i--;
					break;
				}
				
			}
			
		}
		
		// lotto 배열의 요소와 myLotto 배열의 요소를 비교하여
		// 몇개나 같은수가 있는지 count 변수에 저장하기
		
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 6; j++) {
				
				if(lotto[i] == myLotto[j]) {
					count++;
				}
				
			}
		}
		
		System.out.printf("이번주 로또 당첨 번호는 %d, %d, %d, %d, %d, %d 입니다.\n", 
				lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
		
		System.out.println(count + "개를 맞추셨습니다!!!");
		
		if(count == 6) {
			System.out.println("1등 입니다!!!! 상금 100억");
		}else if(count == 5) {
			System.out.println("2등 입니다!!!! 상금 50억");
		}else if(count == 4) {
			System.out.println("3등 입니다!!!! 상금 10억");
		}else {
			System.out.println("다음 기회에....");
		}
		
		
	}

}
