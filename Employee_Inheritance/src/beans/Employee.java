package beans;

import java.time.LocalDate;
//import java.util.Date;

public abstract class Employee extends Person
{
	private String dept;
	private String desg;
	private LocalDate doj;
	
	/**
	 * @param dept
	 * @param desg
	 */
	
	
	
	//Constructors
	public Employee()
	{
		System.out.println("In default const of Employee");
	}
	
	public Employee(int id, String name, String mob,String dept, String desg,LocalDate ldt) {
		super(id,name,mob);
		System.out.println("In para const of Employee");
		this.dept = dept;
		this.desg = desg;
		this.doj=ldt;
		
	}
	
	
	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}

	public abstract double CalNetSal();
		

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	
	
	

	
	
	
}
