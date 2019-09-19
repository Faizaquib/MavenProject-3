package com.faiz;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleEntry {

	public static void main(String[] args) {

			SessionFactory sf = Util.getSF();
			Session session = sf.openSession();
			
			Vehicle v1 = new Vehicle(1001,"Swift",750000);
			Vehicle v2 = new Vehicle(1002,"Ignis",850000);
			Vehicle v3 = new Vehicle(1003,"S-Cross",950000);
			Vehicle v4 = new Vehicle(1004,"Baleno",1050000);
			
			Transaction tr = session.beginTransaction();
			session.save(v1);
			session.save(v2);
			session.save(v3);
			session.save(v4);
			tr.commit();
			session.close();
	}

}
