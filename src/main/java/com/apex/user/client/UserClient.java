package com.apex.user.client;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

public class UserClient {
	public static void main(String[] args) {
//		User user = new User();
//		user.setFirstName("AA");
//		user.setLastName("AA");
//		user.setMiddleName("AA");
//		
		//ADD a user
//		UserDAO userDAO = new UserDAO();
//		userDAO.addUser(user);
		
		
		//Get a user
		UserDAO userDAO = new UserDAO();
		
		User user = userDAO.getUser(15);
		System.out.println(user);
		
		//Update user
//		User user = new User();
//		user.setId(15);
//		user.setFirstName("BB");
//		user.setLastName("BB");
//		user.setMiddleName("BB");
//		
//		userDAO.updateUser(user);
		
		//Delete user
//		UserDAO userDAO = new UserDAO();
//		userDAO.deleteUser(15);
		
	}
}
