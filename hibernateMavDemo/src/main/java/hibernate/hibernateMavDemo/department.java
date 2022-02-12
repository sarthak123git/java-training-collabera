package hibernate.hibernateMavDemo;

import javax.persistence.Embeddable;

@Embeddable
public class department {

	private String deptName;
	private String location;
	public department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "department [deptName=" + deptName + ", location=" + location + "]";
	}
	public department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
