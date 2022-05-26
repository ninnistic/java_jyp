package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex07_Lambda_Function {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1,100,98,100,"박지영"));
		list.add(new Student(1,1,3,29,40,66,"김땡"));
		list.add(new Student(1,1,4,40,70,77,"홍길동"));
		list.add(new Student(1,1,5,99,100,88,"이제훈"));
		BiFunction<Student, String, Integer> f = (Student std, String subject) -> {
			if(subject.equals("국어")) 	return std.getKor();			
			if(subject.equals("영어"))   return std.getEng();
			if(subject.equals("수학"))   return std.getMath();
			return 0;
		};
		
		System.out.println("학생들의 국어 총점 : " + sum(list, "국어", f));
		System.out.println("학생들의 영어 총점 : " + sum(list, "영어", f));
		System.out.println("학생들의 수학 총점 : " + sum(list, "수학", f));
	

	}
	public static int sum(List<Student>list, String subject, BiFunction<Student, String, Integer> function) {
		int sum = 0;
		for(int i = 0; i < list.size(); i ++) {
			sum += function.apply(list.get(i), subject);
		}
		return sum;
	}
}

class Student {
	private int grade, clasNum, num, kor, eng, math;
	private String name;
	
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", clasNum=" + clasNum + ", num=" + num + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", name=" + name + "]";
	}

	public Student(int grade, int clasNum, int num, int kor, int eng, int math, String name) {
		super();
		this.grade = grade;
		this.clasNum = clasNum;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
		Student other = (Student) obj;
		if (clasNum != other.clasNum)
			return false;
		if (eng != other.eng)
			return false;
		if (grade != other.grade)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClasNum() {
		return clasNum;
	}
	public void setClasNum(int clasNum) {
		this.clasNum = clasNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}