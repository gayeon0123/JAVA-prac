package clazz.array;

import java.util.Scanner;

public class MemberService {
	
	// 필드
	Member[] members;
	
	Scanner scan = new Scanner(System.in);
	
	
	public void memberInsert() {
		
		System.out.print("등록할 회원 수 : ");
		int memberSu = scan.nextInt();
		
		members = new Member[memberSu];
		
		for(int i = 0; i < memberSu; i++) {
			
			System.out.print(i+1 + "번째 회원의 이름 : ");
			String name = scan.next();
			System.out.print(i+1 + "번째 회원의 나이 : ");
			int age = scan.nextInt();
			System.out.print(i+1 + "번째 회원의 전화번호 : ");
			String tel = scan.next();
			
			members[i] = new Member(name, age, tel);
			
		}
		
		
	}
	
	public void memberList() {
		
		for(int i = 0; i < members.length; i++) {
			
			String name = members[i].getName();
			int age = members[i].getAge();
			String tel = members[i].getTel();
			
			System.out.println(i+1 + "번째 회원의 이름 : " + name
					+ " | 나이 : " + age + " | 전화번호 : " + tel);
			
		}
		
	}
	
	public void memberEdit() {
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(i+1 + "번째 회원 : " + members[i].getName());
		}
		System.out.println();
		
		System.out.print("수정할 회원의 번호 : ");
		int num = scan.nextInt();
		
		System.out.println(members[num-1].getName() + "회원의 정보를 수정합니다.");
		
		System.out.println(members[num-1].getName() + "님의 나이는 : "
				+ members[num-1].getAge() + "살 입니다.");
		
		System.out.print("수정할 나이 : ");
		int age = scan.nextInt();
		
		System.out.println(members[num-1].getName() + "님의 전화번호는 : "
				+ members[num-1].getTel() + "번 입니다.");
		
		System.out.print("수정할 전화번호 : ");
		String tel = scan.next();
		
		members[num-1].setAge(age);
		members[num-1].setTel(tel);
		
		System.out.println(members[num-1].getName() 
				+ "님의 나이와 전화번호가 수정되었습니다.");
		
	}
	
	
	
	
}







