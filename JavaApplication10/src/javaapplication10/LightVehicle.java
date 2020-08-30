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
public class LightVehicle extends Vehicle {
  
 private int Seats;
    
    
public LightVehicle(int p, int e, String m, String m1,int y, int o, int n)  {
    
 super (p,e,m,m1,y,o);   
    
 Seats = n;   
} 

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }
    
    
   public String toString()
   {
      return " "+super.toString() + "    /nNumber of Seats: " +
             Seats;
   } 
    
    
    
    
    
}
