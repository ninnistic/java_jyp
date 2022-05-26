package day22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import day14.ConsoleProgram;

public class ScoreManager implements ConsoleProgram {

	private Scanner scan;
	private int exitMenu = 4;
	private List<Score2> list = new ArrayList<Score2>();

	public ScoreManager(Scanner scan) {
		if (scan == null)
			scan = new Scanner(System.in);
		this.scan = scan;
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("------------------------");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적확인");
		System.out.println("3. 성적수정");
		System.out.println("4. 프로그램 종료");
		System.out.println("------------------------");
		System.out.println("메뉴선택 : ");
		return scan.nextInt();

	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1:
			if (appendScore())
				printMessage(" 성적을 추가했습니다. ");
			else
				printMessage(" 이미 등록된 과목 성적입니다.");

			break;
		case 2:
			printScore();
			break;
		case 3:
			modifyScore();
			break;
		case 4:
			break;
		default:
		}

	}

	private void printScore() {
		System.out.println("---성적 확인 메뉴---");
		System.out.println("1. 모든 과목 확인");
		System.out.println("2. 학기 성적 확인");
		System.out.println("3. 과목 성적 확인");
		System.out.println("메뉴 선택 : ");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			printScoreList(s -> true);
			break;
		case 2:
			System.out.println("학년 : ");
			int grade = scan.nextInt();
			System.out.println("학기 : ");
			int semester = scan.nextInt();
			printScoreList(s -> s.getGrade() == grade && s.getSemester() == semester);
			break;
		case 3:
			System.out.println("과목");
			String name = scan.next();
			printScoreList(s -> s.getName().equals(name));
			break;
		default:
			printMessage("잘못된 메뉴를 선택했습니다.");
		}

	}

	private void sort() { // 정렬하기 
		list.sort((Score2 s1, Score2 s2) -> {
			if (s1.getGrade() != s2.getGrade())
				return s1.getGrade() - s2.getGrade();
			if (s1.getSemester() != s2.getSemester())
				return s1.getSemester() - s2.getSemester();
			return s1.getName().compareTo(s2.getName());
		});
	}

	private void printScoreList(Predicate<Score2> p) {
		List<Score2> tmpList = new ArrayList<Score2>();

		for (Score2 tmp : list) {
			if (p.test(tmp)) {
				tmpList.add(tmp);
			}
		}

		if (tmpList.size() == 0) {
			printMessage("Warning : 출력할 성적이 없습니다.");
		} else {
			for (Score2 tmp : tmpList) {
				System.out.println(tmp);
			}
		}

	}

	private boolean appendScore() {

		System.out.println("추가할 학생 정보를 입력하세요.");

		// 학년, 학기, 과목을 입력
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("학기 : ");
		int semester = scan.nextInt();
		System.out.println("과목 : ");
		String name = scan.next();

		// 학년, 학기, 과목이 같은 성적이 성적 리스트에 있으면 있다고 알림
		Score2 tmp = new Score2(grade, semester, name);
		if (list.contains(tmp)) {
			System.out.println("------------------");
			return false;
		}
		// 중간, 기말, 수행평가 입력 
		System.out.println("중간 : ");
		int midterm = scan.nextInt();

		System.out.println("기말 : ");
		int finals = scan.nextInt();

		System.out.println("수행 : ");
		int perf = scan.nextInt();

		// 성적 정보를 성적 리스트에 추가
		tmp = new Score2(grade, semester, name, midterm, finals, perf);
		list.add(tmp);
		return true;

	}

	@Override
	public void run() {
		//샘플 데이터를 추가
		list.add(new Score2(1, 1, "국어", 100, 100, 90));
		list.add(new Score2(1, 2, "수학", 20, 50, 30));
		int menu = -1;
		do {
			try {
				menu = selectMenu(scan);
				execute(menu);
			} catch (InputMismatchException e) {
				printMessage("올바른 값을 입력하세요.");
				scan.nextLine();

			} catch (RuntimeException e) {
				printMessage(e.getMessage());
			} catch (Exception e) {
				printMessage("예외 발생 : " + e.getMessage());
			}
		} while (menu != exitMenu);

	}

	private void printMessage(String str) {
		System.out.println("---------------------");
		System.out.println(str);
		System.out.println("--------------------");
	}

	private boolean modifyScore() {
		System.out.println("수정할 학생 정보를 입력하세요.");

		// 학년, 학기, 과목을 입력
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("학기 : ");
		int semester = scan.nextInt();
		System.out.println("과목 : ");
		String name = scan.next();

		// 학년, 학기, 과목이 같은 성적이 성적 리스트에 없으면 없다고 알림
		Score2 tmp = new Score2(grade, semester, name);
		int index = list.indexOf(tmp);
		if (index < 0) {
			System.out.println("------------------");
			return false;
		}
		
	
		// 중간, 기말, 수행평가 입력 
		System.out.println("중간 : ");
		int midterm = scan.nextInt();

		System.out.println("기말 : ");
		int finals = scan.nextInt();

		System.out.println("수행 : ");
		int perf = scan.nextInt();
		// 이 코드는 중간에 잘못 입력하면 잘못 입력 되기 전까지 정보만 수정이된다.
		// 리스트에서 학년, 학기, 과목이 같은 성적 정보를 가져온다. 
		//tmp = list.get(index);
		// 가져온 성적 정보를 수정 
		//tmp.setMidterm(midterm);
		//tmp.setFinals(finals);
	    //tmp.setPerf(perf);
		
		
		// 중간에 잘못 입력하면 정보 자체가 수정되지 않는다. 
		tmp = new Score2(grade, semester, name, midterm, finals, perf);
		list.remove(tmp);  // 기존에 있던 학생 정보를 삭제
		list.add(tmp); // 수정한 학생 정보를 추가한다. 
		return true;
	}

}
