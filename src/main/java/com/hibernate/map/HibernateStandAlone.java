package com.hibernate.map;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.map.model.Phone;
import com.hibernate.map.model.Student;

public class HibernateStandAlone {
	
	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	 
	       
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	 
	    	Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house","32354353"));
			phoneNumbers.add(new Phone("mobile","9889343423"));
			
			Student student = new Student("Eswar", phoneNumbers);
			session.save(student);
	         
	        session.getTransaction().commit();
	        session.close();  
	    }

}
