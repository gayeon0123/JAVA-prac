package loop;

public class Ex07 {

	public static void main(String[] args) {
		
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("2X%d=%d\n", i, i*2);
//		}
		
		// 이중 for문을 사용해서 구구단 2 ~ 9단까지 출력하기
		
		int dan;
		int num;
		
		for(num = 1; num < 10; num++) {
			
			for(dan = 2; dan < 10; dan++) {
				
				System.out.printf("%dX%d=%d\t", dan, num, dan*num);
				
			}
			System.out.println();
			
		}
		
		

	}

}
