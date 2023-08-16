package com.prowings.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCacheStudent {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setRoll_no(2);
		s1.setName("Boss");

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		session.save(s1);

		Student obj1 = session.get(Student.class, 2);
		System.out.println(obj1);

		System.out.println("working something");

		Student obj2 = session.get(Student.class, 1);
		System.out.println(obj2);
		
		Student obj3 = session.get(Student.class, 2);
		System.out.println(obj3);


		tx.commit();
		session.close();

	}

}
