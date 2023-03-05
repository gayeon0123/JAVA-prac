package quiz;

public class Ex03 {

	public static void main(String[] args) {
		
		// 이중 for문을 사용해서 별찍기
		// System.out.print("*");
		// System.out.print(" ");
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 4; j >= 0; j--) {
				
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
		
	}

}
