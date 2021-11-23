package hqlNjpql;
import java.util.*;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HQLDemos
{
	public void demos()
	{
		EntityManagerFactory eFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=eFac.createEntityManager();
		
		Query qry= eMan.createQuery("from Employee");
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
		}
		eMan.close();
		eFac.close();
	}
}