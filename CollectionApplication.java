package client;
import java.util.*;
import service.*;
import model.*;
public class ClientApplication {
	static DepartmentService deptService=new DepartmentServiceimp();
	public static <Depratment> void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.add dept");
			System.out.println("2.display dept");
			System.out.println("3.delete dept");
			System.out.println("4.add Employee");
			System.out.println("5.add dept");
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
					System.out.println("NOT ADDED ALREDY EXIST..........");

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
				deptList=deptService.ShowAllDept();
				sc.nextLine();
				System.out.println("======================================");
				System.out.println("ENTER DEPARTMENT NAME TO DELETE:");
				String dname=sc.nextLine();
				sc.nextLine();
				boolean deleted=false;
				for(Object obj:deptList) {
					Department dept=(Department)obj;
					if(dept.getName()==dname) {
						deleted=deptService.DeleteDepet(dept);
						break;
					}
				}
				if(deleted) {
					System.out.println("DEPARTMENT DELETED SUCCESSFULLY......");
				}else {
					System.out.println("NOT EXIST..........");
				}
				
				
				
				System.out.println("======================================");
				break;
				
			case 4:
				break;
				
	
		case 5:
			break;
			
		default :
			System.out.println();
			break;
			
		}


		}while(true);
	}

}
