package day02;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 90 이상 ~ 100 이하
		 * B : 80 이상 ~ 90 미만
		 * C : 70이상 ~ 80 미만
		 * D : 60이상 ~  70미만
		 * F : 0이상 ~ 60미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하기.
		 */

		//<내 코드>
		 int score = -2;
		 
		 if (score < 0 || score > 100) { 
			 System.out.println( "잘못된 성적입니다.");			//일단 큰...틀을 잡고 가장 큰 변수를 다룬다음 세부 변수를 다루는게 나을것 같당.
		 }
		 else if (score >= 90) {
			 System.out.println( score + "은 A입니다.");
		 }
		 else if (score >= 80) {
			 System.out.println( score + "은 B입니다.");
		 }
		 else if (score >= 70) {
			 System.out.println( score + "은 C입니다.");
		 }
		 else if (score >= 60) {
			 System.out.println( score + "은 D입니다.");
		 }
		 else {
			 System.out.println( score + "은 F입니다.");
		 }
			 
			 // 아니면 else { sysout ~ } else이후에 () 소괄호 못옴. 그래서 에러 떴음. // if문은 내가 순서를 어떻게 하느냐가 매우 중요하다. 
		 }
}

		
		