package com.faiz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProjectEnrty {

	public static void main(String[] args) {
		
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		
		Project p1 = new Project(1111,"Dotnet");
		Project p2 = new Project(2222,"java");
		Project p3 = new Project(3333,"angular");
		Project p4 = new Project(4444,"Oracle");
		Project p5 = new Project(5555,"Dbms");
		
		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		tr.commit();
		session.close();

	}

}
