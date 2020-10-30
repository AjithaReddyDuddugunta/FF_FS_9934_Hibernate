package com.hcl.studentexamination.service;

import org.springframework.stereotype.Service;

import com.hcl.studentexamination.model.ExamEnrollment;
import com.hcl.studentexamination.model.Login;
import com.hcl.studentexamination.model.User;
import com.hcl.studentexamination.repository.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {

	public boolean register(User usr) {
		UserDaoImpl userDao = new UserDaoImpl();
		return userDao.register(usr);
		// TODO Auto-generated method stub
	}

	public boolean login(Login login) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean list(ExamEnrollment list) {
		// TODO Auto-generated method stub
		return false;
	}

}