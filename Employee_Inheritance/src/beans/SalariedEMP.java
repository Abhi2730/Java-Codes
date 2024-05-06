package beans;

import java.time.LocalDate;

public class SalariedEMP extends Employee {
	
	private double sal;
	private double bonus;
	/**
	 * @param sal
	 * @param bonus
	 */
	
	//Constructors
	public SalariedEMP()
	{
		System.out.println("In default const of SalariedEMP");
	}
	
	public SalariedEMP(int id, String name, String mob,String dept, String desg,LocalDate ldt,double sal, double bonus) 
	{
		super(id,name,mob,dept,desg,ldt);
		System.out.println("In para const of SalariedEMP");
		this.sal = sal;
		this.bonus = bonus;
	}

	
	//Getter-Setters
	public double getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	
	//ToString
	@Override
	public String toString() {
		return super.toString()+"SalariedEMP [sal=" + sal + ", bonus=" + bonus + "]";
	}

	@Override
	public double CalNetSal() {
		return sal+bonus+0.10*sal+0.15*sal-0.08*sal;
		
	}
	
	public int m1() {
    	System.out.println("in method m1");
    	return 10;
    }
	
	
}
