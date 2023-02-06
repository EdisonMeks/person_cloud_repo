
public class Employee extends Person {

	private String Office;
	private int Salary;
	private java.util.Date DateHired;

	public Employee() {
		DateHired = new java.util.Date();
	}

	public Employee(String Office, int Salary) {
		DateHired = new java.util.Date();
		this.Office = Office;
		this.Salary = Salary;

	}

	public Employee(String Office, int Salary, String Name, String Address, String PhoneNumber, String EmailAddress) {
		this.Office = Office;
		this.Salary = Salary;
		setName(Name);
		setAddress(Address);
		setPhoneNumber(PhoneNumber);
		setEmailAddress(EmailAddress);
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String Office) {
		this.Office = Office;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "I'm glad to work with you " + super.toString() + "\n I came on " + DateHired + "\nI Earn " + Salary+"/= UgShs";
	}

}