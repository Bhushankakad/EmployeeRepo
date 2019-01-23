package com.atmecs.employee.Employee;
import com.atmecs.employee.Employee.Emp;



public class EmployeeBusinessLogic {
	Emp em=new Emp();
	
	
	public int getYearlySal(Emp e2){
		int yealySalary=0;
		
		yealySalary=e2.getSalary()*12;
		
		return yealySalary;
	}
	
	public int calculateAppiraisal(Emp e1){
		int appiraisal=0;
		if(e1.getSalary()>1000){
			appiraisal=appiraisal+500;
		}else{
			if(e1.getSalary()<1000){
				appiraisal=appiraisal+200;
			}
		}
		
		return appiraisal;
	}

}
