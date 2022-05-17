package day16;

public class Ex05_String {

	public static void main(String[] args) {
		String str = "Hello world Hello";
		String search = "wo"; // 대소문자 잘 가리길...
		// 문자열.indexOf(검색어)
		// indexOf 는 일치하는 문자열이 없으면 -1, 있으면 시작번지 
		// 여러개 있어도, 처음 시작하는 번지를 찾는다.
		// 공백도 문자열로 인식한다.
		// 문자열.(검색어, 시작번지)
		// 문자열에서 시작번지부터 검색어를 찾아 있으면 시작번지, 없으면 -1
		
		
		int index = str.indexOf(search);
		if(index >= 0) {
		System.out.println(str + " 문자열에 " + search + " 문자열은 " + index + " 번지에 있습니다.");
		index = str.indexOf(search, index+search.length());
		if(index >= 0) {
			System.out.println(str + " 문자열에 " + search + " 문자열은 " + index + " 번지에 2개 있습니다.");
		} else {
			System.out.println(str + " 문자열에 " + search + " 문자열은 1개 있습니다."); // 음수일때 -1이라서 -1번지로 나옴...
		}
	} else {
		System.out.println(str + " 문자열에 " + search + "문자열은 없습니다.");
	}
	System.out.println(str.lastIndexOf(search));
	System.out.println(str.contains(search));
	}
}
