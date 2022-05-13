package day14;

//가계부
public class AccountBook {
	// 내역의 최대 개수 
	public static final int MAX = 100;
	// 가계부에서 내역 최대 100개 기록할 수 있다.
	private Item items[] = new Item[MAX];
	private int count; // 현재 기록된 내역의 개수 

	/* 기능 : 현재까지 입력된 내역을 확인하는 메소드 
	 *  items에 있는 내역들을 count개 출력하는 메소드. // 가계부가 적혀있다, 그리고 내 가계부를 그냥 보는 것.
	 * 매개변수 : 없다. // 나는 매개변수가 있다고 생각했는데, 뭘 입력 받아서 보여주는게 아니라 그냥 작성 되어있는 것을 보는 것이므로 매개변수는 없다.
	 * 리턴타입 : void
	 * 메소드명 : readItems
	 * */
	
	// 메소드에 static이 붙는 경우? : 10개의 객체가 있다면, 10개의 객체 모두가 쓰면 static을 아니라면, static을 쓸 필요가 없다. 
	//Question. 왜 i < items.length가 아니지? / count는 왜 초기화를 안하고 그냥 쓸 수 있는거지?
	// 아하, 위에서 count를 초기화 했다..
	public void readItems() {
		if (count == 0) {
			System.out.println("입력된 내역이 없습니다.");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(i+1+". "+items[i]); // 여기에서 items[i]는 items[i].toString()로 호출
		}
		
	}
	/* 기능 : 가계부에 새 내역을 추가하여 추가됐는지를 알려주는 메소드
	 * 			새 내역(Item)이 주어지면, items에 추가하여 추가됐는지를 알려주는 메소드.
	 * 매개변수 : 새 내역 =  int newItem 가 아니라 /// Item item
	 * 리턴타입 : 배열? 이 아니라 => /// 추가여부, 성공/실패 => boolean
	 * 메소드명 : insertItem 
	 */
	public boolean insertItem(Item item) {
		// 가계부에 쓸 공간이 없는 경우
		if(count == MAX) {
			return false;
		}
		//추가 해야 하는 내역이 비었을 떄
		if(item == null) {
			return false;
		}
		items[count++] = item;
		return true;
	}
	 /* 기능 : 가계부에 기존 내역을 삭제하여 삭제한 내역을 알려주는 메소드
	  * 	삭제할 번지가 주어지면 주어진 내역을 삭제하고 알려주는 메소드  
	  * 매개변수 : 삭제할 번지 => int delIndex
	  * 리턴타입 :	 삭제한 내역 => Item
	  * 메소드명 : deleteItem
	  */	
	public Item deleteItem(int delIndex) {
		// 잘못된 번지인 경우 (예를들어 하나도 저장된게 없거나 count번지보다 크면 지울 수 없으니까)
		if(delIndex >= count || delIndex < 0) {
			return null;
		}
		// 삭제할 내역을 임시 저장 (나중에 알려주어야 하기 때문에)
		Item delItem = items[delIndex];
		//삭제한 위치부터 하나씩 밀어줌
		for( int i = delIndex; i<count-1; i++) {
			items[i] = items[i+1];
		}
		//삭제 후 저장된 개수를 줄임
		count--;
		//삭제한 내역을 알려줌
		return delItem;
	}
		/* 기능 : 가계부에 기존 내역을 수정하여 수정여부를 알려주는 메소드
		 * 매개변수 : 수정할 번지?? => int modIndex, 수정할 내용들 => String date, boolean income, String payment, String content, int price
		 * 리턴타입  : 수정여부 => boolean (실패 할 수 있음...)
		 * 메소드명  : modifyItem
		 */
		
	public boolean modifyItem(int modIndex, String date, boolean income, String payment, String content, int price) {
		
		if(modIndex >= count || modIndex < 0) {
			return false;
		}
		items[modIndex].modify(date, income, payment, content, price);
		return true;
	}
	public Item getItem(int index) {
		if(index < 0 || index >= count) {
			return null;
		}
		return items[index].clone();
	}
}
