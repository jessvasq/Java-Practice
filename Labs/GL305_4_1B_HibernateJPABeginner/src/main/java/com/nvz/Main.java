package com.nvz;

import com.nvz.controller.UserController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserController userDB = new UserController();
        //userDB.createTable();
        //userDB.addUser();
        //userDB.findUser(2);
        //userDB.updateUser(3);
        //userDB.deleteUser(4);

        // ---------- Hibernate Query Language --------- \\
//        userDB.findUserHql();
//        userDB.getRecordById();
//        userDB.getRecords();
//        userDB.getMaxSalary();
//        userDB.getMaxSalaryGroupBy();
//        userDB.namedQueryExample();
    }
}