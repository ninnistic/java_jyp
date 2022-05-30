package day24;

import java.util.Scanner;

import day14.ConsoleProgram;

public class ContactsAdmin implements ConsoleProgram{
	private Scanner scan;
	
	
	
	
	public ContactsAdmin(Scanner scan) {
		this.scan = scan != null ? scan : new Scanner(System.in);
		if( scan!= null) 
			this.scan = scan;
		else
			this.scan = new Scanner(System.in);
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 확인");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 선택 :  ");
		return scan.nextInt();
	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1 : 
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		
		
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(null);
			execute(menu);
			
		}while(menu != 4);
		
		
	}
/* 전화번호 관리 프로그램
 * 1. 전화번호 추가
 * 2. 전화번호 확인
 * 3. 전화번호 검색
 * 
 * 1. 사람이름과 전화번호를 입력함. 입력한 전화번호 정보를 관리
 * 2. 저장된 전화번호들 전체를 출력
 * 3. 사람이름으로 전화번호를 검색 
 * 
 * 
 * 메뉴 
 * 1. 전화번호 추가
 * 2. 전화번호 확인
 * 3. 전화번호 검색
 * 4. 프로그램 종료
 * 
 * 
 */

}
