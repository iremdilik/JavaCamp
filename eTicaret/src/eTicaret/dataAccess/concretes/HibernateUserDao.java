package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	ArrayList<User> userList = new ArrayList<>();
	
	public HibernateUserDao() {
		
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getEmail());
		userList.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getEmail());
		
	}

	@Override
	public User get(int id) {
		
		for(User user : userList) {
			if(id==user.getId()) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}

}
