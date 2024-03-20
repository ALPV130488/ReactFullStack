package oops;

public class Employee {

	private String empName;
	
	private int empId;
	
	private int empSal;
	
	private String empAdd;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}



	public String getEmpName() {			//to display the output
		return empName;
	}

	public void setEmpName(String empName) {		//to give the input
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}


	public Employee(String empName, int empId, int empSal, String empAdd) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	
	
	
	
	
	
}
