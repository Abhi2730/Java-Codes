
package Scanner;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class StudentServices 
{
	public static StudentInfo Searchbyname(StudentInfo[] sarr,String name)
	{
		for(StudentInfo Stud : sarr)
		{
			if(Stud.getName().equals(name))
			{
				return Stud;
			}
		}
		return null;
	}

	public static void SetDetails(StudentInfo[] sarr) 
	{
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat dateInput = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println("Enter Student Name: ");
			String sname = sc.next();
			System.out.println("Enter Student Address: ");
			String saddress = sc.next();
			System.out.println("Enter Student ID: ");
			int id = sc.nextInt();
			System.out.println("Enter Student Marks for sub 1: ");
			int m1 = sc.nextInt();
			System.out.println("Enter Student Marks for Sub 2: ");
			int m2 = sc.nextInt();
			System.out.println("Enter Student DateOfAdmission('dd/MM/yyyy'): ");
		    String strDate = sc.next();
			 Date date=null;
			try
			{
			   date = (Date) dateInput.parse(strDate);
			   sarr[i]=new  StudentInfo(sname,saddress,id,date,m1,m2);
			   float res=sarr[i].getaverage();
			   System.out.println(res);
			} 
			catch (ParseException e) 
			{
			   System.out.println("Parce Exception " + e);
			}
		   
		   	
		}
	}
	
	public static void Displayall(StudentInfo[] parr)
	{
		for(int i=0;i<parr.length;i++)
		{
			System.out.println(parr[i]);
		}
	}
		
		
		

	
	
}
