package com.nvz.controller;
import com.nvz.model.User;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserController {
    public void createTable(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        factory.close();
        session.close();
    }

    private Session connectToDB(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        return factory.openSession();
    }

    public void addUser(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        User uOne = new User();
        uOne.setEmail("haseeb@gmail.com");
        uOne.setFullName("Moh Haseeb");
        uOne.setPassword("has123");
        uOne.setSalary(2000.69);
        uOne.setAge(20);
        uOne.setCity("NYC");

        User uTwo = new User();
        uTwo.setEmail("James@gmail.com");
        uTwo.setFullName("James Santana");
        uTwo.setPassword("James123");
        uTwo.setSalary(2060.69);
        uTwo.setAge(25);
        uTwo.setCity("Dallas");

        User uThree = new User();
        uThree.setEmail("Shahparan@gmail.com");
        uThree.setFullName("AH Shahparan");
        uThree.setPassword("Shahparan123");
        uThree.setSalary(3060.69);
        uThree.setAge(30);
        uThree.setCity("Chicago");

        /*========= We can pass value/data by using constructor =========*/
        User uFour = new User("Christ", "christ@gmail.com", "147852", 35, 35000.3, "NJ");
        User uFive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");
        session.persist(uOne);
        session.persist(uTwo);
        session.persist(uThree);
        session.persist(uFour);
        session.persist(uFive);

        tx.commit();
        System.out.println("Users successfully created");
        session.close();
    }

    /**
     * returns an object of the specified class that maps a row in the database table. If no row is found, it returns null
     * @param userId
     */
    public void findUser(int userId){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        User u = session.get(User.class, userId);
        System.out.println("FullName: " + u.getFullName());
        System.out.println("Email: " + u.getEmail());
        System.out.println("password: " + u.getPassword());

        //Close resources
        tx.commit();
        session.close();
    }

    /**
     * Updates user by id
     * @param userId
     */
    public void updateUser(int userId){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();
        //create new user object
        User u = new User();
        u.setId(userId);
        u.setEmail("mhaseeb@perscholas");
        u.setFullName("M Haseeb");
        u.setPassword("123456");
        session.merge(u); //saves modifications at any time without knowing about the state of a session
        session.getTransaction().commit();
        session.close();
    }

    /**
     * Deletes user by ID
     * @param userId
     */
    public void deleteUser(int userId){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        User u = new User();
        u.setId(userId);
        session.remove(u); //removes a mapped object from the database
        tx.commit();
        session.close();
    }

    // ----- Hibernate Query Language -----
    // FROM & SELECT clause
    public void findUserHql(){
        Session session = connectToDB();
        String hqlFrom = "FROM User"; //get all records of User class
        String hqlSelect = "SELECT u FROM User u";
        //Using FROM clause
       //TypedQuery<User> query = session.createQuery(hqlFrom, User.class);

        //Using SELECT clause
        TypedQuery<User> query = session.createQuery(hqlSelect, User.class);

        List<User> results = query.getResultList();

        System.out.printf("%s%13s%17s%34s%n","|User Id","|Full name","|Email","|Password");

        //iterate through the results list
        for (User u:results) {
            System.out.printf("%-10d %-20s %-30s %s %n", u.getId(), u.getFullName(), u.getEmail(), u.getPassword());
        }
    }

    // WHERE and ORDER BY clause
    public void getRecordById(){
        Session session = connectToDB();
        String hql = "FROM User u WHERE u.id > 2 ORDER BY u.salary DESC";
        TypedQuery<User> query = session.createQuery(hql, User.class);
        List<User> results = query.getResultList();
        System.out.printf("%s%13s%17s%34s%21s%n", "|User Id", "|Full name", "|Email", "|Password", "|Salary");

        for (User u : results) {
            System.out.printf(" %-10d %-20s %-30s %-23s %s %n", u.getId(), u.getFullName(), u.getEmail(), u.getPassword(), u.getSalary());
        }
    }

    // multiple SELECT expressions
    public void getRecords(){
        Session session = connectToDB();
        TypedQuery<Object[]> query = session.createQuery(
                "SELECT u.salary, u.fullName FROM User u", Object[].class);

        //store the query results in the list
        List<Object[]> results = query.getResultList();
        System.out.printf("%s%13s%n","Salary","City");

        //iterate through the list of objects
        for (Object[] o : results){
            System.out.printf("%-16s%s%n",o[0],o[1]);
        }

    }

    // Aggregate Function
    public void getMaxSalary(){
        Session session = connectToDB();
        String hql = "SELECT MAX(u.salary) FROM User u";
        TypedQuery<Object> query = session.createQuery(hql, Object.class);
        // getSingleResult() executes a SELECT query that returns a single untyped result
        Object result = query.getSingleResult();
        System.out.printf("%s%s","Maximum Salary:",result);
    }

    // GROUP BY clause and Aggregate Function
    public void getMaxSalaryGroupBy(){
        Session session = connectToDB();
        String hql = "SELECT SUM(u.salary), u.city FROM User u GROUP BY u.city";
        TypedQuery query = session.createQuery(hql);
        List<Object[]> result = query.getResultList();

        for (Object[] o : result){
            System.out.println("Total salary " +o[0] +" | city: "+ o[1] );
        }
    }

    // named parameters Syntax
    public void namedQueryExample(){
        Session session = connectToDB();
        String hql = "FROM User u WHERE u.id = :id";
        TypedQuery<User> query = session.createQuery(hql, User.class);
        query.setParameter("id", 2);
        List<User> results = query.getResultList();

        System.out.printf("%s%13s%17s%34s%21s%n", "|User Id", "|Full name", "|Email", "|Password", "|Salary");

        for (User u : results) {
            System.out.printf(" %-10d %-20s %-30s %-23s %s %n", u.getId(), u.getFullName(), u.getEmail(), u.getPassword(), u.getSalary());
        }

    }
}
