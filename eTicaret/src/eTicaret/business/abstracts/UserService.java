package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserService {
	
		void add(User user);
		boolean isValidEmail(String email);
		boolean isExists(String email);
}
