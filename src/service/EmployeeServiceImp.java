package service;

import repository.*;

import java.util.List;

import model.*;
public class EmployeeServiceImp implements EmployeeService{
	EmployeeRepository empRepo=new EmployeeRepositoryimp();
	
	@Override
	public boolean isAddEmployee(Employee emp) {
		return empRepo.isAddEmployee(emp);
	}

	@Override
	public List ShowAllEmp() {
		return empRepo.ShowAllEmp();
	}

	@Override
	public boolean DeleteEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean AllocateDep(Department dept) {
		return empRepo.AllocateDep(dept);
	}

}
