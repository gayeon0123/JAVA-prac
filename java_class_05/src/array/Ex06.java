package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i+1 + "번째 이름을 입력 : ");
			names[i] = scan.next();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + "번째 이름 : " + names[i]);
		}
		
		scan.close();
	}

}
