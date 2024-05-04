package Scanner;

import java.util.Scanner;

public class DriverCode {

	public static void main(String[] args) {
		
		StudentInfo[] sarr=new StudentInfo[10];
		
		StudentServices.SetDetails(sarr);
		
		StudentServices.Displayall(sarr);
		
		System.out.println("Enter name to search");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		StudentInfo Stud=StudentServices.Searchbyname(sarr,name);
		System.out.println(Stud);
	}

}
