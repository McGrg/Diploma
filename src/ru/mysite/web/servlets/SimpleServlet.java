package ru.mysite.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;



public class SimpleServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
//        try {
//            DB db = new DB("com.microsoft.sqlserver.jdbc.SQLServerDriver",
//                    "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;");
//            List<ConstructionSites> sites = db.getSites();
//            String base= new Gson().toJson(sites);
//                PrintWriter out = response.getWriter();
//                out.println(base);
//                out.close();
//                db.Close();
//        } catch (Exception e) {
        DB db = new DB();
        try {
            Statement stmt = sqlquery.sqlDrive("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                    "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;");
            String base = "";
            if (stmt != null) {
                List<ConstructionSites> sites = db.getSites(stmt);
                ResultSet rs = sqlquery.rs("SELECT * FROM [Diploma].[Master].[Materials]");
                while (rs.next()) {
                    base = rs.getString("mater_name") + ":" + rs.getString(1);
                }
                sqlquery.close();
                response.setContentType("text/html; charset = Windows-1251");
                PrintWriter out = response.getWriter();
                out.println(base);
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
