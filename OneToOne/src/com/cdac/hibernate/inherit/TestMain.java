package com.cdac.hibernate.inherit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestMain {

	public static void main(String[] args) {
		
			
		Vehicle vehicle = new Vehicle();
		UserDetails userDetails = new UserDetails();
		
		
		vehicle.setVehicleName("pleasure");
		
		userDetails.setUserName("neha");
		userDetails.setVehicle(vehicle);
		
		
		
		SessionFactory sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session seFactory = sessionFactory.openSession();
		
		seFactory.beginTransaction();
		
		seFactory.save(vehicle);
		seFactory.save(userDetails);
		
		seFactory.getTransaction().commit();
		seFactory.close();
		
		UserDetails userDetails2 = new UserDetails();
		Vehicle vehicle1 = new Vehicle();

		vehicle.setVehicleName("pleasure");
		
		userDetails2.setUserName("shital");
		userDetails2.setVehicle(vehicle1);
		
		Session seFactory1 = sessionFactory.openSession();
		
		seFactory1.beginTransaction();
		
		seFactory1.save(vehicle1);
		seFactory1.save(userDetails2);
		
		seFactory1.getTransaction().commit();
		seFactory1.close();
		
		
		
				
	}

}
