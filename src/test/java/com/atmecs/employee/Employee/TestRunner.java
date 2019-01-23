package com.atmecs.employee.Employee;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(TestEmployeeBusinessLogic.class);
		
		for(Failure failure:result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
