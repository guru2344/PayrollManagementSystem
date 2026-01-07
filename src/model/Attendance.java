package model;
import java.util.*;

public class Attendance {
	private Employee emp;
	private Date date;
	private Date intime;
	private Date outime;
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public Date getOutime() {
		return outime;
	}
	public void setOutime(Date outime) {
		this.outime = outime;
	}
}
