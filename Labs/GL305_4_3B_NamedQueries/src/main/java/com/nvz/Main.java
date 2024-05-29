package com.nvz;

import com.nvz.controller.EmployeeController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeController employeesDB = new EmployeeController();
        //employeesDB.generateTable();
        employeesDB.findEmployeeByName();
        employeesDB.findEmployeeById();
        employeesDB.showOfficeCodesAsDepartment();
    }
}