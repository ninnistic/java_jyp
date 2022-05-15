package hw_May;

// 오 대박 클래스를 두개로 나누는 이유는 Board에서는 이제, Board내부에서 진행되는 메소드들을 넣는것..?
// + 아닌듯... Board는 말 그대로 게시판에서 사용되는 기능들의 선언..? 정도로 가져가야 할 것 같다. 
// ++ 서버에서 게시판이 build되는 과정으로 봐야할까???
// +++ 서버 내부에서는 그러면... 게시판의 속성 / 게시판 생성자 / 게시판 관리자가 게시판 항목이랑... 게시판 항목 삭제가 가능하게 하는 method? 
// ++++ 쉽게 말하면 관리자의 영역 

//필요한 field : 아이디, 닉네임, 공지(공지 tag), 제목, 글 내용, 조회수, 날짜, 
public class Board {
	private String id; 
	private String username;
	private String notice;
	private String title;
	private String contents;
	private int view;
	
	public Board(String id, String username, String notice, String title, String contents, int view) {
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
	
	 // 1. 무슨 기능이 있는지 print해주는 메소드. (읽는)
	// 2. 필요한 항목을 수정할 수 있는 메소드.   /// Question. - 수정과 추가는 같은 영역일까 다른 영역일까??? 다른듯 추가는 늘어나는거니까?
	// 3. 항목을 삭제할 수 있는 메소드. 
	// 4. 항목을 추가 할 수 있는 메소드. // 여기까지는 서버의 영역이라고 생각하면 class를 나누는게 이해가 그나마 수월해질 것 같다...
}

