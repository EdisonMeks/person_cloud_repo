import javax.swing.JOptionPane;
public class TestPerson {

	public static void main(String[] args) {

		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student.setName("John Paul") ;
		student.setAddress("Nansana");
		student.setPhoneNumber("+256758493049");
		student.setEmailAddress("johnpaul@gmail.com");
		
		student1.setName("John Mark") ;
		student1.setAddress("Namagunga");
		student1.setPhoneNumber("+256758493049");
		student1.setEmailAddress("johnmark@gmail.com");
		
		student2.setName("John Mary") ;
		student2.setAddress("Namayumba");
		student2.setPhoneNumber("+256758493049");
		student2.setEmailAddress("johnmary@gmail.com");
		
		student3.setName("John Baptist") ;
		student3.setAddress("Naama");
		student3.setPhoneNumber("+256758493049");
		student3.setEmailAddress("johnbaptist@gmail.com");
		
		JOptionPane.showMessageDialog(null,student.toString() + Student.getStatus(),"\t Elshaddai Students Body",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,student1.toString() + Student.getStatus1(),"\t Elshaddai Students Body",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,student2.toString() + Student.getStatus2(),"\t Elshaddai Students Body",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,student3.toString() + Student.getStatus3(),"\t Elshaddai Students Body",JOptionPane.PLAIN_MESSAGE);
		
		//System.out.println(student.toString() + Student.getStatus());
		//System.out.println(student1.toString() + Student.getStatus1());
		//System.out.println(student2.toString() + Student.getStatus2());
		//System.out.println(student3.toString() + Student.getStatus3());
		
		Staff staff = new Staff("Nurse", "HOD Nurse", 150000, "Kizito John", "Bbanda", "+256759564580",
				"kizitojohn@gmail.com");
		Staff staff1 = new Staff("Farm Manager","1ST Person",200000,"Mugambe John","Gayaza","+256782495964",
				"johnmugambe@gmail.com");
		Staff staff2 = new Staff("Chaplain","Head Evangelist",350000,"Ssempungu Benjamin","Ttamu","+256756473820",
				"ssempungubenjamin@gmail.com");
				

		JOptionPane.showMessageDialog(null,staff.toString(),"\t Elshaddai Staff Members",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,staff1.toString(),"\t Elshaddai Staff Members",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,staff2.toString(),"\t Elshaddai Staff Members",JOptionPane.PLAIN_MESSAGE);
		
		System.out.println( "\n" + staff.toString());
		//System.out.println( "\n" + staff1.toString());
		//System.out.println( "\n" + staff2.toString());
		
		Faculty faculty = new Faculty(10, "English Teacher", "HeadTeacher", 300000, "Edison Meks", "Kabulengwa",
				"+256785456756", "edisonmeks@gmail.com");

		//System.out.println( "\n" +  faculty.toString());
		
		JOptionPane.showMessageDialog(null,faculty.toString(),"Information of Elshaddai",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
	}
}
