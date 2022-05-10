package day11;

import java.util.Scanner;

/* 학생 클래스를 작성하세요.
 *  필드 : 이름, 학년, 반, 번호, 국어, 영어, 수학, 성적
 *  기능 : 학생정보를 출력하는 기능
 *  	  학년 반 번호가 주어졌을때 일치하는지 확인하는 기능
 *   	  주어진 이름, 국어,영어,수학점수로 수정하는 기능
 * 
 * 
 * */
public class Ex6_Student {

	private String name;
	private int grade, classNum, num;
	private double korScore, engScore, mathScore;

	public void print() {
		System.out.println("===================");
		System.out.println(grade +"학년"+ classNum +"반"+num+"번"+name );
		System.out.println("국어 : " + korScore + "영어 : "  + engScore + "수학 : " + mathScore);
		System.out.println("===================");
}
 /* 기능 : 학년, 반, 번호가 주어질 때 일치하는지 확인하는 메소드
  * 매개변수 : 학년, 반, 번호 => int grade, int classNum, int num
  * 리턴타입 :	 일치여부 => boolean
  * 메소드명 : equal
  */
	public boolean equal(int grade, int classNum, int num) {
	 if(this.grade != grade) {
		 return false;
	 }
	 if(this.classNum != classNum) {
		 return false;
	 }
	 if(this.num != num) {
		 return false;
	 }
	 return true;
	}
	
	/* 기능 : 주어진 이름, 국어, 영어, 수학점수로 수정하는 메소드
	 * 매개변수 : 이름, 국어, 영어, 수학 => double korScore, double engScore, double mathScore, String name;
	 * 리턴타입 : 없음 => void 
	 * 메소드명 : modify
	 */
	//여기에 넣는 순서도 중요하다...
	public void modify(String name, double korScore, double engScore, double mathScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		
		}
	// 우클릭 > source > generate constructor using fields
	// 생성자는 객체를 만들떄 자동으로 한번밖에 호출이 안된다, 그래서 원하는 시점에 마음대로 호출할 수 없다. 그래서 modify라는 메소드로 만들어주는 것이다. (원하는 시점에 호출해주기 위해서)
	public Ex6_Student(String name, int grade, int classNum, int num, double korScore, double engScore,
			double mathScore) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
 }

