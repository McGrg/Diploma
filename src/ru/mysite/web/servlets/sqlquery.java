package ru.mysite.web.servlets;

import java.sql.*;



/**
 * Created by MSI GT70 on 09.02.2017.
 */
//public class sqlquery {
//    private static Connection con;
//
//    public static Connection sqlDrive(String stringDriver, String url) throws ClassNotFoundException, SQLException {
//        Class.forName(stringDriver);
//        con = DriverManager.getConnection(url);
//        if (con == null) return null;
//        return con;
//    }

//    public static void close(Connection con) throws SQLException {
//        con.close();
//    }

public class sqlquery {
    private static Connection con;
    private static Statement stmt;

    public static Statement sqlDrive(String stringDriver, String url) throws ClassNotFoundException, SQLException {

        Class.forName(stringDriver);
        con = DriverManager.getConnection(url);
        if (con == null) return null;
        stmt = con.createStatement();
        return stmt;
    }

    public static ResultSet rs (String query) throws SQLException{
        return stmt.executeQuery(query);
    }

    public static void close() throws SQLException {
        stmt.close();
        con.close();
    }
}
