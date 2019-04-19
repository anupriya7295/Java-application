package com.main.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.main.dao.EmployeeDao;
import com.main.model.Employee;
import com.main.resources.Connection;

public class EmployeeDaoImpl extends Connection implements EmployeeDao {
	
	
	public Integer insertEmployee(Employee e) {
		Session session  = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			employeeID = (Integer) session.save(e);
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
		
		return employeeID;
		// TODO Auto-generated method stub
		
	}
	public List<Employee> retrieveAllEmployess() {
		Session session  = factory.openSession();
		Transaction tx = null;
		List<Employee> elist= new ArrayList<Employee>();
		try {
			tx = session.beginTransaction();
			elist = session.createQuery("FROM Employee").list();
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
		// TODO Auto-generated method stub
		return elist;
	}
	public Employee retrieveEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Session session  = factory.openSession();
		Transaction tx = null;
		Employee employee = null;
		try {
			tx = session.beginTransaction();
			employee = (Employee)session.get(Employee.class, id);
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
		return employee;
	}

}
