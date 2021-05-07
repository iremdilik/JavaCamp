package eTicaret.business.concretes;

import java.util.regex.Pattern;

import eTicaret.business.abstracts.UserService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;  

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(user.getFirstName().length()>2
				&& user.getLastName().length()>2 
				&& user.getPassword().length()>6
				&& !isValidEmail(user.getEmail())
				&& isExists(user.getEmail())
				)
		{
			userDao.add(user);
			System.out.println("kayýt edildi");
		}
		else {
			System.out.println("geçersiz bilgi giriþi");
		}
	}
	
	public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9+&*-]+(?:\\." 
        				+ "[a-zA-Z0-9+&-]+)@" 
        				+ "(?:[a-zA-Z0-9-]+\\.)+[a-z"
        				+ "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
	
	public boolean isExists(String email) {
		
		for(User user: userDao.getAll() ) {
			if(email.equals(user.getEmail()) ) {
				return false;
			}
			
		}
		return true;
	}

}
