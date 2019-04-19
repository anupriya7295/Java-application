package com.main.resources;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Connection {

    protected static SessionFactory factory; 

    static {
        createSessionFactory();
    }

    /**
     *createSessionFactory static  method is used to create SessionFactory object -factory.
     *
     *@see DatabaseException    custum exception handling.
     */
    private static void createSessionFactory() {
        try{
        	Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) { 
             System.out.println(e);
        } 
    }


}