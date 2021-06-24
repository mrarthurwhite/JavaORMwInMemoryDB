package com.test.db;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.db.dao.UserDao;
import com.test.db.model.User;

public class App {

	public static void main(String[] args) {
		UserDao dao = new UserDao();

		// Add new user
		User user = new User();
		user.setFirstName("Arthur");
		dao.addUser(user);

		// Update user
		user.setFirstName("Arthur White");
		dao.updateUser(user);

		// Delete user
		// dao.deleteUser(1);

		// Get all users
		for (User iter : dao.getAllUsers()) {
			System.out.println(iter);
		}

		// Get user by id
		//System.out.println(dao.getUserById(2));
	}


}
