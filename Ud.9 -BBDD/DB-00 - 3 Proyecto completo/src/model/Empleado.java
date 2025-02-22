package model;

public class Empleado {
	private Integer employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCode;
	private Integer reportsTo;
	private String jobTitle;

	public Empleado() {
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Empleado [EmployeeNumber=" + getEmployeeNumber() + ", LastName=" + getLastName() + ", FirstName=" + getFirstName() + ", Extension=" + getExtension() + ", Email=" + getEmail() + ", OfficeCode=" + getOfficeCode() + ", ReportsTo=" + getReportsTo() + ", JobTitle=" + getJobTitle() + "]";
	}

}
