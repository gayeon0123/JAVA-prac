package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArray = {100, 200, 300, 400, 500};
		
		// index를 입력받아 해당하는 값 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("intArray 배열의 인덱스는 0 ~ 4까지 입니다.");
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		
		if(index < 0 || index > 4) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}else {
			System.out.println("intArray[" + index + "] : " + intArray[index]);
		}
		
		scan.close();

	}

}
