package com.nvz;

import com.nvz.services.DBUtility;

public class Main {
    public static void main(String[] args) {
        DBUtility usersDBObj = new DBUtility();
        //usersDBObj.manyToOne();
        //usersDBObj.oneToMany();
        usersDBObj.oneToOne();
    }
}