package service;
import model.*;
import java.util.*;
   public interface DepartmentService {
	public boolean isAddDept(Department dept);
	public List ShowAllDept();
	public boolean DeleteDepet(Department dept);
	public boolean UpdateDept(String oldName, int newId, String newName);
}
