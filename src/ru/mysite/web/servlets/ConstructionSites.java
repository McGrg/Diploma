package ru.mysite.web.servlets;

/**
 * Created by MSI GT70 on 12.02.2017.
 */
public class ConstructionSites {
    private static int conssiteId;
    private static String conssiteCity;
    private static String conssiteStreet;
    private static String conssiteBilding;
    private static String startDate;
    private static String finishDate;
    private static String manager;

    public static int getConssiteId() {
        return conssiteId;
    }

    public static void setConssiteId(int conssiteId) {
        ConstructionSites.conssiteId = conssiteId;
    }

    public static String getConssiteCity() {
        return conssiteCity;
    }

    public static void setConssiteCity(String conssiteCity) {
        ConstructionSites.conssiteCity = conssiteCity;
    }

    public static String getConssiteStreet() {
        return conssiteStreet;
    }

    public static void setConssiteStreet(String conssiteStreet) {
        ConstructionSites.conssiteStreet = conssiteStreet;
    }

    public static String getConssiteBilding() {
        return conssiteBilding;
    }

    public static void setConssiteBilding(String conssiteBilding) {
        ConstructionSites.conssiteBilding = conssiteBilding;
    }

    public static String getStartDate() {
        return startDate;
    }

    public static void setStartDate(String startDate) {
        ConstructionSites.startDate = startDate;
    }

    public static String getFinishDate() {
        return finishDate;
    }

    public static void setFinishDate(String finishDate) {
        ConstructionSites.finishDate = finishDate;
    }

    public static String getManager() {
        return manager;
    }

    public static void setManager(String manager) {
        ConstructionSites.manager = manager;
    }
}

