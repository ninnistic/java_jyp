package hw_May;

import java.util.Scanner;

import day14.Item;

public class Community {
	//필요한 field : 아이디, 닉네임, 공지(공지 tag), 제목, 글 내용, 조회수, 날짜, 
	private String id; 
	private String username;
	private String notice;
	private String title;
	private String contents;
	private int view;
	public static final int MAX = 100;
	private Board board[] = new Board[MAX];
	Scanner scan = new Scanner(System.in);
	
	// Constructor
	public Community(String id, String username, String notice, String title, String contents, int view) {
		this.id = id;
		this.username = username;
		this.notice = notice;
		this.title = title;
		this.contents = contents;
		this.view = view;
	}
	
	// Getters and Setters 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getView() {
		return view;
	}

	public void setViewCount(int viewCount) {
		this.view = viewCount;
	}

	
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

}



