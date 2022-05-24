package day19;

import java.util.*;

import day14.ConsoleProgram;
import day18.Student;

public class BoardManager implements ConsoleProgram {
	private List<Board> list;
	private Scanner scan;
	private int exitMenu = 5;
	int view;

	public BoardManager() {
		scan = new Scanner(System.in); // 자체적 스캐너 생성
		list = new ArrayList<Board>();
	}

	public BoardManager(Scanner scan) {
		this.scan = scan;
		list = new ArrayList<Board>();
	}

	public BoardManager(Scanner scan, int size) {
		this.scan = scan;
		list = new ArrayList<Board>(size);
	}

	public BoardManager(List<Board> list, Scanner scan, int exitMenu) {

		this.list = list;
		this.scan = scan;
		this.exitMenu = exitMenu;
	}

	@Override
	public int selectMenu(Scanner scan) {
		menuPrint(scan);
		int menu = scan.nextInt();
		return menu;

	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1: // 글 작성하기
			Board board = createPost();
			// list에 글 추가 
			list.add(board);
			
			
			//list를 정렬 
		
			break;
		case 2: //게시글 확인하기
			printPosting();
			break;
			
		case 3: //글 수정하기
			

			break;
		case 4: //글 삭제하기
			break;
		case 5: //프로그램 종료 

			break;
		}
	}

	@Override
	public void run() {

	}

	// 메뉴 print
	public void menuPrint(Scanner scan) {
		System.out.println("---New Forum----");
		System.out.println("1. 글 작성하기(Create)");
		System.out.println("2. 게시글 확인하기(Read)");
		System.out.println("3. 게시글 수정하기(Update)");
		System.out.println("4. 게시글 삭제하기(Delete)");
		System.out.println("5. 게시판 떠나기(Exit)");

	}

	public boolean postingType(Scanner scan) {
		System.out.println("포스팅할 게시글의 종류를 선택하세요. 일반(1) / 공지(2) ");
		String type = scan.next();
		if (type.equals("1")) {
			System.out.println("일반글을 작성합니다.");
			return true;
		} else if (type.equals("2")) {
			System.out.println("공지를 작성합니다.");
			return true;
		} else {
			System.out.println("잘못 선택 하셨습니다.");
			scan.nextBoolean();
			return false;
		}

	}

	// reload 될 때 마다, 조회수 count++; 랑 글번호 붙이기 :00000
	public Board createPost() {
		String type = scan.next();
		int count = 0;
		if (postingType(scan) == true) {
			System.out.println();
			System.out.print("[1] 제목을 입력하세요. :  ");
			String title = scan.nextLine();
			System.out.print("[2] 작성자를 입력하세요 :  ");
			String writer = scan.next();
			scan.nextLine();
			System.out.print("[3] 내용을 입력하세요. :  ");
			String content = scan.nextLine();
			count++;
			return new Board(type, title, writer, content);

		} else {
			return null;
		}

	}

	public void printPosting() {
		System.out.println(createPost());

	}
	// ----------------------------------------------------------
	
	public void printDetail() {

	}
	// 글 수정 하려면 - writer과 글 번호? 를 가져오게 해야할 것 같다. 

	// 만약에, 게시판이 empty라면... 개어렵다... 
	
	
	//수정 method  ---------------------------------------------
	public void modifyPosting(Board board) {
		if (board == null) {
			System.out.println("작성된 글이 없습니다.");
			return;
		}
		
		System.out.println("수정할 글 번호를 입력하세요. : ");
		int num = scan.nextInt();
		
		
	}
	

}
