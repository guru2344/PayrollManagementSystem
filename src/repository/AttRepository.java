package repository;

import java.util.*;
import model.Attendance;

public interface AttRepository {

	public boolean isAttendanceMarksd(Attendance att);
	public List getAllEmpAtt();
}
