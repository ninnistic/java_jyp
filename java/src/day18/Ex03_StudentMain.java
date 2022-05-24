package day18;

import java.util.Scanner;

public class Ex03_StudentMain { //실행하는 class?

	public static void main(String[] args) { // 메인 호출 
	 Scanner scan = new Scanner(System.in); // scanner를 소환한건 이제 1,2,3,4,5 메뉴를 선택하기 위해서인것 같다. studentmanager에
	 StudentManager sm = new StudentManager(scan); // studenntManager 클래스를 구현했다. // 생성자를 호출해서 넘겨줌  
	 sm.run(); // 클래스가 run이 된다. 그러면 student manager의 run으로 넘어간다.
	 //마지막 run을 하고, eximenu로 run을 오고 더이상 다음 코드가 없으면 실행이 종료된다. main이 종료된다.
	}

}




// 
// selectMenu()
// run
// studentmannager
//스택 main