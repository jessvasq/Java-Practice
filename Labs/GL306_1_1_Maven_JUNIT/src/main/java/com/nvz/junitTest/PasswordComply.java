package com.nvz.junitTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PasswordComply {

    private String passwordString;
    private final int minPasswordLength = 8;
    private final int maxPasswordLength = 12;

    static final String DB_URL = "jdbc:mysql://localhost/perScholas";
    static final String USER = "root";
    static final String PASSWORD = "";
    static final String QUERY = "{ call getEmpName (?, ?)}";

    public PasswordComply(String verifyPassword) {
        passwordString = verifyPassword;
    }

    /**
     * Checks if the password is greater than 8 and less than 12 characteres
     * @return
     */
    private boolean verifyPasswordLength() {
        if (!passwordString.isEmpty()) {
            if(passwordString.length() >= minPasswordLength && passwordString.length() <= maxPasswordLength) {
                return true;
            }
        }
        return false;
    }

    // the methods below return true for testing purposes, logic to be added
    private boolean verifyAlphaNumeric(){
        return true;
    }

    private boolean hasAllowedSpecialCharacters(){
        return true;
    }


    public boolean doesNotAlreadyExist() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        CallableStatement stmt = conn.prepareCall(QUERY);
        stmt.setString(1, passwordString);
        stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
        System.out.println("Executing stored procedure");
        stmt.execute();

        String existingPassword = stmt.getString(2);
        System.out.println("Password already exist " + existingPassword);
        return true;
    }

    private boolean hasNoSpecialCharacters(){
        return true;
    }

    public void setPassword(String givenPassword) {
        passwordString = givenPassword;
    }

    public boolean doesPasswordComply(){
        return verifyPasswordLength() && verifyAlphaNumeric() && hasAllowedSpecialCharacters() && hasNoSpecialCharacters();
    }

}
