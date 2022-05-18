package day03;

import java.util.Scanner;

public class Ex2_Scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ctrl+shift+O, import 단축키 
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble();
		System.out.print("입력한 실수는 " + num1 + "입니다.");
		
		// next()는 앞 뒤 공백을 제외한 단어를 읽어온다.
		System.out.print("단어를 입력하세요.");
		String str = scan.next();
		System.out.print("입력한 단어는 "+str+"입니다.");
		
		
		//Scanner에는 문자를 받는 기능이 없다.
		//charAt(번지) : 문자열에서 번지에 해당하는 문자를 가져옴. 0번지부터 시작 (ex. abc 를 입력했다 치면 a만 가져옴(0번째))
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(5);
		System.out.print("입력한 문자는 "+ch+"입니다.");
	
		
		
		
		scan.close();
	}

}
