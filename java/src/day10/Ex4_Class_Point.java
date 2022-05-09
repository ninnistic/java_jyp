package day10;

import java.util.Scanner;

public class Ex4_Class_Point {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 좌표를 입력하세요. ( 예 : 1 2 3) : 1 2 3 
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * (1,2,3)
		 *메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 프로그램 종료
		 */

		Scanner scan = new Scanner(System.in);
		int menu = -1;
		Point3D1 p3 = new Point3D1(0, 0, 0);

		while (true) {
			System.out.println("메뉴\n 1.좌표설정\n 2.좌표출력 \n 3.종료");
			System.out.println("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				// 생성자를 호출해서 넣어야 하는건가?
				System.out.println("좌표를 입력하세요. :   ");
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = scan.nextInt();
				p3 = new Point3D1(x, y, z); //멤버변수를 직접적으로 접근하는 것보다 생성자를 만들어서 접근하는게 낫다.
				break;
			case 2:
				p3.print();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			scan.close();
		}
	}
}

/* 다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하세요.
 * 점 x, 점 y, 점 z
 *  기능 : 좌표를 출력하는 기능
 *  
 *  */
class Point3D1 {
	int x;
	int y;
	int z;

	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void print() {
		System.out.println("좌표 :  " + x + "," + y + "," + z);
	}
}
