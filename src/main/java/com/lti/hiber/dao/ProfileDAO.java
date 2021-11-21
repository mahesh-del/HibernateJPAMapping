package com.lti.hiber.dao;
import com.lti.hiber.pojo.Profile;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ProfileDAO {
	public void saveProfile(Profile profile) {
		
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		eMan.getTransaction().begin();//starting a transaction
		eMan.persist(profile);//saving the object to DB(inserting)
		eMan.getTransaction().commit();//transactions committed changes made permanent
		eMan.close();
		emFac.close();
		System.out.println("profile saved....");
		
	}
	public void updateProfile(Profile profile) {
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		
		eMan.getTransaction().begin();
		eMan.merge(profile);
		eMan.getTransaction().commit();
		eMan.close();
		emFac.close();
		System.out.println("profile updated");
		
	}
	public Profile searchByidno(int idno) {
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		Profile prf=eMan.find(Profile.class,idno);
		System.out.println(prf);
		return prf;
	}
	public void deletePerson(int id) {
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		eMan.getTransaction().begin();
		Profile p=eMan.find(Profile.class,id);
		eMan.remove(p);
		eMan.getTransaction().commit();
		System.out.println("profile deleted");
		
		
	}
	public List<Profile> getAllPersons()
	{
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		
		Query qry= eMan.createQuery("from Profile");
		List<Profile> profs= qry.getResultList(); //Hibernate Query Interface
		return profs;
	}
		
	

}
