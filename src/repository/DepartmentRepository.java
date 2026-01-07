package repository;
//import PayrollManagementSystem*;
import java.util.List;
import model.*;
   public interface DepartmentRepository {
	public boolean isAddDept(Department dept);
	public List ShowAllDept();
	public boolean isDeptExist(Department detp);
	public boolean DeleteDepet(Department dept);
	public boolean UpdateDept(String oldName, int newId, String newName);
}

