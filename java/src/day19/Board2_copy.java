package day19;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board2_copy {
	private String type, title, content, writer;
	private int num, view;
	static Date date;
	
	private static int count = 0;
	
	public Board2_copy(String type, String title, String content, String writer) {
	
		this.type = type;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.num = ++count;
		date = new Date();
	}
	
	public Board2_copy() {}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Board2_copy.count = count;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDate() {
		if (date == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(date);
	}
	
	public void modify(String title, String content) {
		this.title = title;
		this.content = content;
		
	}
	public void detailPrint() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("작성일 : " + date);
		System.out.println("조회수 : " + view);
		System.out.println("내용 : " + content);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("000"); // to fix the digit places.
		return "Board [ def.format(num) + \t " + title + "\t" + content + "\t" + writer + ", type="
				+ type + ", view=" + view + ", date=" + date + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (getClass() != obj.getClass())	return false;
		Board2_copy other = (Board2_copy) obj;
		if (num != other.num)			return false;
		return true;
	}

}
