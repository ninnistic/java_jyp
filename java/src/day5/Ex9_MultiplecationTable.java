package day5;

public class Ex9_MultiplecationTable {

	public static void main(String[] args) {
		/*
		 * 구구단 7단을 출력하는 코드를 작성하세요. 7 X 1 = 7
		 * 
		 */

		/*int num = 7;
		int i;
		for (i = 1; i <= 9; i++) {
			System.out.println(num+ " X " + i + " = " + num * i);
		}*/

		
		/*구구단 2단에서 ~ 9단까지 출력하는 코드를 작성하세요.*/
	
		int num;
		int i;

		for (num = 2; num <= 9; num++) {

			for (i = 1; i <= 9; i++) {
				System.out.println(num + " X " + i + " = " + num * i);
			}

		}

	}

}
		