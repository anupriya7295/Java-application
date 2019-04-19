package com.main.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.main.model.Project;
import com.main.resources.Connection;

public class ProjectDaoImpl extends Connection {
	
	public Project retrieveProjectById(Integer id) {
		// TODO Auto-generated method stub
		Session session  = factory.openSession();
		Transaction tx = null;
		Project project = null;
		try {
			tx = session.beginTransaction();
			project = (Project)session.get(Project.class, id);
			tx.commit();																																																																																																																																																																																																																																																																																																																																																																
		} catch (Exception exp) {
			if(null != tx) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                tx.rollback();
            }
			exp.printStackTrace();
		} finally {
			if(session != null) {																																													
				session.close();
            }
		}
		return project;
	}

}
