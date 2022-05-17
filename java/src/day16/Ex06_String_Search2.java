package day16;

public class Ex06_String_Search2 {

	public static void main(String[] args) {
		/* 주어진 str에 search가 몇번 있는지 출력하는 코드를 작성하여 확인하세요. */
		String str = "abcdabcf"; //5번 나옵니다.
		String search = "abc";
		int index = 0;
		// 0번지부터 시작... 
		int count = 0;
		do {
			index = str.indexOf(search, index); // 0번지부터 시작해서 내가원하는 단어를 찾아라
			if(index >= 0) {
				count++; // 있으면 카운트를 1 증가시켜라..하 이걸 놓침.
				index = index + search.length(); // 0번지에서 찾았으면, 다음번지는 0+ 글자개수만큼 밀려나서 찾아야한다. 
			}
		}while(index >= 0);
		System.out.println(str+"에는 "+search+ " 가 " + count + "개 있습니다.");
	}

}
