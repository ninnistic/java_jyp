package hw_May;

import java.util.Scanner;

import day14.Item;
// Community에서는 외부에서 진행되는 기능들을 넣으면 되겠다!!
// 그러니까 Board 바깥에서, Board를 이용하는 사람들이 실제 행하는 method를 넣는다고 생각해야겠다.
// 실제 user가 동작하기 위해 필요한 기능...or 이용하기 위해 필요한 function을 넣는다고 생각하면 될 것 같다.
// 쉽게 말하면 user가 쓰는 영역??? 으로 보면 이해가 쉬울 것 같다. 흠 
// community 상위에 Console을 만들어서 implemented를 해서 실행하는게 간결 할 것 같다...아마도

public class Community {
	public static final int MAX = 100;
	private Board board[] = new Board[MAX];
	Scanner scan = new Scanner(System.in);
	
	//실제 web을 만약 만든다면 서버에서 불러와야 하는 정보들???
	
	// Constructor
	

	
	// 게시글이 몇개 적혀 있나 확인하는 기능 
	public void readBoard(String id) {
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("1. 글쓰기"); // 글쓰기 안에서 공지쓰기, 일반쓰기로 나눠야 할듯? / 들어가면 글쓴이, 날짜, 제목이 보임. 글고 제목 안에 컨텐츠..
		System.out.println("2. 게시글 확인하기"); // 확인할때마다 조회수증가? count++;?
		System.out.println("3. 게시글 수정하기");
		System.out.println("4. 프로그램 종료하기");
		int menu = -1;
		switch(menu) {
		case 1 :
				break;
				
		case 2 : 
				break;
		case 3 : 
				System.out.println("프로그램을 종료합니다.");
				break;
		default : 
			System.out.println("잘못된 접근입니다.");
		}
	}

	//1. 글쓰기 항목
	/// 일반쓰기와 공지쓰기로 나눔 / 
	// 일반쓰기는 순서에 따라서 1,2,3,4 넘버링 되면서 글이 계속 추가가 된다.
	// 하지만 공지쓰기는 글을 checking할때마다 매번 최상단에 존재해야 한다. 그러면 어떻게 해야할까..?
	
	// 1) 글쓰기를 하면 board의 배열안에 저장이 된다. 번지수대로..
	// 2) 공지는...쓸수 있는 수를 제한을 둬야겠다. 최대 3개 (무한으로 공지를 쓰는 경우는 생각하기 어렵다. )
	// 3) 공지 1개를 작성하면, 가장 최신 글과 번지수를 swap해서 0번지,1번지,2번지에 오게 해야한다.
	// 4) 만약 공지가 1개 작성된 상태에서 글을 작한다면/???? 어렵다ㅏㅏㅏ...
	// 공지게시판과 자유게시판으로 나누는 선택도 할 수 있다. -----
	// 5) 글 쓸 때 nickname, id를 추가하고 날짜를...자동으로 나오게 하려면 LocalDateTime 이용?
	// 5-2) LocalDateTime 이 안되면 -> 그냥 날짜도 적게 만들어야한다.
	
	//2. 게시글 확인하기
	//Board에서 출력 method 이용.
	// 확인할때마다 count++; print랑 count를 엮어서 조회수를 늘려야 한다. 그럼 조회수를 위한 method도.. 만들어야겠다.
	// Board에 선언된 view를 ++; 하기 위해서 게시글 확인할때 view를 매개변수로 받아와야 하는건가?
	
	
	//3. 게시글 수정하기
	//AccountBook에서 했던것처럼 수정 method 이용.
	// 
	
	//4. 종료하기 
	
	
}



