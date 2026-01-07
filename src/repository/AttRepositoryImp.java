package repository;

import java.util.*;
import model.Attendance;

public class AttRepositoryImp implements AttRepository{

	private List AttList=new ArrayList();
	@Override
	public boolean isAttendanceMarksd(Attendance att) {
		return AttList.add(att);
	}
	@Override
	public List getAllEmpAtt() {
		return AttList;
	}
	
	

}
