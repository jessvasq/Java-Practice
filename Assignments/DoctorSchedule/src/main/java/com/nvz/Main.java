package com.nvz;

import com.nvz.services.DBUtility;

public class Main {
    public static void main(String[] args) {
        DBUtility doctorsDB = new DBUtility();
        //doctorsDB.connectToDB();
        //doctorsDB.insertData();
        //doctorsDB.insertDoctors();
        //doctorsDB.insertSchedule();
        doctorsDB.insertPatients();
    }
}