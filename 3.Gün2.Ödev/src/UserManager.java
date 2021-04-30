
public class UserManager {
	public void add(User user) {
		System.out.println("kullanýcý eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("kullanýcý silindi: " + user.getFirstName()+ " " + user.getLastName());
	}

}
