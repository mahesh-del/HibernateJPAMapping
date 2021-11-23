package com.lti.hibernateApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.lti.hiber.pojo.Passport;
import com.lti.hiber.pojo.Person;
import com.lti.hiber.pojo.PersonAadhar;

import co.lti.hiber.otm.Cart;
import co.lti.hiber.otm.CartItem;
import hqlNjpql.HQLDemos;
import inheritance.Bank;
import inheritance.ICICIBank;
import inheritance.YesBank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HQLDemos hd=new HQLDemos();
    	hd.demos();
    	HQLDemos fn=new HQLDemos();
    	fn.filterNames();
    	//Inheritence Demo
    	/*Bank bank=new Bank();
        bank.setBankid("B0001");
        bank.setBankname("RBI");

        ICICIBank icc=new ICICIBank();
        icc.setBankid("ICICI001");
        icc.setBankname("ICICI");
        icc.setInterestRate(13.99);

        YesBank ys=new YesBank();
        ys.setBankid("Yes001");
        ys.setBankname("YesBank");
        ys.setPlStartAmount(50000);

        EntityManagerFactory eFac=Persistence.createEntityManagerFactory("MyDB");
        EntityManager eMan=eFac.createEntityManager();

        eMan.getTransaction().begin();
        eMan.persist(bank);
        eMan.persist(icc);
        eMan.persist(ys);
        eMan.getTransaction().commit();       
        eMan.close();
        eFac.close();     
        System.out.println("Bingo!");
    	/* Cart custCart1=new Cart("AXN001","Cust001",180);
    	CartItem item1=new CartItem("CRT001","Powder",90,1);
    	CartItem item2=new CartItem("CRT002","Saop",30,3);
    	CartItem item3=new CartItem("CRT003","Nutella",920,1);
    	
    	item1.setCart(custCart1);
    	item2.setCart(custCart1);
    	item3.setCart(custCart1);
    	
    	Set<CartItem> cart1=new HashSet<CartItem>();
    	cart1.add(item1);
    	cart1.add(item2);
    	cart1.add(item3);
    	
    	
    	custCart1.setCartItems(cart1); */
    	
    	/*Person person=new Person(1234,"Gagan","Gujarat");
    	//PersonAadhar pa=new PersonAadhar("1234xxxx9011",LocalDate.now());
    	//person.setpAadhr(pa);
    	//Passport pp=new Passport("ELLJD585P","Mahesh",19);
    	//person.setpPassport(pp);
    	EntityManagerFactory eFac=Persistence.createEntityManagerFactory("MyDB");
    	EntityManager eMan=eFac.createEntityManager();
    	
    	eMan.getTransaction().begin();
    	eMan.persist(custCart1);

    	eMan.getTransaction().commit();
    	
    	eMan.close();
    	eFac.close();
    	System.out.println("Person Info Added");*/   
    	} 
}