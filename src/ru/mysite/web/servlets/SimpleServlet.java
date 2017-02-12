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
//        try {
//            DB db = new DB();
//            List<ConstructionSites> sites = db.getSites();
//            String base= new Gson().toJson(sites);
//                PrintWriter out = response.getWriter();
//                out.println(base);
//                out.close();
//                db.Close();
//        } catch (Exception e) {
        DB db = new DB();
        try {
            String base = "";
            if (db != null) {
                List<ConstructionSites> sites = db.getSites();
                for (ConstructionSites site : sites) {
                    response.getWriter().write(site.toString());
                }
                String gson= new Gson().toJson(sites);
                db.close();
                PrintWriter out = response.getWriter();
                out.println(gson);
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
