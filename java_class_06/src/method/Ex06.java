package method;

public class Ex06 {
	
	public static void sum1(int... a) { // 매개값을 가변적으로 받는경우
		
		int sum = 0;
		
		for(int i : a) { // 향상된 for문
			sum += i;
		}
		
		System.out.println("정수의 합 : " + sum);
		
	}
	
	public static void sum2(int[] array) { // 매개값이 배열로 들어오는 경우
		
		int sum = 0;
		
		for(int i : array) {
			sum += i;
		}
		
		System.out.println("배열의 요소의 합 : " + sum);
		
	}
	
	
	public static void main(String[] args) {
		
		sum1(1, 2, 3);
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		sum2(intArray);
		
	}

}
