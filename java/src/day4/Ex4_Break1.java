package day4;

public class Ex4_Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int i = 1; i <= 5; i++) { System.out.println("hello"); //i가 선언되고, i가 조건을
		 * 만족하고 그래서 식을 넘어갔는데 break가 되어서 i++까지 갈 수가 없는 것이다. 그래서 dead code라고 뜸 break; }
		 */

		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
			if (i == 3) {
				break;   //switch나 반복문에서 빠져나오는 역할.
			}
		}
	}

}
