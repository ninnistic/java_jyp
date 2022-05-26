package day22;

public class Score2 {
	//과목명, 중간, 기말, 수행평가, 학년, 학기
	private String name;
	private int midterm, finals, perf, grade, semester;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMidterm() {
		return midterm;
	}
	public void setMidterm(int midterm) {
		if(midterm < 0 || midterm > 100)
		throw new RuntimeException("0~100 사이의 정수를 입력하세요.");
		this.midterm = midterm;
	}
	public int getFinals() {
		return finals;
	}
	public void setFinals(int finals) {
		if(finals < 0 || finals > 100)
		throw new RuntimeException("0~100 사이의 정수를 입력하세요.");
		this.finals = finals;
	}
	public int getPerf() {
		return perf;
	}
	public void setPerf(int perf) {
		if(perf < 0 || perf > 100)
		throw new RuntimeException("0~100 사이의 정수를 입력하세요.");
		this.perf = perf;
	}
	public int getGrade() {
		
		return grade;
	}
	public void setGrade(int grade) {
		if(grade < 1 || grade > 3)
		throw new RuntimeException("1~3 사이의 정수를 입력하세요.");
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		if(semester < 1 || semester > 2)
		throw new RuntimeException("1~2 사이의 정수를 입력하세요.");
		this.semester = semester;
	}
	public Score2(int grade, int semester, String name, int midterm, int finals, int perf) {
		
		this.name = name;
		setMidterm(midterm); // 예외처리를 다 해두었기 때문에, set을 
		setFinals(finals);
		setPerf(perf);
		setGrade(grade);
		setSemester(semester);
		
	}
	public Score2(int grade, int semester, String name) {
		setGrade(grade);
		setSemester(semester);
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score2 other = (Score2) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (semester != other.semester)
			return false;
		return true;
	}
	@Override
	public String toString() {
	double total = midterm * 0.4 + finals * 0.5 + perf * 0.1;
		return "학년 : " + grade + " 학기" + semester + name + " 중간 : " + midterm + "기말 : " + finals + "수행 : " + perf + "총점 : " + total;
	}
	
}
