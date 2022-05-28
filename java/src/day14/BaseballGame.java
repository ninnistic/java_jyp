package day14;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaseballGame implements ConsoleProgram {

	private Scanner scan;
	private final int exitMenu = 3;
	private List<Integer> com = new ArrayList<Integer>();
	private List<Integer> user = new ArrayList<Integer>();
	private List<Integer> records = new ArrayList<Integer>();

	private int min = 1;
	private int max = 9; // 숫자 야구 게임의 최소값과 최대값 

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("======메뉴======");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("===============");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("===============");
		return menu;

	}

	@Override
	public void execute(int menu) {
		switch (menu) {
		case 1:
			//컴퓨터 랜덤수 생성
			createComRandom();
			System.out.println();
			int count = 0;
			while (true) {
				user.clear();

				//숫자를 3개 입력
				inputNumbers(3);

				//스트라이크, 볼 개수 확인
				

				count++;
				// 스트라이크, 볼 결과를 출력후, 게임 종료 여부를 알려준다.
				if (printResult()) {
					break;
				}
			}
			record(count, 5);
			break;
		case 2:
			printRecord();
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
			System.out.println("=============");
		}

	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			execute(menu);
		} while (menu != exitMenu);
		System.out.println("게임을 종료합니다.");
		System.out.println("-------------");

	}

	public void createComRandom() {
		com.clear(); //  이전 play에서 사용한 숫자들을 지워줘야함. 
		while (com.size() < 3) {
			//랜덤 수 생성
			int r = random(min, max);

			//중복 체크 -> 중복이 아니면 저장
			if (com.indexOf(r) == -1) {
				com.add(r);
				System.out.println(r + " ");
			}
		}
	}

	public static int random(int min, int max) {
		if (min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public BaseballGame(Scanner scan) {
		this.scan = scan;
	}

	public void inputNumbers(int count) { // 숫자 입력하는 메소드 

		String str = "중복되지 않게 {0}~{1} 사이의 {2}개의 숫자를 입력하세요."; //필수 아님그냥 연습해본거...
		String formatStr = MessageFormat.format(str, min, max, count);
		System.out.println(formatStr);
		System.out.println("입력 : ");
		user.clear();

		while (user.size() < count) {
			try {
				int num = scan.nextInt();
				// 범위 넘어가면 예외 발
				if (num < min || num > max) {
					throw new ArithmeticException();
				}
				// 중복된 숫자면 예외 발
				if (user.contains(num)) {
					throw new ArithmeticException();
				}
				user.add(num);

			} catch (ArithmeticException e) {
				System.out.println("중복되거나 범위를 벗어났습니다. 다시 입력하세요.");
				if (scan.hasNextInt()) {
					scan.nextLine(); // 버려주는 역할...?
				}

			} catch (Exception e) {
				// 숫자가 아닌 문자를 입력했을 때, 범위가 아닌 숫자를 입력했을 떄,중복될 
				System.out.println("입력이 잘못 되었습니다. 다시 입력하세요.");
				scan.nextLine();
			}
		}
	}

		public boolean printResult() {
			int strike = 0;
			for (int i = 0; i < com.size(); i++) {
				if (com.get(i).equals(user.get(i))) {
					strike++;
				}
			}
			int ball = 0;
			for (Integer tmp : com) {
				if (user.contains(tmp)) {
					ball++;
				}

			}
			ball = ball - strike;

			if (strike != 0) {
				System.out.println(strike + "S");
			}
			if (ball != 0) {
				System.out.println(ball + "B");

			}
			if (strike == 0 && ball == 0) {
				System.out.println("0");
			}
			System.out.println();
			if(strike == 3) {
				return true;
			}
			return false;
	
	}
	public void record (int count, int max) {
		records.add(count);
		records.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});
		if (records.size() > max) {
			records.remove(max);
		}
	}
	public void printRecord() {
		if(records.size() == 0) {
			System.out.println("기록이 없습니다. 도전하세요.");
			return;
		}
		for(int i = 0; i < records.size(); i++) {
			System.out.println(i+1+". " + records.get(i) + "회");
		}
		
	}
}
