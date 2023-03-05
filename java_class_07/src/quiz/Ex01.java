package quiz;

public class Ex01 {

	public static void main(String[] args) {
		
		// 정수 65를 byte 변수에 저장한 후 아스키 문자로 출력하기
		// (정수 65는 아스키문자로 A)
		
		byte ascii = 65;
		
		System.out.println((char)ascii);
		
		// -------------------------------
		
		int x = 0;
		int add = 0;
		
		while(x < 10) {
			add += ++x;
		}
		
		// 다음 while문에서 한줄코드로만 작성하여
		// 1부터 10까지 더하는 식을 완성하기
		System.out.println("1에서 10까지의 합 : " + add);
		
		
		
	}

}
