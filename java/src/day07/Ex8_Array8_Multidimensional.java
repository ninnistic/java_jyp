package day07;

public class Ex8_Array8_Multidimensional {

	public static void main(String[] args) {
		// 각 반에는 최대 30명, 
		/* 1학년 1반의 국어 성적(정수)를 저장하기 위한 배열을 선언해 보세요. */
	
		int oneOneScores[] = new int[30];
		
		/* 1학년 전체 학생의 국어 성적을 저장하기 위한 배열을 선언해 보세요. 각 학년은 최대 10반까지 있음 */
		
		int totalScores[] = new int[30*10];
		int score[][]= new int[10][30];
		// 문제점 : like totalScores[201] = 100; 몇반의 누구의 성적인지 알기 힘들음.(7반의 22번)
		// oneOneScores[10] = 100; 은 1학년 1반의 11번이라는걸 알 수 있지만.. 여튼 큰 수는 생각하기 힘들다.
		score[6][21] = 100; // 바로 그 7반의 22번 학생 성적
		
		/* 1~3학년 전체 학생의 국어 성적을 저장하기 위한 배열을 선언해 보세요. */
		int score1 [][][] = new int [3][10][30];
		
	}

}
