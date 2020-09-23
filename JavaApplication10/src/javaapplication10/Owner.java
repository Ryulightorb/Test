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
public class Owner {
  
   private int id;
   private String Fname;
   private String Lname;
   private String Address;
   private int Ph;


public Owner(int i, String F,String L,String A,int P) {

id = i;
Fname = F;
Lname = L;
Address = A;
Ph = P;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPh() {
        return Ph;
    }

    public void setPh(int Ph) {
        this.Ph = Ph;
    }


public String toString() {           
return "ID:" + id + " \nFirst Name: " + Fname + " \nLast Name:" + Lname + " \nAddress: " + Address + " \nPhone Number:" + Ph ;
}

public String getall() {

return id + "\n" + Fname + "\n" + Lname + "\n" + Address + "\n" + Ph +"\n";

}










   
}
