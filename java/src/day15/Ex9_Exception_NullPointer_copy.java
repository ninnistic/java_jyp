package day15;

public class Ex9_Exception_NullPointer_copy {

	public static void main(String[] args) {
		/* 문자열이 주어지면 주어진 문자열에 a가 몇개 있는지 확인하는 코드를 작성하세요. */

		/* String str = "abc";
		int count = 0;
		for( int i = 0; i < str.equals(); count++) {
			System.out.println(str.chadAt('a'));
			count++;*/

		String str = null;
		int count = 0;
		try {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a') {
					count++;
				}

			}
			System.out.println(count);
		} catch (NullPointerException e) {
			System.out.println("a가 존재하지 않습니다.");
		}

	}

}
