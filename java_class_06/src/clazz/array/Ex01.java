package clazz.array;

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("제목 : " + title + ", 작가 : " + author);
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		// 길이가 5인 Book 타입의 배열생성
		
		books[0] = new Book("java", "홍길동");
		// Book 객체를 생성해서 배열의 각 요소에 저장
		books[1] = new Book("JSP", "성춘향");
		books[2] = new Book("파이썬", "이순신");
		books[3] = new Book("c언어", "이몽룡");
		books[4] = new Book("SPRING", "장보고");
		
		for(int i = 0; i < books.length; i++) {
			
			System.out.println(books[i].title + " : " + books[i].author);
			// 객체원소에 도트연산자 (.)를 사용해서 필드나 메소드 접근
		}
		
		System.out.println();
		
		for(int i = 0; i < books.length; i++) {
			
			books[i].showInfo();
			
		}
		
		
	}

}







