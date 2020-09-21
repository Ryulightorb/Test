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
public class Vehicle {
 
  private String plateNumber;
  private int EngineCapacity;
  private String Make;
  private String Model;
  private int Year;
  private int OwnerID;
    
    
    public Vehicle(String p, int e, String m, String m1,int y, int o)  {
    
    plateNumber = p ;
    EngineCapacity = e ;
    Make = m ;
    Model = m1 ;
    Year = y ;
    OwnerID = o;
        
        
        
    }


    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setEngineCapacity(int EngineCapacity) {
        this.EngineCapacity = EngineCapacity;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    
      public String toString() {           
      return "Plate Number:" + plateNumber + " \nEngine Capacity" + EngineCapacity + " \nMake:" + Make + " \nModel: " + Model + " \nYear:" + Year + " \nOwners ID: " + OwnerID ;
     
      
      
  }
 public String getString() {
          return plateNumber; 
                  };           
}
