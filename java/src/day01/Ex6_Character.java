package day01;

public class Ex6_Character {

	public static void main(String[] args) {
		/* 문자 ''안에 들어가는 한 글자를 문자라고 한다. 
		 * 예외 : p.34
		 */

		char ch1 = '\t'; // \t가 한개로 취급된다. Tab키 만큼 공백
		char ch2 = '\n'; // enter 줄바꿈
		char ch3 = '\r'; // return 커서를 앞으로 이동
		char ch4 = '\"'; // "문자
		char ch5 = '\''; // '문자
		char ch6 = '\\'; // \문자
		char ch7 = '\u0000'; // 유니코드 0에 해당하는 문자 
		char ch8 = 'A'; 
		
		int num = 65;
		char ch9 = (char)num;
		System.out.println(ch9); // 유니코드에서 65라는 숫자는 A로 저장되어있음.
		ch9 =(char)(num+1); 
		System.out.println(ch9);
	}

}
