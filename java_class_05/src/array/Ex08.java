package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] javaScores = new int[5];
		
		int sum = 0;
		double avg = 0.0;
		
		// 1. 반복문을 통해 5명의 자바점수를 입력받아 
		//    배열의 각 요소에 저장하기
		for(int i = 0; i < 5; i++) {
			
			System.out.print(i+1 + "번째 학생의 자바점수 입력 : ");
			javaScores[i] = scan.nextInt();
			sum += javaScores[i];
		}
		
		// 2. 반복문을 통해 각 학생의 자바점수 출력하기
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번째 학생의 자바점수 : " + javaScores[i]);
		}
		
		// 3. 총 자바점수의 합과 평균을 구한 후 출력하기
		avg = sum / 5.0;
		
		System.out.println("총 자바점수의 합 : " + sum);
		System.out.println("자바점수 평균 : " + avg);
		
		scan.close();
		
		

	}

}
