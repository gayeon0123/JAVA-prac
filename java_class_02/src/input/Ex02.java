package input;

import java.util.Scanner;

// Scanner 라는 클래스는 java.util 패키지 안에 있는데
// 이것을 가져와서 현재 프로그램에서 사용하겠다. 라는 뜻.
// import 할때는 ctrl + shift + 영문자 o

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		
		String str = scan.next(); // "홍길동"
		// 문자열 : next()
		// 공백전까지 입력한 문자열을 읽어온다.
		
		System.out.println(str);
		
		System.out.print("정수를 입력 : ");
		
		int a = scan.nextInt();
		// 정수 : nextInt()
		// 공백전까지 입력한 정수를 읽어온다.
		
		System.out.println(a);
		
		System.out.print("실수를 입력 : ");
		double b = scan.nextDouble();
		// 실수 : nextFloat() / nextDouble()
		// 공백전까지 실수를 읽어온다.
		
		System.out.println(b);
		
		scan.nextLine(); // 엔터값 처리
		
		System.out.print("문자열을 입력 : ");
		
		String str2 = scan.nextLine();
		
		// 문자열 : nextLine()
		// 라인전체(공백포함) 데이터를 읽어온다.
		
		System.out.println(str2);
		
		
		scan.close();
		
	}

}
