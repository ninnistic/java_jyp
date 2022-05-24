package day20;

import java.util.ArrayList;
import java.util.*;

public class Ex01_List {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>(); // 점들을 관리하는 리스트다. <Point>를 생략하면 <Object>가 오는것과같다.
		Point pt = new Point();
		list.add(pt); // 이렇게 pt를 이용해서 넣어버리면, 외부에서 직접 리스트를 건드릴 수 있음(외부에서 list의 pt를 바꿔버릴 수 있다.) // 비추 
		list.add(new Point()); // <Object>가 오면, Object의 객체들을 관리하는 것과 같다.
		list.add("123");
		list.indexOf(pt); // 참조변수를 직접 넣어줬기 때문에 리스트에 있는 객체와 pt가 같은 객체를 공유한다. 그래서 eqauls를 오버라이딩하지 않아도 가능하다.(가능하기만 함 비추임)
		for(Object tmp : list) {
			if(tmp instanceof Point) {
			Point p = (Point)tmp; // 타입변환 가능 // 형변환을 하려면 조상과 자식 관계여야 한다.
			System.out.println(p.x + "  , "+ p.y);
			}else {
				System.out.println(tmp); //"123"은 조상 자식 관계가 아니기 때문에 instanceof로 확인해줘야 한다.
			}
		}
		/* - list에서 indexOf, contains, containsAll, remove, 등을 이용할 때 (오버라이딩이)
		 * -  필요한 메소드 : Point 클래스의 equals // no Object's equals
		 * - equals를 오버라이딩 하지 않으면, Object의 equals가 호출이 된다. 이 때, equals는 주소를 비교
		 * - (같은 객체를 두 참조변수가 공유하는지를 확인) 하고, 
		 */
		
	}

}



class Point{
	int x, y;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}