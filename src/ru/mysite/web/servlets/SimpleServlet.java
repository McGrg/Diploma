package ru.mysite.web.servlets;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class SimpleServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        try {
            DB db = new DB("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                    "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;");
            List<ConstructionSites> sites = db.getSites();
            String base= new Gson().toJson(sites);
                PrintWriter out = response.getWriter();
                out.println(base);
                out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
