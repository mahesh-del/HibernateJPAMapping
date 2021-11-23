package hqlNjpql;
import java.util.*;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
public class HQLDemos
{
	
	//task
	public void filterNames()
	{
		char c;
		System.out.println("Enter Character : ");
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		EntityManagerFactory eFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=eFac.createEntityManager();
    	Query qry = eMan.createQuery("select e from Employee e where e.fname like concat(:ch,'%')");
    	qry.setParameter("ch", c);
    	List<Employee> emps=qry.getResultList();
    	for(Employee e : emps) {
    		System.out.println(e);
    	}
		
		
		//Display the Employees whose firtsname starts with letter passed as input.
	}
	public void demos()
	{
		EntityManagerFactory eFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=eFac.createEntityManager();
		
		Query qry= eMan.createQuery("select e from Employee e WHERE e.salary BETWEEN ?1 and ?2");
		qry.setParameter(1, 20000);
		qry.setParameter(2, 25000);
		List<Employee> emps=qry.getResultList();
		for(Employee e : emps)
		{
			System.out.println("First "+e);
		}
		
		Query qry2= eMan.createQuery("select e from Employee e WHERE e.salary BETWEEN :lval and :hval");
		qry2.setParameter("lval", 20000);
		qry2.setParameter("hval", 25000);
		List<Employee> emps2=qry2.getResultList();
		for(Employee e : emps2)
		{
			System.out.println("Second " + e);
		}
		
		//Query qry=eMan.createQuery("select max(e.salary) from Employee e");
		//int maxsal=(int) qry.getSingleResult();
		//System.out.println("Max Sal :"+maxsal);
		
		/*Query qry=eMan.createQuery("select e.lname from Employee e WHERE e.empno=100");
		String op=(String) qry.getSingleResult();
		System.out.println(op);
		
		//Query qry= eMan.createQuery("from Employee");
		//Query qry=eMan.createQuery("select DISTINCT e.fname from Employee e");
		//List<String> fnames=qry.getResultList();
		//System.out.println(fnames);
		/*Query qry=eMan.createQuery("select e.fname,e.lname  from Employee e");
		List<Object[]> fnames=qry.getResultList();
		for(Object[] obj : fnames)
		{
			System.out.println(obj[0]+" "+obj[1]);
		}
		
		qry.setFirstResult(5);
		qry.setMaxResults(5);
		//Query qry= eMan.createQuery("select e from Employee e");
		//Query qry= eMan.createQuery("select e from Employee e WHERE e.salary>17000");
		//Query qry= eMan.createQuery("select e from Employee e WHERE e.salary BETWEEN 20000 and 25000");
		//Query qry= eMan.createQuery("select e from Employee e WHERE e.fname LIKE 'A%'");
		//Query qry= eMan.createQuery("from Employee e ORDER BY e.salary DESC");
		List<Employee> emps=qry.getResultList();
		for(Employee e : emps)
		{
			System.out.println(e);
		}*/
		eMan.close();
		eFac.close();
	}
}
