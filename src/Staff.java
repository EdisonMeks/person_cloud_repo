
public class Staff extends Employee {

	private String Title;

	public Staff() {

	}

	public Staff(String Title) {
		this.Title = Title;
	}

	public Staff(String Title, String Office, int Salary) {
		this.Title = Title;
		setOffice(Office);
		setSalary(Salary);

	}

	public Staff(String Title, String Office, int Salary, String Name, String Address, String PhoneNumber,
			String EmailAddress) {
		this.Title = Title;
		setOffice(Office);
		setSalary(Salary);
		setName(Name);
		setAddress(Address);
		setPhoneNumber(PhoneNumber);
		setEmailAddress(EmailAddress);

	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	@Override
	public String toString() {
		return super.toString() + "\nI'm a " + Title + "\nI'm the " + getOffice() ;
	}
}
