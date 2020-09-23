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
public class corporateOwner extends Owner {
 private int ABN;   
  private String DOB;
 
 
 
public corporateOwner(int i, String F,String L,String A,int P,String D, int AB) {
        super(i,F,L,A,P);
 ABN = AB;
 DOB = D;
}

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getABN() {
        return ABN;
    }

    public void setABN(int ABN) {
        this.ABN = ABN;
    }
   public String toString()
   {
      return " "+super.toString() + "    \nAustralian Buisness Number: " +
             ABN;
   } 
 
   public String getall(){
   
   return super.getall() + DOB + "\n"+ ABN+ "\n";
   
   
   }
   
}
