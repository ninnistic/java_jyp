package day2;

public class Ex4_String {

	public static void main(String[] args) {
		/* 문자열 + 문자열 -> 문자열
		 * 문자열 + 정수 -> 문자열 
		 * 문자열 + 문자 -> 문자열
		 * 문자열 + 실수 -> 문자열 
		 */
		String str = "Hello"; // String은 첫 문자 Uppercase
		str = str + " world"; // world 앞에 spacebar 안 치면 붙어서 나옴. 
		System.out.println(str);
		str = str + '!';
		System.out.println(str);
		str = str + 123; // 문자열과 정수의 결합 가능
		System.out.println(str);
		str = str + 1.23;
		System.out.println(str); // 123과 1.23이 더해지는게 아니라 말 그대로 각각의 chunk가 이어져서 붙어짐.
		str = str + true;
		System.out.println(str); // 논리형 또한 chunk끼리 붙어서 나옴. 문자열은 하나의 단위로 문자로서만 인식된다.
		

	}

}
