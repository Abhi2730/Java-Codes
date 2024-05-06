package beans;

import java.time.LocalDate;

public class Vendor extends Employee {
	
	private float amt;
	private int manpower;
	
	
	
	//Constructors
	public Vendor() 
	{
		System.out.println("Default const Vendor");
	}
		
	public Vendor(int id, String name, String mob,String dept, String desg,LocalDate ldt,float amt, int manpower) {
		super(id,name,mob,dept,desg,ldt);
		System.out.println("para const Vendor");
		this.amt = amt;
		this.manpower = manpower;
	}

	/**
	 * @return the amt
	 */
	public float getAmt() {
		return amt;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(float amt) {
		this.amt = amt;
	}

	/**
	 * @return the manpower
	 */
	public int getManpower() {
		return manpower;
	}

	/**
	 * @param manpower the manpower to set
	 */
	public void setManpower(int manpower) {
		this.manpower = manpower;
	}

	@Override
	public double CalNetSal() {
		// TODO Auto-generated method stub
		return amt/manpower;
	}
	
	
	
	
	

}
