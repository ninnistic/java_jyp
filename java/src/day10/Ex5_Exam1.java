package day10;

import java.util.Scanner;

public class Ex5_Exam1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu = -1;
		Student stu = new Student(null, 0, 0, 0);

		while (true) {
			System.out.println("메뉴\n 1. 학생정보 입력\n 2. 학생정보 출력 \n 3. 프로그램 종료");
			System.out.println("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("학생정보 입력하세요. :   ");
				String name = scan.next();
				int grade = scan.nextInt();
				int classNum = scan.nextInt();
				int number = scan.nextInt();
				stu = new Student(name, grade, classNum, number); //멤버변수를 직접적으로 접근하는 것보다 생성자를 만들어서 접근하는게 낫다.
				break;
			case 2:
				stu.print();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}

	}

}

class Student {
	String name;
	int grade;
	int classNum;
	int number;

	public Student(String name, int grade, int classNum, int number) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
	}

	void print() {
		System.out.println(
				"이름 : " + name + " , " + "학년 : " + grade + " , " + "반 : " + classNum + " , " + "번호 : " + number);
	}
}
