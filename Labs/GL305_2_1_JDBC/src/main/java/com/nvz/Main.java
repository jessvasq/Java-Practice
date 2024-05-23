package com.nvz;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        InsertPreparedStExample ob = new InsertPreparedStExample();
        ob.insertExample();

        UpdatePreparedStExample ob2 = new UpdatePreparedStExample();
        ob2.updateEx();
    }
}