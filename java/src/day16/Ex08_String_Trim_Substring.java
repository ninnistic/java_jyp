package day16;

public class Ex08_String_Trim_Substring {

	public static void main(String[] args) {
		String str = "\t\t\n\nabcdef\n\n";  //abcdef
		System.out.println(str);
		str = str.trim(); // 앞의 공백, 뒤의 공백 다 사라지게 만든다. 진짜 트림하네...
		System.out.println("------------------");
		System.out.println(str);
		str = str.substring(1); // 1번지부터 끝까지 부분 문자열 리턴해준다. 
		System.out.println(str);
		str = str.substring(1,3); // 1번지부터 3번지전까지.(2번지까지) 부분 문자열 리턴.
		System.out.println(str);
	}

}
