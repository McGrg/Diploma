package ru.mysite.web.servlets;

import java.sql.*;
import java.util.*;

class DB {
    private String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String strURL = "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;";
    private Connection con = null;

    public DB() {
        try {
            con = sqlquery.sqlDrive(strDriver, strURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public Statement stat(){
//        Statement stmt=null;
//        try {
//            stmt = con.createStatement();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return stmt;
//    }

    public List<ConstructionSites> getSites() {
        List<ConstructionSites> list = null;
        try {
            list = new LinkedList<>();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM [Diploma].[Master].[ConstructionSite]");
            while (rs.next()) {
                ConstructionSites site = new ConstructionSites();
                site.setConssiteId(rs.getInt("cons_site_id"));
                site.setConssiteCity(rs.getString("cons_site_city"));
                site.setConssiteStreet(rs.getString("cons_site_street"));
                site.setConssiteBilding(rs.getString("cons_site_bilding"));
                site.setStartDate(rs.getString("start_date"));
                site.setFinishDate(rs.getString("finish_date"));
                site.setManager(rs.getString("manager"));
                list.add(site);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void close(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}



