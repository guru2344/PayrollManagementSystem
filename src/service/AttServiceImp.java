package service;

import java.util.List;

import model.Attendance;
import repository.*;

public class AttServiceImp implements AttService{
	AttRepository attRepo=new AttRepositoryImp();
	
	@Override
	public boolean isAttendanceMarksd(Attendance att) {
		return attRepo.isAttendanceMarksd(att);
	}

	@Override
	public List getAllEmpAtt() {
		return attRepo.getAllEmpAtt();
	}

}
