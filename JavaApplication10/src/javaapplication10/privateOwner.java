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
public class privateOwner extends Owner {
 private String DOB;   
  private int ABN;  
 
 
 
public privateOwner(int i, String F,String L,String A,int P,String D, int AB) {
        super(i,F,L,A,P);
 DOB = D;
 ABN = AB;
}

    public int getABN() {
        return ABN;
    }

    public void setABN(int ABN) {
        this.ABN = ABN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
 
    public String toString()
   {
      return " "+super.toString() + "    \nDate of Birth: " +
             DOB;
   } 
 
    
   public String getall(){
   
   return super.getall() + DOB + ","+ ABN+ ",";
   
   
   } 
    
    
    
    
    
    
    
    
}
