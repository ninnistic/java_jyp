package day5;

public class Ex10_NestedLoop_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* a
		 * ab
		 * abc
		 * abcd...
		 */
		/*char ch = 'a';
		for (int i = 1; i <= 25; i++) 
		for (ch = 'a'; ch <= 'a'+i; ch++) {
			{
				System.out.print(ch);
			}
			System.out.println();
		
	}*/
	
	
		
		for(char end = 'a'; end<='z'; end++) {
			for(char cha = 'a'; cha <= end; cha++) {
				System.out.print(cha);
			}
			System.out.println();
		}
			

}
}
