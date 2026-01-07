package service;

import java.util.List;

import model.Department;
import model.Employee;

public interface EmployeeService {
	public boolean isAddEmployee(Employee emp);
	public List ShowAllEmp();
	public boolean DeleteEmp(Employee emp);
	public boolean AllocateDep(Department dept);
//	public boolean UpdateDept(String oldName, int newId, String newName);
}
