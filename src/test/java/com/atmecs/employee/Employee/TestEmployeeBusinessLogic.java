package com.atmecs.employee.Employee;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeBusinessLogic {
	Emp e1=new Emp();
	EmployeeBusinessLogic empBusinessLogic=new EmployeeBusinessLogic();
	
	@Test
	public void testEmployeeAppraisal(){
		e1.setAge(25);
		e1.setName("Bhushan");
		e1.setSalary(2500);
		double EmployeeDoubleSalary=empBusinessLogic.calculateAppiraisal(e1);
		
		//assertEquals("Testing the actual vs expected YearlySalary",3000,EmployeeDoubleSalary);
		
		assertEquals("Testing the actual vs expected YearlySalary", 3000, EmployeeDoubleSalary);
		
	}
	
	@Test
	public void testEmployeeYearlySalary(){
		e1.setAge(28);
		e1.setName("Ram");
		e1.setSalary(200);
		
		double yealySalary=empBusinessLogic.getYearlySal(e1);
		
		assertEquals("Testing the actual vs expected YearlySalary",250,yealySalary);
	}
	

}
