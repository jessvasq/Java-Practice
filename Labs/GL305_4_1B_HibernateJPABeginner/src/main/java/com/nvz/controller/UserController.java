package com.nvz.controller;
import com.nvz.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

}
