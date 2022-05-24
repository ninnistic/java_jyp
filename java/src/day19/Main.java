package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//+ 게시글을 담을 게시판을 생성해야 한다.
		List<Board> list = new ArrayList<Board>();
		
		// 콘솔에서 입력받기 위한 스캐너가 필요합니다.
		Scanner scan = new Scanner(System.in);
	
		// 프로그램 종료 번호
		int exitMenu = 4;
		int menu;
		
		
		//Test 데이터
		list.add(new Board("일반", "일반 제목", "내용1", "홍길동"));
		list.add(new Board("일반", "일반 제목2", "내용1", "홍길동"));
		list.add(new Board("공지", "공지 제목", "내용1", "홍길동"));
		
		// 게시글 등록, 확인, 수정시에 임시로 사용할 변수/참조변수 
		String title, content, writer, type;
		int num, view;
		
		
		
		do {
			//콘솔에 메뉴를 출력해야한다.
			System.out.println("메뉴");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
		
			
			//실행할 메뉴를 콘솔에서 입력받는다.
			menu = scan.nextInt();
			
			//입력받은 메뉴에 맞는 기능을 실행
			switch(menu) {
			case 1: // 게시글 등록 기능 실행
				System.out.println("게시글 정보를 입력하세요.");
				System.out.print("타입[일반, 공지] : ");
				type = scan.next();
				// 제목 입력
				scan.nextLine();
				System.out.print("제목 :  ");
				title = scan.nextLine();
				
				//내용 입력
				System.out.println("내용 :  ");
				content = scan.nextLine();
				
				// 작성장
				System.out.println("작성자 :  ");
				writer = scan.next();
				
				//게시글 생성후에 저장(리스트에 생성한 게시글을 추가)
				list.add(new Board(type, title, content, writer));
			
				break;
			case 2: // 게시글 확인기능
				// 전체 게시글 확인
				System.out.println("번호 \t 제목 \t 작성자 \t 작성일 \t 조회수 ");
				for(Board tmp : list) {
					System.out.println(tmp);
				}
				// 게시글 선택
				System.out.println("게시글 선택[나가기 : -1] : ");
				num = scan.nextInt();
				
				if(num >= 0) {
					//게시글 상세 확인하기. list에서 (num-1)번지의 게시글을 가져온다.
					Board tmp = list.get(num-1);
					
					//조회수 증가
					tmp.updateView();
					// 가져온 게시글의 상세내용 확인 : detailPrint()를 호
					tmp.detailPrint();
				}
				break;
			case 3: // 게시글 수정 기능 수행
				System.out.println("번호 \t 제목 \t 작성자 \t 작성일 \t 조회수 ");
				for(Board tmp : list) {
					System.out.println(tmp);
				}
				//게시글 선택
				System.out.println("게시글 선택 : ");
				num = scan.nextInt();
				scan.nextLine();
				
				// 게시글 제목 입력 : 
				System.out.println("제목 :");
				title = scan.nextLine();
				
				// 게시글 내용 입력
				System.out.println("내용 : ");
				content = scan.nextLine();
				
				//게시글 수정
				// 선택한 게시글을 가져온다.
				Board tmp = list.get(num-1);
				
				// 가져온 게시글 수정 : modify 호출
				tmp.modify(title, content);
				/* List에 set을 이용 안한 이유 : 안해도 가능하기 때문에 */
				break;
			case 4:
				break;
			default:
			}
			
		}while(menu != exitMenu);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
