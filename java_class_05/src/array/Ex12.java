package array;

public class Ex12 {

	public static void main(String[] args) {
		
		int[] scores = {80, 68, 79, 94, 100};
		
		for(int score : scores) { // 향상된 for문
			System.out.print(score + "  ");
		}
		System.out.println();
		
		// 학생이 2명 더 늘어났다면...
		
		int[] newScores = new int[7];
		
		for(int i = 0; i < scores.length; i++) {
			
			newScores[i] = scores[i];
			
		}
		
		for(int score : newScores) {
			System.out.print(score + "  ");
		}
		
		System.out.println();
		
		
		

	}

}
