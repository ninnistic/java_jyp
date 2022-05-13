package day14;

import java.util.Scanner;

public interface ConsoleProgram {
	
	// 메뉴출력 후 메뉴 선택하는 기능 
	int selectMenu(Scanner scan); // 스캐너로 메뉴를 입력받아서 메뉴를 선택하는기능 // 근데 할 수 있다면 나는 선택한 메뉴만 보여주고 그 안에 들어간걸..나타내고 싶어
	
	// 선택한 기능에 맞게 동작하는 메소드 
	void execute(int menu); 
	
	void run();
	
}
