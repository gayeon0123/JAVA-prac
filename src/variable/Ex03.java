package variable;

public class Ex03 {

	public static void main(String[] args) {
		
		int price1 = 100;
		int $price = 200;
		int _price = 300;
		//int #price = 400; // $나 _외에 다른 특수기호 사용못함
		//int 1price = 500; // 숫자로 시작할 수 없다.
		
		System.out.println(price1);
		System.out.println($price);
		System.out.println(_price);
		
		int 한글 = 1000;
		System.out.println(한글);
		
		String firstname = "JAVA";
		String firstName = "자바";
		// String은 문자열을 저장하는 타입이다.
		// 자바의 변수는 대소문자를 구별한다.
		
		System.out.println(firstname);
		System.out.println(firstName);
		
		

	}

}
