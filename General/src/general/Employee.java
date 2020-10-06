package general;

import java.util.Date;

public class Employee {

	
	private String name;
	private Date dateOfjoing;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfjoing() {
		return dateOfjoing;
	}
	public void setDateOfjoing(Date dateOfjoing) {
		this.dateOfjoing = dateOfjoing;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, Date dateOfjoing, int salary) {
		super();
		this.name = name;
		this.dateOfjoing = dateOfjoing;
		this.salary = salary;
	}
	
	
	
	
}
