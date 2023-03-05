package variable;

public class Ex09 {

	public static void main(String[] args) {
		
		byte a = 65;
		char ch = (char)a; // 강제 타입변환 (캐스팅)
		System.out.println(ch);
		
		int b = 128;
		byte c = (byte)b; // 강제 타입변환
		// 지정된 타입보다 값이 더 클 경우
		// 강제 타입변환을 하면 (OverFlow) : 가장 작은값으로 돌아간다.
		System.out.println(c);
		
		float d = 3.99f;
		int e = (int)d; // 강제 타입변환
		// 실수를 정수로 강제 타입변환을 하면 정수부분만 저장된다.
		System.out.println(e);

	}

}
