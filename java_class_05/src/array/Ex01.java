package array;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray1 = {1, 2, 3};
		// 실제값을 알고 있을때
		// 선언과 동시에 배열을 생성하면 new 연산자 생략 가능
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// 배열사용은 [] 안에 인덱스를 이용해서 사용한다.
		
		int[] intArray2 = null;
		// 실제 배열을 참조하지 않는다는 뜻으로 null이라는 값으로 
		// 배열변수를 초기화 시켜줄 수 있다.
		intArray2 = new int[] {10, 20, 30};
		// 배열변수가 이미 선언된 이후에는 
		// new 연산자를 사용해서 배열생성을 해준다.
		
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int[] intArray3 = new int[3]; // 저장할 배열의 길이만 지정할때
		
		intArray3[0] = 100;
		intArray3[1] = 200;
		intArray3[2] = 300;
		// index를 통해 배열의 각 요소에 데이터를 넣어준다.
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
		
	}

}
