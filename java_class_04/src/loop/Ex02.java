package loop;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("for문 안입니다. i : " + i);
		}
		
		System.out.println("for문을 나왔습니다... i : " + i);
		
		// 2 4 6 8 10 출력
		
		for(int j = 2; j <= 10; j += 2) {
			System.out.print(j + "  ");
		}
		
		
		
		
	}

}
