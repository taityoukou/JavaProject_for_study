package com.anson.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;  
	private static StandardServiceRegistry  serviceRegistry;
	
	static{
		serviceRegistry = new StandardServiceRegistryBuilder().configure().build(); 
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
