
public class UserManager {
	public void add(User user) {
		System.out.println("kullan�c� eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("kullan�c� silindi: " + user.getFirstName()+ " " + user.getLastName());
	}

}
