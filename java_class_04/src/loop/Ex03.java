package loop;

public class Ex03 {

	public static void main(String[] args) {
		
		// for문을 사용해서 1에서 10까지의 합 구하기
		// 1 + 2 + 3 + .... 9 + 10 : 55
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1에서 10까지의 합 : " + sum);

	}

}
