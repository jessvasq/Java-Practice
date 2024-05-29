package com.nvz.controller;

import com.nvz.model.Employee;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeController {
    public void generateTable(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        factory.close();
        session.close();
    }

    private Session connectToDatabase(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        return factory.openSession();
    }

    public void findEmployeeByName(){
        Session session = connectToDatabase();
        TypedQuery<Employee> query = session.createNamedQuery("findEmployeeByName", Employee.class);
        query.setParameter("name", "Tom Thele");
        List<Employee> employees = query.getResultList();
        System.out.printf("%-10s%-22s%-14s%-14s%-16s%-10s%-10s%s%n","ID","Name","Salary", "Job","AddressLine","Zipcode","city","startDate");

        for ( Employee e : employees) {
            System.out.printf("%-11d%-22s%-14d%-14s%-16s%-10s%-10s%s%n",e.getId(),e.getName(),e.getSalary(),e.getJob(),e.getAddressLine(),e.getZipcode(),e.getCity(),e.getStartDate());
        }
        session.close();
    }

    public void findEmployeeById(){
        Session session = connectToDatabase();
        TypedQuery<Object[]> query = session.createNamedQuery("getEmployeeById", Object[].class);
        query.setParameter("id", 3);
        List<Object[]> employee = query.getResultList();
        System.out.printf("%-10s%-12s%s%n", "Name","Salary", "Job");

        for (Object[] o : employee){
            System.out.printf("%-11s%-12s%s%n",o[0],o[1],o[2]);
        }
        session.close();
    }


    public void showOfficeCodesAsDepartment(){
        Session session = connectToDatabase();
        TypedQuery<Object[]> query = session.createNamedQuery("employeeDeptAlias", Object[].class);
        List<Object[]> employees = query.getResultList();

        for (Object[] e : employees){
            System.out.printf(" %-15s%-17s%s%n",e[1],e[3],e[2]);
        }

        session.close();
    }


}
