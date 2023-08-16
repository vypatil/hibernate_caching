package com.prowings.secondlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {

		EntityClass e1 = new EntityClass("vaibhav", "kolhapur", "CSE");

		EntityClass e2 = new EntityClass("sush", "pune", "BCS");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();

		EntityClass ent1 = session1.get(EntityClass.class, 1);
		System.out.println("entity 1 from session 1 first time : " + ent1 );
		
		EntityClass ent2 = session1.get(EntityClass.class, 1);
		System.out.println("entity 1 from session 1 second time : " + ent2 );
		
//		session1.save(e1);
//		session1.save(e2);
		
		tx1.commit();
		session1.close();
		
		System.out.println(">>>>>>>>>> starting second session >>>>>>>>>>");
		
		Session session2 = sf.openSession();
		Transaction tx2 = session2.beginTransaction();
		
		EntityClass ent3 = session2.get(EntityClass.class, 1);
		System.out.println("entity 1 from session 2 first time : " + ent2 );
		
		tx1.commit();
		session2.close();
		
		

	}

}
