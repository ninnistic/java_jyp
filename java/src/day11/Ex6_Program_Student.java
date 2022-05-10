package day11;

import java.util.Scanner;

public class Ex6_Program_Student {

	/* 학생 정보를 관리하는 프로그램을 작성하세요. */
	// 이름, 학년, 반, 번호, 국어, 영어, 수학 성적 관리
	/* 1. 기능을 정리 => 주석
	 * >>학생정보 입력기능
	 * - 학년, 반, 번호, 이름, 국어, 수학, 영어 성적을 한번에 입력받는다.
	 * - 입력한 학생정보를 저장  
	 * >> 학생 정보 출력기능
	 * - 전체 학생의 학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 출력한다.
	 * >>학생정보 수정기능 
	 * - 학년, 반, 번호를 입력받음
	 * - 입력받은 정보와 일치하는 학생이 있으면 이름, 국어, 영어, 수학, 성적을 전부 수정한다 (생성자 오버로딩?)
	 * >> 학생정보 삭제기능
	 * - 학년, 반, 번호를 입력받음
	 * - 입력받은 정보와 일치하는 학생이 있으면, 삭제
	 * >> 프로그램 종료  
	 * 2. 필요한 클래스가 있는지 확인하고, 있으면 만들어야한다.
	 * - 학생 클래스 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적 
	 * - 기능 : 학생 정보를 출력하는 기능. 
	 *  	 	학년, 반, 번호가 주어졌을 때 일치하는지 확인하는 기능.
	 *  		주어진 이름, 국어, 영어, 수학점수로 수정하는 기능
	 * - 생성자 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적이 주어졌을 때 초기화하는 생성자
	 * 3. 기능을 구현
	 * - 클래스 정의 및 구현
	 * -반복문을 이용하여 메뉴 출력 및 메뉴 선택 
	 * - 선택한 메뉴에 따른 조건문 생성
	 */

	//Student 클래스를 생성해서 필드값으로 받아야하는 학생정보 설정
	//근데 한두명을 받을게 아니라, 여러명을 받아야 한다면... 배열이나, 혹은 배열보다 나은 정렬의 형태를 갖춰야 한다.
	//학생 정보를 받으면 출력을 해야 하니까, 배열 출력 메소드 하나
	//오름차순이나 내림차순으로 보여줄 수 있으면 좋을 것 같다. - 정렬 메소드
	//고등학교가 만약에 같은 고등학교라면, 필드값에서 고등학교는 고정으로 초기화해둘듯...받을 필요가 없으니까.
	// 생성자에서 객체마다 다르게 생성되어야 하는 값을 초기화 해준다. 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		final int max = 30; // final을 붙이면 상수취급
		Ex6_Student std[] = new Ex6_Student[max];

		int index = 0;

		for (; menu != 5;) {
			menu = selectMenu(scan);
			int grade, classNum, number;
			double korScore, engScore, mathScore;
			String name;

			switch (menu) {
			case 1:
				// 학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 입력을 받는다.
				System.out.println("학생 정보를 입력하세요 (학년,반,번호,이름 순) : ");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				number = scan.nextInt();
				name = scan.next();
				System.out.println("학생 성적을 입력하세요 (국어,영어,수학 순) : ");
				korScore = scan.nextInt();
				engScore = scan.nextInt();
				mathScore = scan.nextInt();

				// Ex6_Student의 생성자를 이용하여 객체를 생성한 후 학생배열 std에서 index번지에 저장
				std[index] = new Ex6_Student(name, grade, classNum, number, korScore, engScore, mathScore);

				// index를 1 증가시킨다.index는 저장된 학생의 수 
				index++;
				break;

			case 2:
				// 반복문을 이용해서 index 0번지부터 index명 만큼 학생 정보를 출
				for (int i = 0; i < index; i++) {
					//System.out.println(std[index]); 이게 아니라
					std[i].print();
				}
				break;

			case 3:
				// 이름 국영수 성적 값을 넣으면 수정해줘야함..
				// tutors solution
				System.out.println("수정할 학생의 학년, 반, 번호를 입력하세요");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				number = scan.nextInt();
				for (int i = 0; i < index; i++) {
					// 입력받은 학년반번호와 일치하는 학생이 있는지 확인해서 있으면 성적을 입력받고 수정하고 종료

					if (std[i].equal(grade, classNum, number) == true) {
						System.out.println("수정할 학생의 이름, 국영수 성적을 입력하세요");
						name = scan.next();
						korScore = scan.nextDouble();
						mathScore = scan.nextDouble();
						engScore = scan.nextDouble();
						std[i].modify(name, korScore, mathScore, engScore);
						break;
					}
					//등록된 학생 전체를확인해서 일치하는 학생이 없으면 등록된 학생이 아니라고 출력. 
					if (i + 1 == index) {
						System.out.println("등록된 학생이 아닙니다.");
					} // 마지막 학생까지 확인해서 없으면, 없는거임..... 이 부분이 이해가 잘 안된다.
				}

			case 4:
				System.out.println("삭제할 학생의 학년, 반, 번호를 입력하세요");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				number = scan.nextInt();
				// 반복문을 이용하여 0번지부터 index명의 학생을 비교하여 일치하는 학생 정보가 있으면 몇번지인지 기억을한다.
				// 그런다음 반복문을 종료한다. 
				int delIndex = -1;
				for (int i = 0; i < index; i++) {
					if (std[i].equal(grade, classNum, number) == true) {
						delIndex = i;
						break;
					}
					
				}
				//delIndex가 0 이상이면 => 즉 일치하는 학생이 있으면.
				//반복문을 이용하여 delIndex 번지부터 index-2번지까지 다음번지에 있는 정보를 현재번지에 저장.
				
				if (delIndex >= 0) {
					for(int i = delIndex; i < index-2; i++) {
						std[i] = std[i+1];
					}
					index--;
				}else{
					System.out.println("등록된 학생이 아닙니다.");
					//delindex가 0미만이면 등록된 학생이 아닙니다를 출력. 
				}
				break;

			case 5:
				System.out.println("프로그램을 종료합니다 ---");
				break;
			default:
				System.out.println("메뉴를 잘못 선택했습니다.");
			}

		}
	}

	/* 기능 : 메뉴를 출력하고, 메뉴를 입력하면 입력한 메뉴를 돌려주는 메소드
	 * 매개변수 : 입력받기 위한 Scanner => Scanner scan
	 * 리턴타입  입력한 메뉴 => 정수 => int
	 * 메소드명 : selectMenu
	 * 
	 */
	public static int selectMenu(Scanner scan) {
		System.out.println("----------메뉴---------");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 삭제");
		System.out.println("5.프로그램 종료");
		System.out.println("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		System.out.println("---------------------");
		return menu;

	}

}
