package day22;

import java.util.Scanner;

public class Student extends Score {
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	void insertScore() {
		System.out.println("-------성적입력 프로그램입니다.----");
		System.out.print("과목명 : ");
		subject = scan.next();
		System.out.print("중간성적 : ");
		midtermScore = scan.nextInt();
		System.out.print("기말성적 : ");
		finalScore = scan.nextInt();
		System.out.print("수행평가 : ");
		perfScore = scan.nextInt();
		System.out.print("학년 : ");
		grade = scan.nextInt();
		System.out.print("학기 : ");
		semester = scan.nextInt();
		
	
	}

	@Override
	void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void modifyScore() {
		// TODO Auto-generated method stub
		
	}

	
}
 