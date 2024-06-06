package com.nvz.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class H2Utility {
    public static Session connectToDB(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }

    public void addStudents(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        Student student1 = new Student("Haseeb", "Muhammad", "mhaseebe@mail.com");
        Student student2 = new Student("John", "Cena", "john@mail.com");
        Student student3 = new Student("Jennifer", "Bai", "jBaji@mail.com");


        //save the student objects
        session.save(student1);
        session.save(student2);
        session.save(student3);

        //commit transaction
        tx.commit();
        session.close();

        // Retrieve data from H2 database
        String hql = "SELECT s FROM Student s";
        Query query = session.createQuery(hql);
        List<Student> studentList = query.getResultList();

        //iterate through the list
        for (Student stu : studentList) {
            System.out.println("Student Id: " + stu.getId() + " | First name: " + stu.getFirstName() +" | LastName: "+ stu.getLastName()  +" | Email: " + stu.getEmail() );
        }
    }


}
