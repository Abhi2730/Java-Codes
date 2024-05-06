package beans;

import java.time.LocalDate;

public class ContractEMP extends Employee {
	
	private double hrs;
	private double charges;

	//constructors
		public ContractEMP()
	{
		System.out.println("In default const of ContractEMP");
	}
	
	public ContractEMP(int id, String name, String mob,String dept, String desg,LocalDate ldt,double d, double e) {
		super(id,name,mob,dept,desg,ldt);
		this.hrs = d;
		this.charges = e;
	}

	//Getter-Setter
	public double getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	
	
	//ToString
	@Override
	public String toString() {
		return super.toString()+ "ContractEMP [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	

	@Override
	public double CalNetSal() {
		// TODO Auto-generated method stub
		return hrs*charges;
	};
	
	
	
	
	

}
