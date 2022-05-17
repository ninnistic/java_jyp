package day15;

public class Ex9_Exception_NullPointer {

	public static void main(String[] args) {
		/* 문자열이 주어지면 주어진 문자열에 a가 몇개 있는지 확인하는 코드를 작성하세요. */

		/* String str = "abc";
		int count = 0;
		for( int i = 0; i < str.equals(); count++) {
			System.out.println(str.chadAt('a'));
			count++;*/
		
		//조심해야 하는 포인트 !! count까지 try안에 넣어버리면, 변수가 안에서 선언되어버려
	//밖에서 못 쓸 수도 있으니 조심해야 한다!!!
		
		String str = null;
		int count = 0;
		try {

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a') {
					count++;
				}

			}

		} catch (NullPointerException e) {
			System.out.println("객체가 비어있습니다.");
		}
		System.out.println("문자열에는 a가" + count +"개 있습니다.");
	}

}
