package com.nvz.services;
import com.nvz.model.Address;
import com.nvz.model.Cohort;
import com.nvz.model.Department;
import com.nvz.model.Teacher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DBUtility {
    public static Session connectToDB(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }

    public void manyToOne(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();
        //creating departments
        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        //creating teacher
        Teacher t1 = new Teacher("1000","MHaseeb",dept1);
        Teacher t2 = new Teacher("2220","Shahparan",dept1);
        Teacher t3 = new Teacher("3000","James",dept1);
        Teacher t4 = new Teacher("40000","Joseph",dept2);

        //Storing departments in database
        session.persist(dept1);
        session.persist(dept2);

        //Storing teachers  in database
        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.persist(t4);

        tx.commit();

    }

    public void oneToMany(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();
        //creating teacher
        Teacher t1 = new Teacher("1000","MHaseeb");
        Teacher t2 = new Teacher("2220","Shahparan");
        Teacher t3 = new Teacher("3000","James");
        Teacher t4 = new Teacher("40000","Joseph");
        Teacher t5 = new Teacher("200","Ali");

        //Add teacher entity object to the list
        ArrayList<Teacher> teachersList = new ArrayList<>();
        teachersList.add(t1);
        teachersList.add(t2);
        teachersList.add(t3);
        teachersList.add(t4);
        teachersList.add(t5);

        // //Storing teachers in database
        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.persist(t4);
        session.persist(t5);

        //Creating Department
        Department department = new Department();
        department.setDeptName("Development");
        department.setTeacherList(teachersList);

        //Storing Department
        session.persist(department);
        tx.commit();
    }

    public void oneToOne(){
        System.out.println("Maven + Hibernate + SQL One to One Mapping Annotations");
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();
        Address a1 = new Address("27th street","NYC","NY",11103);
        Address a2 = new Address("28th street","Buffalo","NY",15803);

        Teacher t1 = new Teacher("1000","MHaseeb");
        Teacher t2 = new Teacher("2220","Shahparan");
//        t1.setAddress(a1);
//        t2.setAddress(a2);

        session.persist(a1);
        session.persist(a2);
        session.persist(t1);
        session.persist(t2);

        tx.commit();
    }

    public void manyToMany() {
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        // Create Cohort/class Entity set one
        Cohort Class1 = new Cohort("Java Developer", "14 weeks");
        Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
        Cohort Class3 = new Cohort("Python Developer", "12 Weeks");

        // Store Cohort  / Class
        session.persist(Class1);
        session.persist(Class2);
        session.persist(Class3);

        // Create Cohort One / Class one
        Set<Cohort> ClassSet1 = new HashSet<Cohort>();
        ClassSet1.add(Class1);
        ClassSet1.add(Class2);
        ClassSet1.add(Class3);

        // Create Cohort Two / Class two
        Set<Cohort> ClassSet2 = new HashSet<Cohort>();
        ClassSet2.add(Class2);
        ClassSet2.add(Class3);
        ClassSet2.add(Class1);

        // Create Cohort Three / Class Three
        Set<Cohort> ClassSet3 = new HashSet<Cohort>();
        ClassSet3.add(Class3);
        ClassSet3.add(Class1);
        ClassSet3.add(Class2);

        Teacher t1 = new Teacher("100", "Haseeb", ClassSet1);
        Teacher t2 = new Teacher("200", "Jenny", ClassSet2);
        Teacher t3 = new Teacher("200", "Charlie", ClassSet3);

        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        tx.commit();
    }
}
