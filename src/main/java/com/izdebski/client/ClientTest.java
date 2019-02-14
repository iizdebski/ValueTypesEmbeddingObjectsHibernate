package com.izdebski.client;

import com.izdebski.entities.Employee;
import com.izdebski.model.Address;
import com.izdebski.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.Date;

public class ClientTest {

    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            createEmployee(session);
        }catch(HibernateException e){
            e.printStackTrace();
        }
    }

    private static void createEmployee(Session session){
        session.beginTransaction();
        Integer id = (Integer) session.save(getEmployee());
        System.out.println("Employee is created with Id:" + id);
        session.getTransaction().commit();
    }

    private static Employee getEmployee(){
        Employee employee = new Employee();
        employee.setEmployeeName("Martin Nechyporenko");
        employee.setEmail("martin.ns2039@gmail.com");
        employee.setSalary(50000.00);
        employee.setDoj(new Date());

        Address address = new Address();
        address.setCity("Ternopil");
        address.setPincode(987456321L);
        address.setState("Ternopil region");
        address.setStreet("Lesi Ukrainky Street");
        employee.setAddress(address);
        return employee;
    }
}