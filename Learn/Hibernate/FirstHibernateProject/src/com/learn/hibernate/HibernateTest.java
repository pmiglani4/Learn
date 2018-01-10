package com.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.dto.User;
import com.learn.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Preeti");
		user.setAddress("B-52, sector 53");
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setName("car");
		vehicle1.getUserList().add(user);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setName("jeep");
		vehicle2.getUserList().add(user);
		user.getVehicles().add(vehicle1);
		user.getVehicles().add(vehicle2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();
	}

}
