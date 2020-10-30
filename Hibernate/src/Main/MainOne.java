package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

import org.hibernate.Query;

import com.hcl.day40.Address;
import com.hcl.day40.Employee;

/**
 * @author dudduguntaaji.reddy
 *
 */
public class MainOne {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee e ");
		List<Employee> employeelist = query.list();
		int count=0;
		for (Employee e : employeelist) {
			for (Address a : e.getAddress()) {
				System.out.println(e);
				if(a.getCountry().equals("India") && a.getType().equals("Work")) {
					count++;
				}
			}
		}
	}
	String nativeSql = "Select count(distinct(empId) From EMPDEC e, ADDDEC a where empId = a.empId and a.country='India' and a.type='Work'";
	@SuppressWarnings("rawtypes")
	Query query1 = session.createSQLQuery(nativeSql);
	System.out.println("Number of employees working in India are : "+query1.getResultList().get(0));
	//System.out.println("Number of employees working in India are : "+count);
		/**
		 * Closing the session.
		 */
		session.close();
		factory.close();
		
	}
}