package USER;

public class EmployeeUser extends User{


private String job;
private String salary;

	

public EmployeeUser(String username, String password, String job, String salary) {
		super(username, password);
		this.job = job;
		this.salary= salary;
	}
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


	

}
