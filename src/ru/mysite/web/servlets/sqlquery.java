package ru.mysite.web.servlets;

import java.sql.*;


/**
 * Created by MSI GT70 on 09.02.2017.
 */
public class sqlquery {
    private static Connection con;

    public static Connection sqlDrive(String stringDriver, String url) throws ClassNotFoundException, SQLException {

        Class.forName(stringDriver);
        con = DriverManager.getConnection(url);
        if (con == null) return null;
        return con;
    }

    public static void close(Connection con) throws SQLException {
        con.close();
    }
}
