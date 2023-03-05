package random;

public class Ex01 {

	public static void main(String[] args) {
		
		double a = Math.random() * 10;
		// 0.0 ~ 0.999999 // 0.0 ~ 9.999999
		System.out.println(a);
		
		int b = (int)(Math.random() * 10);
		// 0 ~ 9
		System.out.println(b);
		
		// 주사위 번호 하나를 뽑아서 출력하기
		
		int myDice = (int)(Math.random() * 6) + 1;
		
		System.out.println("나의 주사위 번호 : " + myDice);
		
		
	}

}
