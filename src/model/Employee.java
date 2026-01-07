package model;

public class Employee {
	private int id;
	private String name;
	Department dept;
	private int sal;
	
	public Employee() {
		
	}
	
	//para constructor
	public Employee(String name,int id,int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	public Employee(String name,int id,int sal,Department dept) {
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.dept=dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	

}
