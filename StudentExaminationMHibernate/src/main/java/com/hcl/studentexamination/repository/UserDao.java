package com.hcl.studentexamination.repository;

import com.hcl.studentexamination.model.ExamEnrollment;
import com.hcl.studentexamination.model.Login;
import com.hcl.studentexamination.model.User;

public interface UserDao {
	boolean register(User usr);

	boolean login(Login login);

	boolean list(ExamEnrollment list);
}