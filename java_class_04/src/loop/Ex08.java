package loop;

public class Ex08 {

	public static void main(String[] args) {
		
		// 이중 for문을 사용해서 별모양 만들기
		
		// 이중 for문과 System.out.print("*"); 
		// 를 사용해서 별모양
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}

}
