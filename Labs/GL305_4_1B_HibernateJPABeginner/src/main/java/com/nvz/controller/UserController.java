package com.nvz.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserController {
    public void createTable(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        factory.close();
        session.close();
    }

//    addUser(factory,session);
//
//    findUser(factory,session,3);
//
//    updateUser(session,3);
//
//    deleteUser(session,4);

}
