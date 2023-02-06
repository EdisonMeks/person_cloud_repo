
public class Faculty extends Employee {

	private int OfficeHours;
	private String Rank;

	public Faculty() {

	}

	public Faculty(int OfficeHours, String Rank) {
		this.OfficeHours = OfficeHours;
		this.Rank = Rank;
	}

	public Faculty(int OfficeHours, String Rank, String Office, int Salary) {
		this.OfficeHours = OfficeHours;
		this.Rank = Rank;
		setOffice(Office);
		setSalary(Salary);

	}

	public Faculty(int OfficeHours, String Rank, String Office, int Salary, String Name, String Address,
			String PhoneNumber, String EmailAddress) {
		this.OfficeHours = OfficeHours;
		this.Rank = Rank;
		setOffice(Office);
		setSalary(Salary);
		setName(Name);
		setAddress(Address);
		setPhoneNumber(PhoneNumber);
		setEmailAddress(EmailAddress);
	}

	public int getOfficeHours() {
		return OfficeHours;

	}

	public void setOfficeHours(int OfficeHours) {
		this.OfficeHours = OfficeHours;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String Rank) {
		this.Rank = Rank;
	}

	@Override
	public String toString() {
		return super.toString() + "\n I'm a Teaching Staff member the  " + Rank + "\nI'm the " + getOffice() + "\n I work for " + OfficeHours + " Hours";
	}

}