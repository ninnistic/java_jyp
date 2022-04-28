package day4;

public class Ex3_For3_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요.
		 * */
		
		 
		 for (char i=65; i<=90; i++) {
			 System.out.println(i);
		 }
		 
		 
		 /* 선생님 코드
		  <방법1>
		  int i; 
		  for(i=0; i<26; i++) {
		  System.out.println(i)((char)('a'+1));
		  
		  *
		  *
		  *<방법2>
		  *char j;
		  *for ( j='a'; j<='z', j++   ) {	
		  *sysout(j);	  *
		  *}
		  *
		  */
		 
		 int num1 = 1;
		 char ch1 = 'a' + 1; // 리터럴 상수 1은 char타입이어서 괜찮음...
		 //char ch2 = 'a'+ num1 // num1의 1은 int타입이어서 타입변환이 발생하고 그래서 앞에 (char)을 붙여주어야 한다.
	
		 }
		
	}

