package ru.mysite.web.servlets;

import java.io.IOException;
import java.sql.*;


public class SimpleServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("Windows-1251");
        try {
            Statement stmt = sqlquery.sqlDrive("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                    "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;");
            if (stmt != null) {
                ResultSet rs = sqlquery.rs("SELECT * FROM [Diploma].[Master].[Materials]");
                while (rs.next()) {
                    String base = rs.getString("mater_name") + ":" + rs.getString(1);
                    response.getWriter().write("Data: " + base);
                }
                sqlquery.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
