package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum = 1000;
	private int employeeId;
	private String emplyeeName;
	private String department;
	
	public Employee() {
		Employee.serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmplyeeName() {
		return emplyeeName;
	}

	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	
	
}
