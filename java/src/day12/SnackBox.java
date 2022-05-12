package day12;

public class SnackBox extends Product {
	// product 부모 클래스에게서 상속을 받은 SnackBox  근데 product는 추상 클래스이기 때문에 추상 메소드를 구현해줘야 한다.
	private int count; 

	public SnackBox(String name, int price, int amount, int count) {
		super(name, price, amount); // 부모클래스에서 생성자를 호출해왔다. 
		this.count = count; // 나머지는 자식 클래 생성자에에서 추가.
	}

	@Override // 메소드 오버라이딩을 함 ( 부모 클래스가 가지고 있는 메소드를 자식이 재정의를 함 / 그냥 쓸 수도 있음)
	public void print() { // 그래서 추상클래스인 부모클래스에서 추상메소드를 쓰는 모습. 
		System.out.println(getName() + "[박스당 "+count+"개] : "+getPrice()+"원 - " 
			+ getAmount());
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}