package com.izdebski.client;

import com.izdebski.entities.Employee;
import com.izdebski.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class ClientTest {

    public static void main(String[] args) {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            Employee employee = getEmployee();
            session.beginTransaction();

            session.persist(employee);
            Integer id = (Integer)session.save(employee);
            System.out.println("Employee is created with Id: " + id);

            session.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static Employee getEmployee(){
        Employee employee = new Employee();
        employee.setEmployeeName("Martin Nechyporenko");
        employee.setEmail("martin.ns2039@gmail.com");
        employee.setSalary(80000.00);
        employee.setDoj(new Date());
        return employee;
    }
}