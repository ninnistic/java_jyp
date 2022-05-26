package day22;

/* execute(management system)
 * 1. 성적 추가
 * 2. 성적 확인
 * 3. 성적 수정
 * 4. 프로그램 종료
 * 
 * ---------------------------
 * 
 * Score class <Based class>
 * Student class 
 * 
 */

public abstract class Score {
	
	String subject;
	int midtermScore;
	int finalScore;
	int perfScore; // 수행평가
	int grade;
	String classNum;
	int semester;
	
	abstract void insertScore();
	
	abstract void printScore();
	
	abstract void modifyScore();
}

