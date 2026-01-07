package repository;

import java.util.*;
import java.util.List;

import model.*;

 public class DepartmentRepositoryimp implements DepartmentRepository {

	private List deptList=new ArrayList();

	@Override
	public boolean isAddDept(Department dept) {
//		boolean exist=this.isDeptExist(dept);
//		
//		if(exist) {
////			System.out.println("ALREDY EXIST......");
//			return false;
//			
//		}else {
//			return deptList.add(dept);
//		}
		return (this.isDeptExist(dept))?false:deptList.add(dept);
	}
	public List ShowAllDept(){
		return deptList;
	}
	public boolean isDeptExist(Department dept) {
		boolean flag=false;
		for(Object obj:deptList) {
			Department d=(Department)obj;
			if(d.getName().equals(dept.getName()) || d.getId()==dept.getId()) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean DeleteDepet(Department dept) {
//		return deptList.remove(dept);
//		return this.isDeptExist(dept)?deptList.remove((Object)dept):false;
		boolean flag=false;
		Iterator i=deptList.iterator();
		while(i.hasNext()) {
			Department d=(Department)i.next();
			if(d.getId()==(dept.getId())||d.getName().equals(dept.getName())) {
				i.remove();
				flag=true;
			}
		}
		return flag;

	}
	
	@Override
	public boolean UpdateDept(String oldName, int newId, String newName) {
	    for (Object obj : deptList) {
	        Department dept = (Department) obj;

	        if (dept.getName().equals(oldName)) {
	            dept.setId(newId);
	            dept.setName(newName);
	            return true;   // UPDATED
	        }
	    }
	    return false;   // NOT FOUND
	}


	
}
