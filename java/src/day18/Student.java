package day18;


/* Student class */
public class Student implements Cloneable { // student의 실체 클래스?
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;

	
/* Student의 생성자 */
	public Student(int grade, int classNum, int num, String name, int kor, int eng, int math) {

		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		/*this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;*/ //이거 대신 modify를 넣어도 된다. 
		modify(name, kor, eng, math);
	}
	
	public void modify(String name, int kor, int eng, int math) {
		// 아아 순수하게 학생정보를 수정하기 위해서 미리 편하게 만들어놓은 것.
		// std.name 하면 귀찮으니까.
		// 정보를 쉽게 수정하기 위해서 만들어 놓은 것이다. 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	/* 기본 생성자 */
	public Student() {
	}
	
	/* 글자정보를 보기 위한 overriding */
	@Override
	public String toString() {
		return "[grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + ", kor=" + kor
				+ ", eng=" + eng + ", math=" + math + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public Student clone() {
		try {
			Student std = (Student) super.clone();
			std.name = new String(name); // 공유하지 않음... 이름으로 // 별다른 이유없다...배운거 적용해보려고...
			return std;

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
