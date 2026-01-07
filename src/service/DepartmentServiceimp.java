package service;

import java.util.List;
import repository.*;
import model.*;
 public class DepartmentServiceimp implements DepartmentService {

	DepartmentRepository deptRepo=new DepartmentRepositoryimp();
	
	
	@Override
	public boolean isAddDept(Department dept) {
		return deptRepo.isAddDept(dept);
	}
	@Override
	public List ShowAllDept() {
		return deptRepo.ShowAllDept();
	}
	@Override
	public boolean DeleteDepet(Department dept) {
		return deptRepo.DeleteDepet(dept);
	}
	
	@Override
	public boolean UpdateDept(String oldName, int newId, String newName) {
	    return deptRepo.UpdateDept(oldName, newId, newName);
	}

}
