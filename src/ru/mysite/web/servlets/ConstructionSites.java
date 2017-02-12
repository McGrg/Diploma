package ru.mysite.web.servlets;

public class ConstructionSites {
    private int conssiteId;
    private String conssiteCity;
    private String conssiteStreet;
    private String conssiteBilding;
    private String startDate;
    private String finishDate;
    private String manager;

    public int getConssiteId() {
        return conssiteId;
    }

    public void setConssiteId(int conssiteId) {
        this.conssiteId = conssiteId;
    }

    public String getConssiteCity() {
        return conssiteCity;
    }

    public void setConssiteCity(String conssiteCity) {
        this.conssiteCity = conssiteCity;
    }

    public String getConssiteStreet() {
        return conssiteStreet;
    }

    public void setConssiteStreet(String conssiteStreet) {
        this.conssiteStreet = conssiteStreet;
    }

    public String getConssiteBilding() {
        return conssiteBilding;
    }

    public void setConssiteBilding(String conssiteBilding) {
        this.conssiteBilding = conssiteBilding;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ID: " + this.getConssiteId() + " " +  this.getConssiteCity().toString() + " "
                + this.getConssiteStreet().toString() + " " + this.getConssiteBilding() + " "
                + this.getStartDate() + " " + this.getFinishDate() + " " + this.getManager();
    }
}

