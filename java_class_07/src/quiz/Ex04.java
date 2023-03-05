package quiz;

public class Ex04 {

	public static void main(String[] args) {
		
		// 정수 10, 20, 30, 40, 50 을 배열로 선언
		// 1. new 연산자없이 {} 사용해서 배열 생성 array1
		// 2. 배열변수를 null 로 초기화를 한 후에
		//    배열의 길이를 5로 지정하여 배열 생성 array2
		//    반복문을 사용하여 배열의 각 요소에 정수값 넣기
		
		// 3. 일반 for문을 사용해서 array1 배열 출력하기
		//    향상된 for문을 사용해서 array2 배열 출력하기
		
		int[] array1 = {10, 20, 30, 40, 50};
		
		int[] array2 = null;
		array2 = new int[5];
		
		int value = 10;
		
		for(int i = 0; i < array2.length; i++) {
			
			array2[i] = value;
			value += 10;
			
		}
		
		for(int i = 0; i < 5; i++) { // 일반 for문
			System.out.print(array1[i] + "  ");
		}
		System.out.println();
		
		for(int i : array2) { // 향상된 for문
			System.out.print(i + "  ");
		}
		
		
	}

}
