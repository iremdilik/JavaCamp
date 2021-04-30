
public class Student extends User {
	private int level;

	public Student(int id, String firstName, String lastName, int level) {
		super(id, firstName, lastName);
		this.level = level;
	}
	
	public Student() {
		
	}

	public String getLevel() {
		return level+"sýnýf";
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
