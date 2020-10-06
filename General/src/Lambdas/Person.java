package Lambdas;

public class Person {
	
	private String firstNm;
	private String lastNm;
	private int id;
	
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(String firstNm, String lastNm, int id) {
		super();
		this.firstNm = firstNm;
		this.lastNm = lastNm;
		this.id = id;
	}
	
	

}

interface Condition{
	public boolean test();
}
