package Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.hcl.day40.Employee;

public class MainNamedQuery{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
			.build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Query query = session.getNamedQuery("findEmployeeByName");
	query.setEmpName("name","A");
	List<Employee> employees=query.list();
	employees.forEach(employee : employees) {
		System.out.println(obj.getEmpName());
	}
	factory.close();
	session.close();
}
