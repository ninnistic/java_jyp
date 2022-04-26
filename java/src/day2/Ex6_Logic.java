package day2;

public class Ex6_Logic {

	public static void main(String[] args) {
		/*논리 연산자에서 연산자 양쪽으로 참 또는 거짓이 옴.
		일반적으로 논리연산자 양쪽으로 조건식이 나옴.
		
		조건식 : 결과가 참 또는 거짓으로 나오는 식
		
		1+2 : 조건식이 아님
		1>2 : 조건식 
		
		AND : &&, ~하고 A이고 B이며, ~이고, 둘다 참이면 참, 하나라도 거짓이면 거짓 
		
		A학점은 성적이 90점 이상이고, 100점 이하이다.
		A>90 && A<100
		
		80점은 100점보다 낮지만, 90점보다 아래이기 때문에 한쪽이 거짓이라 false.
		
		OR : ||, ~하거나, ~ 이거나, 둘다 거짓이면 거짓, 하나라도 참이면 참. 
		
		주민등록증이거나, 여권이거나, 학생증이거나 운전면허증이거나. (토익볼때)
		
		XOR : ^, 서로 같거나 다르면 거짓, 하나만 다르거나 같으면 참. 
		
		NOT : !, 참은 거짓, 거짓은 참 (반대)
		*/
		
		/* 성적이 A학점인가?
		 * A학점의 기준 90점 이상, 100점 이하.
		   score이 90점 이상이고 100점 이하이다.
		   socre >= 90 && score =< 100 
		 */
		
		int score = 89;
		System.out.println(score + "점은 A학점인가? " + (score >= 90 && score<= 100)); // false
		
		/* 유효하지 않은 성적인가? 유효한 성적은 성적이 0점이상 100점이하
		 	유효하지 않은 성적은, 성적이 0점 미만이거나 100점 초과다.
		 	성적 < 0, 성적 > 100
		 	성적이 0점 미만 || 성적이 100점 초과 
		 	score < 0 || score > 100
		 */
		System.out.println(score + "점은 잘못된 성적인가? " + (score < 0 || score > 100)); // false (성적인가? spacebar ")
		
		/* 유효한 성적인가? 잘못된 성적의 반대.
		 */
		System.out.println(score + "점은 유효한 성적인가? "  +  !(score < 0 || score > 100)); //true
		

	}

}
