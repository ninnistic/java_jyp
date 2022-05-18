package day05;

public class Ex7_NestedLoop2 {

	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요. 
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요.
		 *      *	*은 한개, 공백은 4개
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5-i; j++) {
					System.out.print(" ");
				} 
			for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		/* 		 *
		 * 		***
		 * 	   *****
		 * 	  *******
		 */
		
	
		for (int i=1; i<=5; i++) {
			for(int j =1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
	//방법2
		
		for (int i=1; i<=5; i++) {
			for(int j =1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		

}
}
}
