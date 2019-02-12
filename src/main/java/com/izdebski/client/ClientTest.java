package com.izdebski.client;

import com.izdebski.entities.Employee;
import com.izdebski.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class ClientTest {

    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            session.beginTransaction();
            /*
            persist() -> This method is used to save an entity/object into a database
            and return void.
            It will throw an exception if an entity already exists in the database.
             */
            session.persist(getEmployee1());

            /*
            save() -> This method is used to save an entity/object into a database and return
            a generated primary. It will throw an exception if an entity
            already exists in the database.
            */

            Integer id = (Integer)session.save(getEmployee2());
            System.out.println("Employee is created with Id: " + id);

            /*saveOrUpdate()->This method is used to either save or
            update an entity in the database.
            */

            session.saveOrUpdate(getEmployee3());

            session.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static Employee getEmployee1(){
        Employee employee = new Employee();
        employee.setEmployeeName("Martin Nechyporenko");
        employee.setEmail("martin.ns2039@gmail.com");
        employee.setSalary(80000.00);
        employee.setDoj(new Date());
        return employee;
    }

    private static Employee getEmployee2(){
        Employee employee = new Employee();
        employee.setEmployeeName("Franl Nechyporenko");
        employee.setEmail("frank.ns2039@gmail.com");
        employee.setSalary(70000.00);
        employee.setDoj(new Date());
        return employee;
    }

    private static Employee getEmployee3(){
        Employee employee = new Employee();
        employee.setEmployeeName("Peter Nechyporenko");
        employee.setEmail("peter.ns2039@gmail.com");
        employee.setSalary(60000.00);
        employee.setDoj(new Date());
        return employee;
    }
}