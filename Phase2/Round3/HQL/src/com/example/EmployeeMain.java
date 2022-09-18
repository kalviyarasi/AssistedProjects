package com.example;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

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

//for(int i=0;i<10;i++) {
//Employee e=new Employee();
//e.setEmpno(i);
//e.setEmpname("name"+i);
//e.setEmpemail("name"+i+"@g.c");
//s.save(e);
//}

//HQL
//select * from employee;
//Query q=s.createQuery("from Employee");
//List<Employee> el =q.list();
//for(Employee dis:el) {
//	System.out.println(dis.getEmpno()+" "+dis.getEmpname()+" "+dis.getEmpemail());
//}





//select * from employee where empno=2;
//Query q=s.createQuery("from Employee where empno=2");
//Employee el=(Employee) q.uniqueResult();
//System.out.println(el);


//select * from employee where empno>2;
Query q=s.createQuery("from Employee where empno>2");
List<Employee> el =q.list();
for(Employee dis:el) {
	System.out.println(dis.getEmpno()+" "+dis.getEmpname()+" "+dis.getEmpemail());
}

//select empname,empemail from employee where empno=2;
//Query q=s.createQuery("select empname,empemail from Employee where empno=2");
//Object[] emp=(Object[])q.uniqueResult();
//System.out.println(emp[0]+" "+emp[1]);


//select empname,empemail from employee where empno>2;
//Query q=s.createQuery("select empname,empemail from Employee where empno>2");
//List<Object[]> emp=q.list();
//for(Object e1[]:emp) {
//	System.out.println(e1[0]+"   "+e1[1]);
//}

//update or delete
//System.out.println("enter the empname");
//e.setEmpname(sc.next());
//System.out.println("enter the emp no value");
//e.setEmpno(sc.nextInt());
//Query q=s.createQuery("update Employee set empname=:name where empno=:no");
//q.setParameter("name",e.getEmpname());
//q.setParameter("no", e.getEmpno());
//q.executeUpdate();

t.commit();
s.close();
sf.close();
}
}

