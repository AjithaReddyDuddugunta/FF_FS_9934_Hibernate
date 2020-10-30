package Main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import com.hcl.day40.Address;
import com.hcl.day40.Employee;

/**
 * 
 * @author dudduguntaaji.reddy
 *
 */
public class MainThree {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Employee.class);
		c.createAlias("addresses", "a");
		c.addOrder(Order.asc("a.country"));
		c.addOrder(Order.desc("a.type"));
		c.setProjection(Projections.projectionList().add(Projections.property("a.country"))
				.add(Projections.property("a.type")).add(Projections.property("empName")));
		List<Object[]> list = c.list();
		Object country = null;
		Object type = null;
		Object empName = null;
		for (Object obj : list) {
			Object[] object = (Object[]) obj;
			country = object[0];
			type = object[1];
			empName = object[2];
			if ((country != null) && (country.equals(object[0]))) {
				System.out.println(object + " ");
			}
			System.out.println(object + " ");
		}
		System.out.println(" ");

		factory.close();
		session.close();
	}
}