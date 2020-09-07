/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Nathan
 */
public class Accident {
    int accidentID;
    String location;
    String date;
    String comments;
    String vehicleList;

    public Accident(int accidentID, String location, String date, String comments, String vehicleList) {
        this.accidentID = accidentID;
        this.location = location;
        this.date = date;
        this.comments = comments;
        this.vehicleList = vehicleList;
    }

    @Override
    public String toString() {
        return "Accident{" + "accidentID=" + accidentID + ", location=" + location + ", date=" + date + ", comments=" + comments + ", vehicleList=" + vehicleList + '}';
    }

    public int getAccidentID() {
        return accidentID;
    }

    public void setAccidentID(int accidentID) {
        this.accidentID = accidentID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(String vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    
    
}
