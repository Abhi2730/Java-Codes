package Test;

import beans.SalariedEMP;
import beans.Employee;
import beans.Person;

public class HierarchyEMP  {

	public static void main(String[] args) {
		Person ob=new SalariedEMP();
		System.out.println(ob instanceof Person);					
		System.out.println(ob instanceof Employee);
		System.out.println(ob instanceof SalariedEMP);
		((SalariedEMP)ob).m1();

	}

}

