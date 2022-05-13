package day14;

import java.util.Scanner;

public class BaseballGame implements ConsoleProgram {

	private Scanner scan;
	private final int exitMenu = 3;
	private int com[] = new int[3];
	private int user[] = new int[3];
	private int record[] = new int[10]; // 기록 
	private int recordCount = 0; // 기록에 등록된 개수 
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
			//사용자 숫자 입력
			//strike, ball, out 판별
			//기록 
			break;
		case 2:
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
			excute(menu);
		} while (menu != exitMenu);
		System.out.println("게임을 종료합니다.");
		System.out.println("-------------");

	}
	
	public void createComRandom() {
		int count = 0;
		while(count < com.length) {
			//랜덤 수 생성
			int r = random(min,max);
			
			//중복 체크 -> 중복이 아니면 저장
			if(indexOf(com,count,r) == -1) {
				com[count++] = r;
				System.out.println(r + " ");
			}
			//count를 증가
		}
		}
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min); 
	}
	
	public static int indexOf(int arr[], int size, int num) { // 배열에 내가 원하는 값을 찾아서 있으면 1을 없으면 -1을 리턴하는게 indexOf
		if(size == 0) {
			return -1;
		}
		if(arr.length < size) {
			size = arr.length;
		}
		for(int i = 0; i < size; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public BaseballGame(Scanner scan) {
		this.scan = scan;
	}

}