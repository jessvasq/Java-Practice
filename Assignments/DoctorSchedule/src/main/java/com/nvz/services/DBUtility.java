package com.nvz.services;

import com.nvz.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DBUtility {
    public Session connectToDB(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }

    public void insertData(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        // Create Hospitals
        Hospital hospital1 = new Hospital("Bellevue", "NYC");

        // Create Doctors
        Doctors doctor1 = new Doctors("John", hospital1);
        Doctors doctor2 = new Doctors("Jane", hospital1);
        Doctors doctor3 = new Doctors("Jack", hospital1);

        session.persist(hospital1);
        session.persist(doctor1);
        session.persist(doctor2);
        session.persist(doctor3);

        tx.commit();
    }

    public void insertDoctors(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        Hospital hospital2 = new Hospital("Presbyterian", "NYC");
        Hospital hospital3 = new Hospital("Mount Sinai", "Boston");
        session.persist(hospital2);
        session.persist(hospital3);
        Doctors doctor1 = new Doctors("Charles", hospital2);
        Doctors doctor2 = new Doctors("Melissa", hospital2);

        // Add doctors to the list
        ArrayList<Doctors> doctorList = new ArrayList<>();
        doctorList.add(doctor1);
        doctorList.add(doctor2);

        // Save Data
        session.persist(doctor1);
        session.persist(doctor2);

        // Create new specialty
        Specialty specialty1 = new Specialty("Internal Medicine");

        // Add doctors to specialty
        specialty1.setDoctors(doctorList);
        session.persist(specialty1);
        tx.commit();
    }

    public void insertSchedule(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        // Create Schedule
        DoctorSchedule schedule1 = new DoctorSchedule(7.00,"Morning");
        DoctorSchedule schedule2 = new DoctorSchedule(15.00,"Afternoon");
        DoctorSchedule schedule3 = new DoctorSchedule(23.00,"Evening");
        session.persist(schedule1);
        session.persist(schedule2);
        session.persist(schedule3);

        // Create Hospital
        Hospital hospital2 = new Hospital("Presbyterian", "NYC");
        Hospital hospital3 = new Hospital("Mount Sinai", "Boston");
        session.persist(hospital2);
        session.persist(hospital3);

        // Create new doctors
        Doctors doctor1 = new Doctors("Michelle", hospital3, schedule1);
        Doctors doctor2 = new Doctors("Maya", hospital2, schedule2);

        session.persist(doctor1);
        session.persist(doctor2);
        tx.commit();

    }

    public void insertPatients(){
        Session session = connectToDB();
        Transaction tx = session.beginTransaction();

        // Create New Doctors
        Doctors doctor3 = new Doctors("Jay");
        Doctors doctor4 = new Doctors("Patrick");
        Doctors doctor5 = new Doctors("Eloise");
        Doctors doctor6 = new Doctors("Martha");

        session.persist(doctor3);
        session.persist(doctor4);
        session.persist(doctor5);
        session.persist(doctor6);

        Set<Doctors> doctorSet1 = new HashSet<>();
        doctorSet1.add(doctor3);
        doctorSet1.add(doctor4);

        Set<Doctors> doctorSet2 = new HashSet<>();
        doctorSet2.add(doctor5);
        session.persist(doctor6);


        // Create new patients
        Patients patient1 = new Patients("Lexi", "Queens", doctorSet1);
        Patients patient2 = new Patients("Mary", "Brooklyn", doctorSet2);

        session.persist(patient1);
        session.persist(patient2);
        tx.commit();
    }

//
//    public void insertDoctorSchedule(){
//        Session session = connectToDB();
//        Transaction tx = session.beginTransaction();
//
//        // Create Schedule
//        DoctorSchedule schedule1 = new DoctorSchedule(7.00,"Morning");
//        DoctorSchedule schedule2 = new DoctorSchedule(15.00,"Afternoon");
//        DoctorSchedule schedule3 = new DoctorSchedule(23.00,"Evening");
//        session.persist(schedule1);
//        session.persist(schedule2);
//        session.persist(schedule3);
//
//        // Create Hospital
//        Hospital hospital2 = new Hospital("Presbyterian", "NYC");
//        Hospital hospital3 = new Hospital("Mount Sinai", "Boston");
//        session.persist(hospital2);
//        session.persist(hospital3);
//
//        // Create new doctors
//        Doctors doctor1 = new Doctors("Michelle", hospital3, schedule1);
//        Doctors doctor2 = new Doctors("Maya", hospital2, schedule2);
//        Doctors doctor3 = new Doctors("Jay", hospital2, schedule3);
//        Doctors doctor4 = new Doctors("Patrick", hospital3, schedule2);
//
//        Set<Doctors> doctorSet = new HashSet<>();
//        doctorSet.add(doctor1);
//        doctorSet.add(doctor2);
//
//        session.persist(doctor1);
//        session.persist(doctor2);
//
//        Set<Doctors> doctorSet2 = new HashSet<>();
//        doctorSet2.add(doctor3);
//        doctorSet2.add(doctor4);
//
//        session.persist(doctor3);
//        session.persist(doctor4);
//
//        // Create new specialty
//        Specialty specialty1 = new Specialty("Internal Medicine");
//        Specialty specialty2 = new Specialty("Rare Diseases");
//
//        // Add doctors to specialty
//        specialty1.setDoctors(doctorSet);
//        specialty2.setDoctors(doctorSet2);
//
//        session.persist(specialty1);
//        session.persist(specialty2);


//        // Create new patients
//        Patients patient1 = new Patients("Lexi", "Queens", doctorSet2);
//        Patients patient2 = new Patients("Mary", "Brooklyn", doctorSet);
//
//        session.persist(patient1);
//        session.persist(patient2);


//        Set<Patients> patientSet = new HashSet<>();
//        patientSet.add(patient1);
//        patientSet.add(patient2);
//        patientSet.add(patient3);
//
//        tx.commit();
//    }
}
