package day14;

import java.util.Scanner;

public class AccountBookManager implements ConsoleProgram {

	private Scanner scan;						// AccountBookManager에서 AccountBook과 Scanner를 멤버로 가져온 이유..?
	private AccountBook accbook;       // 이것도 상관 없음 										// 
	private final int exitMenu = 5; //종료 메뉴 번호

	public AccountBookManager(Scanner scan) { // 생성자의 매개변수로 Scanner scan이 들어감. 생성자는 객체가 생성될때 최초로 실행되는 메소드. 
	
		this.scan = scan; 
		accbook = new AccountBook(); // 매개변수에서 넘겨준 값으로 할 때는 위에 초기화를 하면 안된다.  
											// 객체멤버의 초기화의 마지막은 생성자다!! (생성자 블록에서 초기화)
		// 샘플 데이터(테스트용)
		Item item = new Item("2022-05-13", false, "신용카드", "점심", 7000);
		accbook.insertItem(item);
	}
	
	// ---------------------------------------------인터페이스 추상 메소드 재정의----

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("=========메뉴=========");
		System.out.println("1. 가계부 확인");
		System.out.println("2. 가계부 추가");
		System.out.println("3. 가계부 수정");
		System.out.println("4. 가계부 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("=====================");
		return menu;
	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1:

			readAccountBook();
			break;

		case 2:
			if (insertAccountBook()) {
				System.out.println("내역을 추가했습니다.");
			} else {
				System.out.println("내역 추가에 실패했습니다.");
			}
			System.out.println("--------------------");
			break;
		case 3:
			if (modifyAccountBook()) {
				System.out.println("수정에 성공했습니다.");
			} else {
				System.out.println("수정에 실패했습니다. ");
			}
			break;
		case 4:
			Item delItem = deleteAccountBook();
			if (delItem != null) {
				System.out.println(delItem);
				System.out.println("위 항목이 삭제 되었습니다.");
				System.out.println("--------------------");
			} else {
				System.out.println("삭제에 실패 했습니다.");
				System.out.println("--------------------");
			}
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			System.out.println("=======================");
		}

	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			execute(menu);
		} while (menu != exitMenu);
		System.out.println("가계부가 종료되었습니다.");
		System.out.println("====================");

	}
	
	// ---------------------------------------------인터페이스 추상 메소드 재정의----
	
	// ---------------------------------------------AccountBookManager의 자체 메소드 ----
	public void readAccountBook() {                    		// 가계부 읽는 method
		System.out.print("전체(1) / 날짜(2) 선택 :  ");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1 : accbook.readItems();
			break;
		case 2: 
			System.out.println("날짜 입력(yyyy-mm-dd) : ");
			String date = scan.next();
			accbook.readItems("date",date);
			break;
		default:
		}
		System.out.println("======================");
	}

	public boolean insertAccountBook() {		//가계부에 내역 추가하는 method
		System.out.print("날짜 : ");
		String date = scan.next();
		System.out.print("수입(true)/ 지출(false) :  ");
		boolean income = scan.nextBoolean();
		System.out.print("결제 방식 :   ");
		String payment = scan.next();
		System.out.print("항목 :  ");
		String content = scan.next();
		System.out.print("금액 :  ");
		int price = scan.nextInt();
		Item item = new Item(date, income, payment, content, price);
		return accbook.insertItem(item);
	}

	public boolean modifyAccountBook() {		// 가계부 수정하는method
		accbook.readItems();
		System.out.println("수정할 항목(정수) :  ");
		int modIndex = scan.nextInt();
		System.out.println("======================");
		// 가계부에서 수정하려고 한 내역을 출력하면 된다.
		Item tmp = accbook.getItem(modIndex - 1);
		if (tmp != null) {
			System.out.println(modIndex + ". " + tmp);
		} else {
			return false;
		}
		System.out.println("======================");
		System.out.println("선택한 항목은 위 내역입니다. 수정 하시겠습니까? [예 true/ 아니오 false]");
		boolean ok = scan.nextBoolean();
		if (!ok) {
			return false;
		}
		System.out.print("수입(true)/ 지출(false)[필수] :  ");
		boolean income2 = scan.nextBoolean();
		System.out.print("날짜를 수정하겠습니까 (예 : true/ 아니오 : false) : ");
		ok = scan.nextBoolean();
		System.out.println();
		String date2 = null;
		if (ok) {
			System.out.print("날짜 : ");
			date2 = scan.next();
		}
		System.out.print("결제 방식 수정하겠습니까 (예 : true/ 아니오 : false) : ");
		ok = scan.nextBoolean();
		String payment2 = null;
		if (ok) {
			System.out.print("결제 방식 : ");
			payment2 = scan.next();
		}
		System.out.print("항목을 수정하겠습니까 (예 : true/ 아니오 : false) : ");
		ok = scan.nextBoolean();
		String content2 = null;
		if (ok) {
			System.out.print("항목  : ");
			content2 = scan.next();
		}
		System.out.print("결제 방식 수정하겠습니까 (예 : true/ 아니오 : false) : ");
		ok = scan.nextBoolean();
		int price2 = -1;
		if (ok) {
			System.out.print("금액 : ");
			price2 = scan.nextInt();
		}
		return accbook.modifyItem(modIndex - 1, date2, income2, payment2, content2, price2);

	}

	public Item deleteAccountBook() {
		// 삭제를 하려면??
		accbook.readItems(); // 우선 항목을 읽어와야한다.
		System.out.println("삭제할 항목(정수) :  ");
		int delIndex = scan.nextInt();
		// 가계부에서 수정하려고 한 내역을 출력하면 된다.
		Item tmp = accbook.getItem(delIndex - 1);
		if (tmp != null) {
			System.out.println(delIndex + ". " + tmp);
		} else {
			return null;
		}
		System.out.println("======================");
		System.out.println("선택한 항목은 위 내역입니다. 삭제 하시겠습니까? [예 true/ 아니오 false]");
		boolean ok = scan.nextBoolean();
		if (!ok) {
			return null;
		}
		return accbook.deleteItem(delIndex - 1);
	}

}
