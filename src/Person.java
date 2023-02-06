
public class Person {
	private String Name;
	private String Address;
	private String PhoneNumber;
	private String EmailAddress;

	public Person() {

	}

	public Person(String Name, String Address, String PhoneNumber, String EmailAddress) {
		this.Name = Name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.EmailAddress = EmailAddress;

	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;

	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;

	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	public String toString() {
		return "\nMy Name is " + Name + "\n From: " + Address + "\n Tel: " + PhoneNumber + "\n @google: " + EmailAddress;
	}
}
