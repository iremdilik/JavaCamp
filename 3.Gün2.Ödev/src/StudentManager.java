
public class StudentManager extends UserManager {
	public void registration(Student student) {
		System.out.println("öğrenci derse kaydedildi: " + student.getFirstName()+ " " + student.getLastName());
	}

}
