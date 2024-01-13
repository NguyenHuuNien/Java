package object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Serializable{
	private Teacher gv;
	private List<Student> dsStudent;
	private String dayBegin;
	private String dayEnd;
	public LopHoc(Teacher gv, String dayBegin, String dayEnd) {
		super();
		this.gv = gv;
		this.dsStudent = new ArrayList<Student>();
		this.dayBegin = dayBegin;
		this.dayEnd = dayEnd;
	}
	public Teacher getGv() {
		return gv;
	}
	public void setGv(Teacher gv) {
		this.gv = gv;
	}
	public List<Student> getDsStudent() {
		return dsStudent;
	}
	public void setDsStudent(Student dsStudent) {
		this.dsStudent.add(dsStudent);
	}
	public String getDayBegin() {
		return dayBegin;
	}
	public void setDayBegin(String dayBegin) {
		this.dayBegin = dayBegin;
	}
	public String getDayEnd() {
		return dayEnd;
	}
	public void setDayEnd(String dayEnd) {
		this.dayEnd = dayEnd;
	}
	
}
