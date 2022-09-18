package example;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*1.StandardServiceRegistry
2.Metadata
3.SessionFactory
4.Session
5.Transaction-crud operations
6.close the connection
*/
public class EmployeeMain {
public static void main(String[] args) {
	//SSR is used to map the config file and execute it
StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//Metadata in the config file should be executed
Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
//session factory
SessionFactory sf=md.getSessionFactoryBuilder().build();
//session is place where we write the CRUD operations
Session s=sf.openSession();
//used to save the crud operations on the db
Transaction t=s.beginTransaction();
Scanner sc=new Scanner(System.in);
Employee e=new Employee();

//System.out.println("enter the id value");
//e.setEmpno(sc.nextInt());
//System.out.println("enter the name");
//e.setEmpname(sc.next());
//System.out.println("enter the email");
//e.setEmpemail(sc.next());
//insert
//s.save(e);

//delete by entering id
System.out.println("enter the id value");
e.setEmpno(sc.nextInt());
s.delete(e);


//retrieve
//Employee e1=s.get(Employee.class,1);
//System.out.println(e1);

t.commit();
s.close();
sf.close();
}
}
