package Test;
//import beans.Person;

import java.time.LocalDate;

import beans.ContractEMP;
import beans.SalariedEMP;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p=new Person(23,"ADerhj","567567567");
		SalariedEMP s1= new SalariedEMP(1,"Abhi","56755656", "HR", "MNGR",LocalDate.of(2023, 5, 15),653.000,999.000);
		ContractEMP e1=new ContractEMP(12,"Nikhil","8989898","DEV","Sr.Mngr",LocalDate.of(2025, 6, 17),6.0,7.0); 
				
	    System.out.println(s1.CalNetSal());
	    System.out.println(e1.CalNetSal());
	    
	}

}

