package method;

public class Ex07 {
	
	public static void change1(int a) {
		a = 100;
	}
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	
	public static void main(String[] args) {
		
		int a = 1;
		
		change1(a);
		// 1의 값을 복사해서 넘겼기 때문에 원본의 값은 바뀌지 않는다.
		System.out.println(a);
		
		int[] array = {1, 2, 3, 4, 5};
		
		change2(array);
		// 배열의 주소를 보냈기 때문에 배열의 값을 바꾸면 원본배열이 바뀐다.
		System.out.println(array[0]);
		
		
	}

}
