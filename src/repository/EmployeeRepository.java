package repository;

import java.util.List;

import model.*;
 public interface EmployeeRepository {
	 public boolean isAddEmployee(Employee emp);
	 public boolean AllocateDep(Department dept);
	public List ShowAllEmp();
	public boolean isEmpExist(Employee emp);
	public boolean DeleteEmp(Employee emp);
	//public booleanDept(String oldName, int newId, String newName);


}
