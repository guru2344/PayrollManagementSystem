package repository;

import java.util.*;

import model.Department;
import model.Employee;

public  class EmployeeRepositoryimp implements EmployeeRepository {
	private List EmpList=new ArrayList();
    private DepartmentRepository deptRepo = new DepartmentRepositoryimp();

	@Override
	public boolean isAddEmployee(Employee emp) {
		boolean added=this.isEmpExist(emp);
		if(added) {
			System.out.println("ID ALREDY EXIST......");
			return false;
		}else {
			return EmpList.add(emp);

		}
		
		
	}
	@Override

	public boolean isEmpExist(Employee emp) {
		boolean flag=false;
		for(Object obj:EmpList) {
			Employee e=(Employee)obj;
			if(e.getId()==emp.getId()) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	@Override
	public List ShowAllEmp() {
		return EmpList;
	}
	
	@Override
	public boolean DeleteEmp(Employee emp) {
		return false;
	}
	@Override
	public boolean AllocateDep(Department dept) {
		return deptRepo.isDeptExist(dept)?true:false;
	}

}
