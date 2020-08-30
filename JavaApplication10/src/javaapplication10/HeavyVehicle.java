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
public class HeavyVehicle extends Vehicle {
  
 private int LoadCapacity;
    
    
public HeavyVehicle(int p, int e, String m, String m1,int y, int o, int l)  {
    
 super (p,e,m,m1,y,o);   
    
 LoadCapacity = l;   
} 

    public int getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(int LoadCapacity) {
        this.LoadCapacity = LoadCapacity;
    }
    
    
   public String toString()
   {
      return " "+super.toString() + "    /nLoad Capacity: " +
             LoadCapacity +" Kg";
   } 
    
    
    
    
    
}
