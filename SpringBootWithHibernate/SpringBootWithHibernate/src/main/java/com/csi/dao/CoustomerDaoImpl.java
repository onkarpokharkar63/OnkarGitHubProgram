package com.csi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import com.csi.model.Customer;

@Component
public class CoustomerDaoImpl implements CustomerDao{
	
	private static SessionFactory factory= new AnnotationConfiguration().configure().buildSessionFactory();
	

	@Override
	public void saveData(Customer customer) {
		// TODO Auto-generated method stub
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(customer);
		transaction.commit();
		
	}
	@Override
	public List<Customer> getAllData() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		List<Customer>custlist=session.createQuery("from Customer").list();
		
		return custlist;
	}

}
