package day16;

public class Ex04_String_Constructor {

	public static void main(String[] args) {
		
		// 문자열을 리터럴 문자열로 초기화 하면 같은 리터럴 문자열로
		// 초기화한 다른 문자열과 공유
		// 그러나, 생성자를 이용하면 같은 내용의 문자열이더라도 다른 주소에 할당된다. 
		String str1 = "abc";
		String str2 = new String("abc"); // 생성자로 만들
		String str3 = "abc";
		
		if(str1 == str2 ) {
			System.out.println("str1과 str2가 같은 주소");
		}else {
			System.out.println("1, 2 다른주소");
		}
		if(str1 == str3) {
			System.out.println("1, 3 같은주소");
		} else {
			System.out.println("다른 주소");
		}
	}

}
