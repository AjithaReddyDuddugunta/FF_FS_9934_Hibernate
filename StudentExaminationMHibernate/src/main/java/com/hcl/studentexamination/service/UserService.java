package com.hcl.studentexamination.service;

import com.hcl.studentexamination.model.ExamEnrollment;
import com.hcl.studentexamination.model.Login;
import com.hcl.studentexamination.model.User;

public interface UserService {
	boolean register(User usr);

	boolean login(Login login);
	
	boolean list(ExamEnrollment list);
}