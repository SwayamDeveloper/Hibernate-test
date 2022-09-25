package com.example.HibernateDemo;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.Config;
import com.example.entity.Student;

public class App {
		public static void main(String[] args) {
		try {
	
			Session session = Config.createSession();
			System.out.println("Got a session " + session);

		           
			//Student 1
			Student ss1 = new Student();
			ss1.setId(01);
			ss1.setEmail("xyz@gmail.com");
			ss1.setName("Swayam");
			ss1.setdept("Software developer");
			ss1.setsalary(50000);

			//Student 2
			Student ss2 = new Student();
			ss2.setId(02);
			ss2.setEmail("xyz@gmail.com");
			ss2.setName("rupesh");
			ss2.setdept("RPA developer");
			ss2.setsalary(35000);

			//Student 3
			Student ss3 = new Student();
			ss3.setId(03);
			ss3.setEmail("xyz@gmail.com");
			ss3.setName("Satyam");
			ss3.setdept("Software Engg.");
			ss3.setsalary(75000);
			
			//Student 4
			Student ss4 = new Student();
			ss4.setId(04);
			ss4.setEmail("xyz@gmail.com");
			ss4.setName("Dinesh");
			ss4.setdept("Data Analyst");
			ss4.setsalary(45000);
			
			//Student 5
			Student ss5 = new Student();
			ss5.setId(05);
			ss5.setEmail("xyz@gmail.com");
			ss5.setName("Ravi");
			ss5.setdept("Java Developer");
			ss5.setsalary(30000);
			
			
			Transaction tr = session.beginTransaction(); //changes in database
			session.save(ss1);
			session.save(ss2);
			session.save(ss3);
			session.save(ss4);
			session.save(ss5);
			tr.commit();
			session.close();
			System.out.println("------------------student saved----------------");

		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
