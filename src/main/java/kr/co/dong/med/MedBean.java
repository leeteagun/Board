package kr.co.dong.med;

public class MedBean {
	private int id;
	private String title;
	private String content;
	private String author;
	private String day;
	private String etc;

	public MedBean() {
	}
	
	public MedBean(int id, String title, String content, String author, String day, String etc) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.day = day;
		this.etc = etc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return "MedBean [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author + ", day=" + day
				+ ", etc=" + etc + "]";
	}

}
