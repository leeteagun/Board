package kr.co.dong.manager;

public class ManagerBean {
	private int password;
	private String name;
	
	public ManagerBean() {
		
	}
	
	public ManagerBean(int password, String name) {
		super();
		this.password = password;
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ManagerBean [password=" + password + ", name=" + name + "]";
	}
}
