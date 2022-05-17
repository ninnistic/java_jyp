package day16;

public class Ex07_String_Replace {

	public static void main(String[] args) {
	
		String str = "I love C";
		System.out.println(str);
		str = str.replace("C", "Java");
		System.out.println(str);
		str = str + ". Java is a programming language";
		System.out.println(str);
		str = str.replace("Java", "C");
		System.out.println(str);
	}

}
