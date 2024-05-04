package Scanner;
import java.text.*;
import java.util.*;

public class StudentInfo {
	
	private String Sname;
	private String Address;
	private int Id;
	private Date Doa;
	private int mk1,mk2;
	
	public StudentInfo()
	{
		
	}
	
	public StudentInfo(String name,String Add,int id,Date date2,int m1,int m2)
	{
		Sname=name;
		Address=Add;
		Id=id;
		Doa=date2;
		mk1=m1;
		mk2=m2;
	}
     public float getaverage()
     {
    	return (mk1+mk2)/2; 
     }
	public void SetName(String name)
	{
		Sname=name;
	}
	
	public void SetAddress(String Addr)
	{
		Address=Addr;
	}
	
	public void SetId(int id)
	{
		Id=id;
	}
	
	public void SetDoa(Date dd)
	{		
		Doa=dd;
	}
	
	public void SetMarks1(int m1)
	{
		mk1=m1;
	}
	
	public void SetMarks2(int m2)
	{
		mk2=m2;
	}
	
	public String getName()
	{
		return Sname;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public Date getDate()
	{
		return Doa;
	}
	
	public int getMarks1()
	{
		return mk1;
	}
	
	public int getMarks2()
	{
		return mk2;
	}
	
	 public String toString()
	{
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
		String d=sdf.format(Doa);
		return "Id :" + Id+ "Name : " +Sname+ " DateOfAdmission: " +Doa+d;
	}
	
	
};
