package com.vidhya.dao;

import java.util.ArrayList;

import com.vidhya.pojo.User;

public class UserDAO {
	ArrayList<User> userList;
	public UserDAO() {
		userList.add(new User("Vidhya", "v123", "Admin"));
		userList.add(new User("Suraj", "s123", "User"));
		userList.add(new User("Manish", "m123", "Admin"));
		userList.add(new User("Poojitha", "p123", "User"));
		userList.add(new User("Leo", "l123", "User"));
	}
	public String getUserType(String userName, String password) {
		for (User user : userList) {
			if (user.getUserName().equals(userName) && (user.getPassword().equals(password))) {
				return user.getUserType();
			} 
		}
		throw new InvalidUserException("Username and Password doesn't exist!");
	}
	
	
	
	
	
}
