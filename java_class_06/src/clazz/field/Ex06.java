package clazz.field;

import java.util.Scanner;

class Calculator { 
	
	// 필드
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int add() {
		return x + y;
	}
	
	public int subtract() {
		return x - y;
	}
	
	public int multiply() {
		return x * y;
	}
	
	public double divide() {
		return (double)x / y;
	}
	
	
}


public class Ex06 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사칙연산 계산할 첫번째 정수 입력 : ");
		int x = scan.nextInt();
		
		System.out.print("사칙연산 계산할 두번째 정수 입력 : ");
		int y = scan.nextInt();
		
		cal.setX(x);
		cal.setY(y);
		
		System.out.printf("%d+%d=%d\n", x, y, cal.add());
		System.out.printf("%d-%d=%d\n", x, y, cal.subtract());
		System.out.printf("%dX%d=%d\n", x, y, cal.multiply());
		System.out.printf("%d/%d=%.2f\n", x, y, cal.divide());
		
		scan.close();
	}

}





