
public class StudentManager extends UserManager {
	public void registration(Student student) {
		System.out.println("��renci derse kaydedildi: " + student.getFirstName()+ " " + student.getLastName());
	}

}
