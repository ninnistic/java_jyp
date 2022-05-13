package day14;

//항목
public class Item implements Cloneable{

	//날짜, 구분(수입/지출), 구분(결제방식), 상세항목, 금액

	private String date;
	private boolean income; // 구분(수입/지출)
	private String payment; // 결제방식
	private String content; // 항목
	private int price; // 금액
	
	@Override
	public Item clone() {
		Item obj = null; // 왜..?
		
	try {
		obj = (Item)super.clone();
	} catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
		return obj;
	}

	// 항목을 수정할 수 있는 기능, 생성자랑 비슷하지만 modify는 원하는 때에 불러서 수정하기 위해서. 
	public void modify(String date, boolean income, String payment, String content, int price) {
		if (date != null) {
			this.date = date; // date
		}
		if (payment != null) {
			this.payment = payment;
		}
		if (content != null) {
			this.content = content;
		}
		if (price >= 0) {		//가격이 음수가 나오면 동작을 안 시키겠다.
			this.price = price;
		}
		this.income = income;

	}
	

	@Override
	public String toString() {
		return "내역 [ " + date + "  |  " + (income?"수입":"지출") + " | " + payment + " |  " + content
				+ " | " + price + " ]";
	}


	// constructor
	public Item(String date, boolean income, String payment, String content, int price) {
		this.date = date;
		this.income = income;
		this.payment = payment;
		this.content = content;
		this.price = price;
	}

	// getters & setters
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isIncome() {
		return income;
	}

	public void setIncome(boolean income) {
		this.income = income;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
