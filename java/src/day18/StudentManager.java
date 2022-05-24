package day18;

import java.util.*;

import day14.ConsoleProgram;

//Consoleprogram을 impl했는데 오버라이딩 해줘야합니다!!
//
public class StudentManager implements ConsoleProgram { // as a program

	private Scanner scan;
	private List<Student> list; // 필드가 private이라고 무조건 getter setter을 생성하는 것은 아니다...  
	private int exitMenu = 5;

	//--------------------------------------생성자--------------------------------------//

	public StudentManager() {
		scan = new Scanner(System.in); // 자체적 스캐너 생성
		list = new ArrayList<Student>();
	}

	public StudentManager(Scanner scan) {
		this.scan = scan;
		list = new ArrayList<Student>();
	}

	public StudentManager(Scanner scan, int size) {
		this.scan = scan;
		list = new ArrayList<Student>(size); // 이 사이즈는 어디서 왔을까..? = list에서 왔단다...
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("----------메뉴---------");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 삭제");
		System.out.println("5.프로그램 종료");
		System.out.println("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		System.out.println("---------------------");
		return menu; // 스캔을 받고 menu로 넘어간다. 
	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1:
			// 학생 정보를 scanner로 입력받아 입력받은 정보로 이루어진 학생 객체를 받아오는 메소드.
			System.out.println("학생 정보를 입력하세요. 학년, 반, 번호, 이름 순입니다.");
			Student std = stuInfo();
			// 학생 정보를 추가.
			addStuInfo(std);
			break;
		case 2:
			printStudent();
			break;
		case 3:
			//학년, 반, 번호를 입력받아 학생 객체 A 생성 
			Student modStd = searchStuInfo();
			//학생 객체 A가 리스트에 있으면,
			int index = list.indexOf(modStd);
			if (index >= 0) {
				// 수정할 이름,국어, 영어, 수학을 입력받아서 학생객체 A를 수정한다.
				modifyStuInfo(modStd);
				// 리스트에서 학생객체 A로 수정을 해준다. 
				list.set(index, modStd);
			} else {
				System.out.println("등록되지 않은 학생 정보입니다. 1번을 이용하세요.");
			}

			//없으면 없는 학생이라고 알려준다.
			break;
		case 4:
			Student delStd = searchStuInfo();
			if(list.remove(delStd)) {
				printMessage("학생 정보를 삭제 했습니다.");
			}else {
				printMessage("등록되지 않은 학생 정보입니다. 삭제할 수 없습니다.");
				
			}
			break;
		case 5:
			break;
		default: 
			printMessage("잘못된 메뉴를 선택했습니다!!!!");
			
		}

	}

	@Override
	public void run() { //main에서 넘어와서 do while문을 실행한다. 그 다음 select menu로 이동. 거기서 입력을 받고
		//excute로 간다. 그 다음 끝나면 while로 간다. 할게 있으면, 하고 eximenu면 끝이난다.
		int menu;

	 	do {
			try {
	 		menu = selectMenu(scan); // 메뉴가 exitMenu가 아닐 떄 까지 반복. 
	 		execute(menu);
	 		}catch (Exception e) {
	 			menu = 0; 
 				printMessage("잘못된 형식의 메뉴를 입력했습니다."); 
				scan.nextLine();
			}
		} while (menu != exitMenu);

	}

	private Student stuInfo() {
		try {
			System.out.println("학생 정보를 입력하세요.");
			System.out.print("학년 반 번호 이름 입력하세요. : ");
			int grade = scan.nextInt();
			int classNum = scan.nextInt();
			int num = scan.nextInt();
			String name = scan.next();
			System.out.print("국어 영어 수학 성적을 입력하세요 : ");
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			return new Student(grade, classNum, num, name, kor, eng, math);
		} catch (Exception e) {
			printMessage("잘못된 값을 입력했습니다. 입력이 취소됩니다.");
			// nextLine()은 입력버퍼에 있는 값들을 enter까지 포함해서 떼어놓는다. 
			// 입력을 잘못 했을때, 입력 버퍼에 있는 내용들을 문자열로 가져와서,(입력버퍼를 비우는 역할)
			scan.nextLine();
			return null;
		}

	} // stuInfo 종료 ----------------------------------------

	private void addStuInfo(Student std) {
		if (std == null) {
			return; // null 체크는 항상 해주어야 한다...
		}
		if (list.contains(std)) {
			System.out.println("----------------");
			System.out.println("이미 추가된 학생입니다. 학생 정보 수정을 이용하세요.");
			System.out.println("----------------");
		}
		list.add(std);
		// 정렬
		list.sort(new Comparator<Student>() {
			@Override
			public int compare (Student o1, Student o2) {
				if(o1.getGrade() != o2.getGrade()) {
					return o1.getGrade() - o2.getGrade();
				}
				if(o1.getClassNum() != o2.getClassNum()) {
					return o1.getClassNum() - o2.getClassNum();
				
				}
				if(o1.getNum() != o2.getNum()) {
					return o1.getNum() - o2.getNum();
				}
				return 0;
			}
		});
		printMessage("학생정보 추가 완료.");

	} // addStuInfo 종료 -----------------------------------------

	private void printStudent() {
		if (list.size() == 0) {
			printMessage("저장된 학생 정보가 없습니다.");
			return;
		}
		for (Student tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("--------------------");
	}

	private Student searchStuInfo() {

		try {
			System.out.println("검색할 학생 정보를 입력하세요.");
			System.out.print("학년 반 번호 입력하세요. : ");
			int grade = scan.nextInt();
			int classNum = scan.nextInt();
			int num = scan.nextInt();
			return new Student(grade, classNum, num, null, 0, 0, 0);
		} catch (Exception e) {
			printMessage("잘못된 값을 입력했습니다. 입력이 취소됩니다.");
			// nextLine()은 입력버퍼에 있는 값들을 enter까지 포함해서 떼어놓는다. 
			// 입력을 잘못 했을때, 입력 버퍼에 있는 내용들을 문자열로 가져와서,(입력버퍼를 비우는 역할)
			scan.nextLine();
			return null;
		}
	}// searchStuInfo -----------------------------------------

	private void modifyStuInfo(Student std) {
		if (std == null) {
			printMessage("학생 정보가 없습니다.");
			return;
		}
		try {
			System.out.println("수정할 학생 정보를 입력하세요.");
			System.out.println("이름 국어 영어 수학 입력 : ");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			std.modify(name, kor, eng, math);
		} catch (Exception e) {
			printMessage("잘못된 값을 입력했습니다. 입력이 취소됩니다.");
			scan.nextLine();
			return;
		}

	}
	private void printMessage(String message) {
		System.out.println("-------------------");
		System.out.println(message);
		System.out.println("-------------------");
	}
	

	
	
	
	
	
	

}
