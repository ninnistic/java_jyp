package day15;

public class Ex3_Exception_NullPointerException {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.charAt(0));
		String str2 = null;
		//System.out.println(str2.charAt(0)); // 경고 표시, 예외 발생
		
		//* 예외가 자주 발생하는 경우 1 : 메소드를 호출하는 경우 메소드에서 null처리를 안하면 발생할 수 있음.
		//charAt(str2, 0); // 경고 표시도 없는데 예외가 발생하는 경우. 
		/* 예외가 자주 발생하는 경우 2 :  클래스를 이용하여 배열을 만드는 경우, 각 값에 객체를 생성후 기능을 호출해야 하는데
		 * 객체 생성 안하고 기능/멤버변수를 호출하는 경우 
		 */
		String arr[] = new String[10]; //ㅂㅐ열이 비어있음(null)인 상태임. 
		for(String tmp : arr) {
			System.out.println(tmp.charAt(0)); // null에서 charAt(0)을 호출해서 였음. (0에서 호출할 글자가 없다..)
		}

	}
	public static void charAt(String str, int index) {
		System.out.println(str.charAt(index));
	}
}
