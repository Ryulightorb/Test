/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JLabel;

/**
 *
 * @author Nathan
 */
public class accidentCreate extends JFrame implements ActionListener {
private VehicleRego Rego;
private Panel Panel = new Panel();
private JLabel idLabel,locationLabel,dateLabel,commentsLabel,selectVehicleLabel,vehicleListLabel;
private JTextField idField,locationField,dateField,commentsField;
private TextArea listArea;
private JButton addVehicleButton;
private JComboBox vehicleCB; 
ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();    

 public accidentCreate() {
     
 //set up arrays and Combo box
 Rego = new VehicleRego();
 this.Vehicles = Rego.getVehicles();
 // instantiate Labels and buttons etc
 getContentPane().setBackground(new java.awt.Color(255, 218, 185));
 idLabel = new JLabel("Accident ID:");
 locationLabel = new JLabel("Location:");
 dateLabel = new JLabel("Date:");
 commentsLabel = new JLabel(" Comments:");
 selectVehicleLabel = new JLabel(" Select Vehicles:");
 vehicleListLabel = new JLabel("Vehicles List");
 
 idField = new JTextField(10);
 locationField = new JTextField(20);
 dateField = new JTextField(10);
 commentsField = new JTextField(50);
 JComboBox vehicleCB = new JComboBox();
 // set panel 
 Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
 
 // add to panels
 
 Panel.add(idLabel);
 Panel.add(idField);
 Panel.add(locationLabel);
 Panel.add(locationField);
 Panel.add(dateLabel);
 Panel.add(dateField);
 Panel.add(commentsLabel);
 Panel.add(commentsField);
 Panel.add (vehicleCB);
 
 add(Panel);
 
 
 
 
 }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
