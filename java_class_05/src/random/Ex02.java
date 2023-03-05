package random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		// 로또추첨 : 1 ~ 45 정수 중에서 6개 숫자를 뽑는것.
		
		// for문과 Math.random() 를 사용해서
		// 로또번호 6개를 뽑아서 lotto배열의 각 요소에 저장하기
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {// j < i : j는 i의 아랫수까지만 반복
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
			
		}
		
		// 번호 출력하기
		for(int i = 0; i < lotto.length; i++) {
			
			System.out.print(lotto[i] + "  ");
			
		}
		System.out.println();
		
		

	}

}
