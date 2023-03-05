package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		// for문을 사용해서 이름, 국어점수, 영어점수를 입력받아
		// 해당 배열의 각 요소에 저장하기 (총점까지 구하기)
		for(int i = 0; i < 3; i++) {
			
			System.out.print(i+1 + "번째 학생의 이름 : ");
			name[i] = scan.next();
			
			System.out.print(i+1 + "번째 학생의 국어점수 : ");
			kor[i] = scan.nextInt();
			
			System.out.print(i+1 + "번째 학생의 영어점수 : ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i];
			
		}
		
		// 순위 구하기 [이중for문, if문]
		// 우선 1등으로 초기화를 해준 후에 
		// 다른 학생 성적의 총점을 비교하여 
		// 총점이 더 작다면 순위를 하나 올려주기
		
		for(int i = 0; i < 3; i++) {
			
			rank[i] = 1;
			
			for(int j = 0; j < 3; j++) {
				
				if(total[i] < total[j]) {
					rank[i]++;
				}
				
			}
			
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등 입니다.\n"
							, name[i], total[i], rank[i]);
			
		}
		
		scan.close();
		

	}

}
