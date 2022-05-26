package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.*;

public class Ex07_Lambda_Predicate {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, 100, 98, 100, "박지영"));
		list.add(new Student(1, 1, 3, 29, 40, 66, "김땡"));
		list.add(new Student(1, 2, 4, 40, 70, 77, "홍길동"));
		list.add(new Student(1, 2, 5, 99, 100, 88, "이제훈")) ;
		
		System.out.println("1학년 학생들의 평균 : " + avg(list, s->s.getGrade() == 1));
		System.out.println("1학년 1반 학생들의 평균 : " + avg(list, s->s.getGrade() == 1 && s.getClasNum()==1));
		System.out.println("1학년 2반 학생들의 평균 : " + avg(list, s->s.getGrade() == 1 && s.getClasNum()==2));

	}
		


	public static double avg(List<Student> list, Predicate<Student> function) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student tmp = list.get(i);
			if(function.test(tmp)) {
				count++;
				sum+=tmp.getEng() + tmp.getKor() + tmp.getMath();
			}
			}
		return sum/(double)(3 * + count);
	}
}
