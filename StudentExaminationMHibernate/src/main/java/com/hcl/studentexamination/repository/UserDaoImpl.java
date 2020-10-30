package com.hcl.studentexamination.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.studentexamination.model.ExamEnrollment;
import com.hcl.studentexamination.model.Login;
import com.hcl.studentexamination.model.User;
import com.hcl.studentexamination.util.HibernateUtil;

@Repository

public class UserDaoImpl implements UserDao {
	public static class UserServiceImpl {
		/*
		 * static Connection conn = null; { try {
		 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
		 * DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/STUDENT_EXAMINATION", "root", "root"); } catch
		 * (Exception e) {
		 * System.out.println("Error occured during connection creation " +
		 * e.getMessage()); } }
		 */

		public boolean register(User user) {
			/*
			 * try { PreparedStatement pst = conn.prepareStatement(
			 * "insert into user(aadhaarNumber, name, emailId, mobileNumber, password, roleid) values(?,?,?)"
			 * ); pst.setString(1, user.getAadhaarNumber()); pst.setString(2,
			 * user.getName()); pst.setString(3, user.getEmail()); pst.setString(4,
			 * user.getMobileNumber()); pst.setString(5, user.getPassword()); pst.setInt(6,
			 * user.getRoleId());
			 * 
			 * pst.executeUpdate();
			 * 
			 * return true; } catch (SQLException e) {
			 * System.out.println("Error occured during insertion of user record" +
			 * e.getMessage()); }
			 * 
			 * return false; }
			 */

			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				User user1 = new User();
				user1.setId(user.getId());
				user1.setPassword(user.getPassword());
				user1.setRoleId(user.getRoleId());
				session.save(user1);
				session.getTransaction().commit();
				HibernateUtil.shutdown();
				return true;
			} catch (Exception e) {
				System.out.println("Exception occured during inserting data:" + e);
				return false;
			}

		}

		public boolean register1(User usr) {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean login(Login login) {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean list(ExamEnrollment list) {
			// TODO Auto-generated method stub
			return true;
		}
	}
}