package array;

public class Ex13 {

	public static void main(String[] args) {
		
		// 2차원배열 : 행과 열로 구성된 배열
		
		int[][] array = new int[2][2];
		// 행과 열의 길이가 2인 int타입의 배열
		
		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;
		
		// 2차원 배열 array배열은 행의주소를 갖고 행을 가리키며,
		// 각각의 행들은 열의 주소를 가지고 열을 가리킨다.
		
		for(int i = 0; i < array.length; i++) { // 행의 길이
			
			for(int j = 0; j < array[i].length; j++) { // 열의 길이
				
				System.out.printf("%d\t", array[i][j]);
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		// 가변배열 : 2차원 배열을 생성할때 열의 길이를 명시하지 않음으로
		//			행마다 다른 길이의 배열을 생성할 수 있다.
		
		int[][] array2 = new int[3][];
		
		array2[0] = new int[] {1, 2};
		array2[1] = new int[] {3, 4, 5};
		array2[2] = new int[] {6};
		
		for(int i = 0; i < array2.length; i++) { // 행의 길이
			
			for(int j = 0; j < array2[i].length; j++) { // 열의 길이
				
				System.out.printf("%d\t", array2[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}





