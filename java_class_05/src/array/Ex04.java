package array;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50, 60};
		
		// for문을 사용해서 배열의 각 요소 출력하기
		// if문을 사용해서 index가 3인곳은 출력하지 않고 나머지만 출력해보기
		
		for(int i = 0; i < intArray.length; i++) {
			
			if(i == 3) {
				continue;
			}
			
			System.out.println("intArray[" + i + "] : " + intArray[i]);
			
			
		}
		
	}

}
