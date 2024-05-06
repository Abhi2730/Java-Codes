package beans;
//import java.util.*;

public class Person 
{

	private int id;
	private String name;
	private String mob;
	
	
	/**
	 * @param id
	 * @param name
	 * @param mob
	 */
	
	public Person()
	{
		System.out.println("In Default Constructor of Person");
	}
	
	public Person(int id, String name, String mob) {
		
		super();
		System.out.println("In Param Constructor of Person");
		this.id = id;
		this.name = name;
		this.mob = mob;
		
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


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Person [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	
	
}
