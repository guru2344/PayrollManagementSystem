package client;
import java.util.*;
import service.*;
import model.*;
public class ClientApplication {
	static DepartmentService deptService=new DepartmentServiceimp();
	static EmployeeService empService=new EmployeeServiceImp();
	static AttService attService=new AttServiceImp();
	public static  void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.add dept");
			System.out.println("2.display dept");
			System.out.println("3.delete dept");
			System.out.println("4.Update Department");
			
			//Employee
			System.out.println("5.add Employee");
			System.out.println("6.show all employee");
			System.out.println("7.COUNT DEPRATMENT WISW EMPLOYEES");
			System.out.println("8.SHOW EMPLOYEE DEPARTMENT WISE");
			System.out.println("9.maintain attendance");
			System.out.println("10.SHOE ALL EMP WITH ATTADNACE");
			System.out.println("ENTER CHOICE");
			System.out.println("======================================");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				sc.nextLine();
				System.out.println("======================================");

				System.out.println("ENTER DEPARTMENT NAME:");
				String name=sc.next();
				System.out.println("ENTER DEPARTMENT ID:");
				int id=sc.nextInt();
				Department d=new Department();
				d.setName(name);
				d.setId(id);
				boolean check=deptService.isAddDept(d);
				if(check) {
					System.out.println("ADDED SUCCESSFULLY........");
				}else {
					System.out.println("ALREDY EXIST..........");

				}
				System.out.println("======================================");

				break;
				
			case 2:
				List deptList=deptService.ShowAllDept();
				sc.nextLine();
				System.out.println("======================================");
				if(deptList.size()>0) {
					for(Object obj:deptList) {
						Department dept=(Department)obj;
						System.out.println(dept.getId()+"\t"+dept.getName());
					}
					
				}else {
					System.out.println("EMPTY.........");
				}

				
				System.out.println("======================================");
				break;
				
			case 3:
				//delete
				sc.nextLine();
				deptList=deptService.ShowAllDept();
				System.out.println("======================================");
				System.out.println("ENTER DEPARTMENT NAME TO DELETE:");
				name=sc.nextLine();
				System.out.println("ENTER DEPARTMENT ID TO DELETE:");
				id=sc.nextInt();

				
				Department dept=new Department();
				 dept.setName(name);
				 dept.setId(id);
				boolean deleted=deptService.DeleteDepet(dept);
					
				if(deleted) {
					System.out.println("DEPARTMENT DELETED SUCCESSFULLY......");
				}else {
					System.out.println("NOT EXIST..........");
				}
				System.out.println("======================================");
				break;
				
			case 4:
				//update 
				 sc.nextLine();
				    System.out.println("======================================");
				    System.out.println("ENTER CURRENT DEPARTMENT NAME TO UPDATE:");
				    String oldName = sc.nextLine();

				    System.out.println("ENTER NEW DEPARTMENT NAME:");
				    String newName = sc.nextLine();

				    System.out.println("ENTER NEW DEPARTMENT ID:");
				    int newId = sc.nextInt();

				    boolean updated = deptService.UpdateDept(oldName, newId, newName);

				    if (updated) {
				        System.out.println("DEPARTMENT UPDATED SUCCESSFULLY......");
				    } else {
				        System.out.println("DEPARTMENT NOT FOUND..........");
				    }
				    System.out.println("======================================");
				break;
				
	
		case 5:
			//EMP ADD
			
			sc.nextLine();
			System.out.println("======================================");

			System.out.println("ENTER EMPLOYEE NAME:");
			 name=sc.next();
			System.out.println("ENTER EMPLOYEE ID:");
			 id=sc.nextInt();
			 
			 System.out.println("ENTER EMPLOYEE SALARY:");
			 int sal=sc.nextInt();
				sc.nextLine();

			 System.out.println("ALOCATE DEPARTMENT TO EMPLOYEE");
			 String dname=sc.nextLine();
			  d=new Department();
			 d.setName(dname);	
			 if(empService.AllocateDep(d)) {
					System.out.println("DEPARTMENT NOT EXIST..........");

			 }else {
				Employee emp=new Employee(name,id,sal,d);
				 check=empService.isAddEmployee(emp);

			}
			System.out.println("======================================");
			break;
			
			//show all emply
			
		case 6:
			List EmpList=empService.ShowAllEmp();
			sc.nextLine();
			System.out.println("======================================");
			if(EmpList.size()>0) {
				for(Object obj:EmpList) {
					Employee emp1=(Employee)obj;
					Department d1=emp1.getDept();
					System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSal()+"\t"+d1.getName());
				}
				
			}else {
				System.out.println("EMPTY.........");
			}

			
			System.out.println("======================================");
			break;
			
		case 7:
				//count
			System.out.println("======================================");

			EmpList=empService.ShowAllEmp();
			deptList=deptService.ShowAllDept();
			for(Object dept1:deptList) {
				int count=0;
				d=(Department)dept1;
				for(Object emp:EmpList) {
					
					//convert object to employee
					Employee e=(Employee)emp;
					
					//take department from employee 
					Department EMPD=e.getDept();
					
					if(d.getName().equals(EMPD.getName())) {
						count++;
					}
				}
			
				System.out.println(d.getName() +" \t"+count);
				
				
			}
			System.out.println("======================================");

			
			break;
				
		case 8://show dept wise
			System.out.println("======================================");

			EmpList=empService.ShowAllEmp();
			deptList=deptService.ShowAllDept();
			for(Object dept1:deptList) {
				
				int count=0;
				d=(Department)dept1;
				System.out.println(d.getName()+"\t");
				System.out.println("--------------------------------");
				for(Object emp:EmpList) {
					
					//convert object to employee
					Employee e=(Employee)emp;
					
					//take department from employee 
					Department EMPD=e.getDept();
					
					if(d.getName().equals(EMPD.getName())) {
						System.out.println(e.getName()+"\t"+e.getId()+"\t"+d.getName());
						System.out.println("----");

					}
				}
			
				
				
			}
			System.out.println("======================================");

			
			break;
		case 9:
			//maintain attaedance
			System.out.println("======================================");

			EmpList=empService.ShowAllEmp();
			System.out.println("EMPLOYESS:--------");
			for(Object o:EmpList) {
				Employee e=(Employee)o;
				System.out.println(e.getId()+"\t"+e.getName());
				System.out.println("------");
			}
			System.out.println("ENTE EMPLOYEE IF TO MAINTAIN ATTANDENCE:");
			int empid=sc.nextInt();
			Attendance attend=new Attendance();
			Date intime=new Date();
			Date otime=new Date();
			for(Object emp:EmpList) {
				Employee e=(Employee)emp;
				if(e.getId()==empid) {
					attend.setEmp(e);
					break;
				}
			}
			attend.setIntime(intime);
			attend.setOutime(otime);
			if(intime!=null || otime!=null) {
				attend.setStatus(true);
			}else {
				attend.setStatus(false);
			}
			boolean b=attService.isAttendanceMarksd(attend);
			if(b) {
				System.out.println("attendance marked successfully");
			}else {
				System.out.println("Not marked...");
			}
			
			System.out.println("======================================");

			break;
			
		case 10:
			//show emp with attendance
			System.out.println("======================================");

			List AttList=attService.getAllEmpAtt();
			for(Object emp:AttList) {
				Attendance att=(Attendance)emp;
				Employee e=att.getEmp();
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+att.getIntime()+"\t"+att.getOutime()+"\t"+att.isStatus());
			}
			System.out.println("======================================");

			break;
			
		default :
			System.out.println();
			break;
			
		}


		}while(true);
	}

}
