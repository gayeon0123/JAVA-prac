package method;

import java.util.Scanner;

public class Ex08 {
	
	// 1 ~ 10까지 중 정수하나를 반환해주는 메소드 만들기
	
	// 정수 하나를 매개변수로 받아서 그 수 만큼의 길이의 
	// String타입의 배열을 생성한 후 반복문을 통해서
	// 배열의 각 요소에 이름을 입력받아 저장 후
	// String 타입의 배열을 반환해주는 메소드 만들기
	
	// String 배열을 매개변수로 받아서
	// 배열의 요소를 출력해주는 메소드 만들기
	
	public static int getInt() {
		return (int)(Math.random() * 10) + 1;
	}
	
	public static String[] returnNames(int number) {
		
		String[] names = new String[number];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < number; i++) {
			
			System.out.print(i+1 + "번째 이름을 입력 : ");
			names[i] = scan.next();
			
		}
		return names;
	}
	
	public static void arrayPrint(String[] names) {
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(i+1 + "번째 이름은 : " + names[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int number = getInt();
		
		System.out.println("getInt 메소드로 얻은 정수 : " + number);
		
		String[] names = returnNames(number);
		
		arrayPrint(names);
		
	}

}
