
public class Student extends Person {

	private static String Status = ("junior");
	private static String Status1 = ("sophomore");
	private static String Status2 = ("senior");
	private static String Status3 = ("fresher");
	
	public Student() {

	}

	public Student(String Status,String Status1,String Status2,String Status3) {
		Student.Status = Status;
		Student.Status1 = Status1;
		Student.Status2 = Status2;
		Student.Status3 = Status3;
		
	}

	public Student(String Status,String Status1,String Status2,String Status3, String Name, String Address, String PhoneNumber, String EmailAddress) {
		Student.Status = Status;
		Student.Status1 = Status1;
		Student.Status2 = Status2;
		Student.Status3 = Status3;
		setName(Name);
		setAddress(Address);
		setPhoneNumber(PhoneNumber);
		setEmailAddress(EmailAddress);
	}

	public static String getStatus() {
		return Status;
	}

	public static void setStatus(String Status) {
		Student.Status = Status;
	}
	
	public static String getStatus1() {
		return Status1;
	}

	public static void setStatus1(String Status1) {
		Student.Status1 = Status1;
	}

	public static String getStatus2() {
		return Status2;
	}

	public static void setStatus2(String Status2) {
		Student.Status2 = Status2;
	}
	
	public static String getStatus3() {
		return Status3;
	}

	public static void setStatus3(String Status3) {
		Student.Status3 = Status3;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nI'm a " ;
	}

}
