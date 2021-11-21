package com.lti.hibernateApplication;

import java.util.List;

import com.lti.hiber.dao.ProfileDAO;
import com.lti.hiber.pojo.Profile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Profile pf=new Profile(2004,"singh","samdhan","mumbaiii");
       ProfileDAO dao=new ProfileDAO();
       //dao.deletePerson(2001);
       List<Profile> res=dao.getAllPersons();
       for(Profile p : res)
     	{
   		System.out.println(p);
   	    }
       //dao.saveProfile(pf);
       //dao.updateProfile(pf);
//       Profile prof=dao.searchByidno(2008);
//       if(prof!=null) {
//    	   System.out.println(prof);
//       }
//       else {
//    	   System.out.println("person not found");
//       }
       
       
    }
}
