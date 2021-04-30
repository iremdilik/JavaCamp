
public class Instructor extends User {
	private String profession;

	public Instructor(int id, String firstName, String lastName, String profession) {
		super(id, firstName, lastName);
		this.profession = profession;
	}
	
	public Instructor() {
		
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
