package ru.mysite.web.servlets;

import java.sql.*;
import java.util.*;

class DB {
//    private static Connection con = null;

//    public DB(String stringDriver, String url) {
//        try {
//            con = sqlquery.sqlDrive(stringDriver, url);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
    public List<ConstructionSites> getSites(Statement stmt) {
        List<ConstructionSites> list = null;
        try {
            list = new LinkedList<>();
//            Statement sttm = con.createStatement();
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
//
//    public void Close(){
//        try {
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}



