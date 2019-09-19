package com.dev.collections;
import java.util.HashSet;


public class EmployeeImplements implements EmployeeInterface {
	HashSet<Employee>hs =new HashSet<Employee>();
	

	@Override
	public boolean setEmployee(Employee employee) {
		if (employee !=null) {
			hs.add(employee);
		return true;
		}
		return false;
	}

	@Override
	public void getEmployee(Employee employee) {
		 {
			
		return true;
		}
		
	}

	@Override
	public boolean removeEmployee() {
		if (employee !=null) {
			hs.remove(employee);
		
		return false;
	}
		
	
		
	}

}
