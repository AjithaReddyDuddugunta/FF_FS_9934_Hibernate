package Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hcl.day40.Address;
import com.hcl.day40.Employee;

public class MainApplication {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		/*
		 * Employee employee = new Employee(); employee.setEmpId(20);
		 * employee.setEmpName("fifty"); session.save(employee); t.commit;
		 * System.out.println("Successfully saved"); factory.close(); session.close();
		 */
		Employee employee = new Employee();
		employee.setEmpId(20);
		employee.setEmpName("Ajitha");
		Address add1 = new Address();
		//add1.setId(1);
		add1.setType("Work");
		add1.setCity("Banglore");
		add1.setCountry("India");
		Address add2 = new Address();
		//add2.setId(2);
		add2.setType("Training");
		add2.setCity("Chennai");
		add2.setCountry("India");
		List<Address> addList = new ArrayList<>();
		addList.add(add1);
		addList.add(add2);
		employee.setAddress(addList);
		session.save(employee);
		t.commit();
		
		Transaction t1 = session.beginTransaction();
		Employee emp1 = new Employee();
		emp1.setEmpId(20);
		emp1.setEmpName("Ajith");
		Address add3 = new Address();
		//add1.setId(1);
		add3.setType("Work");
		add3.setCity("Banglore");
		add3.setCountry("India");
		Address add4 = new Address();
		//add2.setId(2);
		add4.setType("Training");
		add4.setCity("Delhi");
		add4.setCountry("India");
		List<Address> addList1 = new ArrayList<>();
		addList1.add(add3);
		addList1.add(add4);
		emp1.setAddress(addList1);
		session.save(emp1);
		t.commit();
		
		
		Transaction t2 = session.beginTransaction();
		Employee emp2 = new Employee();
		emp2.setEmpId(20);
		emp2.setEmpName("Ankith");
		Address add5 = new Address();
		//add1.setId(1);
		add5.setType("Work");
		add5.setCity("NewYork");
		add5.setCountry("USA");
		Address add6 = new Address();
		//add2.setId(2);
		add6.setType("Home");
		add6.setCity("LosAngels");
		add6.setCountry("USA");
		List<Address> addList2 = new ArrayList<>();
		addList2.add(add5);
		addList2.add(add6);
		emp2.setAddress(addList2);
		session.save(emp2);
		t.commit();
		
		
		
		Transaction t3 = session.beginTransaction();
		Employee emp3 = new Employee();
		emp3.setEmpId(20);
		emp3.setEmpName("Ankitha");
		Address add7 = new Address();
		//add1.setId(1);
		add7.setType("Work");
		add7.setCity("Norway");
		add7.setCountry("America");
		Address add8 = new Address();
		//add2.setId(2);
		add8.setType("Training");
		add8.setCity("Delhi");
		add8.setCountry("India");
		List<Address> addList3 = new ArrayList<>();
		addList3.add(add7);
		addList3.add(add7);
		emp3.setAddress(addList3);
		session.save(emp3);
		t.commit();
		
		
		Transaction t4 = session.beginTransaction();
		Employee emp4 = new Employee();
		emp4.setEmpId(20);
		emp4.setEmpName("Rathna");
		Address add9 = new Address();
		//add1.setId(1);
		add9.setType("Home");
		add9.setCity("Scotland");
		add9.setCountry("UK");
		Address add10 = new Address();
		//add2.setId(2);
		add10.setType("Training");
		add10.setCity("Chennai");
		add10.setCountry("India");
		List<Address> addList4 = new ArrayList<>();
		addList4.add(add9);
		addList4.add(add10);
		emp4.setAddress(addList4);
		session.save(emp4);
		t.commit();
		
		Transaction t5 = session.beginTransaction();
		Employee emp5 = new Employee();
		emp5.setEmpId(20);
		emp5.setEmpName("Sreenu");
		Address add11 = new Address();
		//add1.setId(1);
		add11.setType("Home");
		add11.setCity("Banglore");
		add11.setCountry("India");
		Address add12 = new Address();
		//add2.setId(2);
		add12.setType("Work");
		add12.setCity("Norway");
		add12.setCountry("America");
		List<Address> addList5 = new ArrayList<>();
		addList5.add(add11);
		addList5.add(add12);
		emp5.setAddress(addList5);
		session.save(emp5);
		t.commit();
		
		Transaction t6 = session.beginTransaction();
		Employee emp6 = new Employee();
		emp6.setEmpId(20);
		emp6.setEmpName("Anitha");
		Address add13 = new Address();
		//add1.setId(1);
		add13.setType("Training");
		add13.setCity("Banglore");
		add13.setCountry("India");
		Address add14 = new Address();
		//add2.setId(2);
		add14.setType("Work");
		add14.setCity("Chennai");
		add14.setCountry("India");
		List<Address> addList6 = new ArrayList<>();
		addList6.add(add13);
		addList6.add(add14);
		emp6.setAddress(addList6);
		session.save(emp6);
		t.commit();
		
		Transaction t7 = session.beginTransaction();
		Employee emp7 = new Employee();
		emp7.setEmpId(20);
		emp7.setEmpName("Asmith");
		Address add15 = new Address();
		//add1.setId(1);
		add15.setType("Home");
		add15.setCity("Banglore");
		add15.setCountry("India");
		Address add16 = new Address();
		//add2.setId(2);
		add16.setType("Work");
		add16.setCity("Sweden");
		add16.setCountry("Europe");
		List<Address> addList7 = new ArrayList<>();
		addList7.add(add15);
		addList7.add(add16);
		emp7.setAddress(addList7);
		session.save(emp7);
		t.commit();
		
		Transaction t8 = session.beginTransaction();
		Employee emp8 = new Employee();
		emp8.setEmpId(20);
		emp8.setEmpName("Asmitha");
		Address add17 = new Address();
		//add1.setId(1);
		add17.setType("Training");
		add17.setCity("Banglore");
		add17.setCountry("India");
		Address add18 = new Address();
		//add2.setId(2);
		add18.setType("Work");
		add18.setCity("Sweden");
		add18.setCountry("Europe");
		List<Address> addList8 = new ArrayList<>();
		addList8.add(add17);
		addList8.add(add18);
		emp8.setAddress(addList8);
		session.save(emp8);
		t.commit();
		
		Transaction t9 = session.beginTransaction();

		/*
		 * Employee employee = new Employee(); employee.setEmpId(20);
		 * employee.setEmpName("fifty"); session.save(employee); t.commit;
		 * System.out.println("Successfully saved"); factory.close(); session.close();
		 */
		Employee emp9 = new Employee();
		emp9.setEmpId(20);
		emp9.setEmpName("Ankitha");
		Address add19 = new Address();
		//add1.setId(1);
		add19.setType("Home");
		add19.setCity("Banglore");
		add19.setCountry("India");
		Address add20 = new Address();
		//add2.setId(2);
		add20.setType("Training");
		add20.setCity("Chennai");
		add20.setCountry("India");
		List<Address> addList9 = new ArrayList<>();
		addList9.add(add19);
		addList9.add(add20);
		emp9.setAddress(addList9);
		session.save(emp9);
		t.commit();
		
		System.out.println("Successsfully saved");
		factory.close();
		session.close();
		
		
	}
}
