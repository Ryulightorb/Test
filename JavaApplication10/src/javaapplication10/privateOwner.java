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
 
 
 
 
public privateOwner(int i, String F,String L,String A,int P,String D) {
        super(i,F,L,A,P);
 DOB = D;
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
 
}
