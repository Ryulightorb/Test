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
private String Plate;
private Panel Panel = new Panel();
private JLabel idLabel,locationLabel,dateLabel,commentsLabel,selectVehicleLabel,vehicleListLabel;
private JTextField idField,locationField,dateField,commentsField;
private TextArea listArea;
private JButton addVehicleButton , addAccident ,exitbutton;
private JComboBox vehicleCB; 
private TextArea display = new TextArea(null,2,40,1);
ArrayList<Vehicle> Vehicles = new ArrayList<>();    



 public accidentCreate(String[] Plates) {
 super("Vehicle/License Registration system - Accident Create");  // set name     
     
     
 // instantiate Labels and buttons etc
 getContentPane().setBackground(new java.awt.Color(255, 218, 185));
 idLabel = new JLabel("Accident ID:");
 locationLabel = new JLabel("Location:");
 dateLabel = new JLabel("Date:");
 commentsLabel = new JLabel(" Comments:");
 selectVehicleLabel = new JLabel(" Select Vehicles:");
 vehicleListLabel = new JLabel("Vehicles List");
 addVehicleButton = new JButton("Add Vehicle");
 addAccident = new JButton("addAccident");
 exitbutton = new JButton ("exit");
 
 
 idField = new JTextField(10);
 locationField = new JTextField(20);
 dateField = new JTextField(10);
 commentsField = new JTextField(50);
 JComboBox vehicleCB = new JComboBox(Plates);
 // set panel 
 Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
 
 // add to panels
 display.setEditable(false);
 Panel.add(idLabel);
 Panel.add(idField);
 Panel.add(locationLabel);
 Panel.add(locationField);
 Panel.add(dateLabel);
 Panel.add(dateField);
 Panel.add(commentsLabel);
 Panel.add(commentsField);
 Panel.add(selectVehicleLabel);
 Panel.add (vehicleCB);
 Panel.add(display);
 Panel.add(addVehicleButton);
 Panel.add(addAccident);
 Panel.add(exitbutton);
 add(Panel);
 
 
 
 
 
 // vehicle button
 addVehicleButton.addActionListener(event -> { 
    String Vehicle = vehicleCB.getSelectedItem().toString();
    display.append( Vehicle +  " , " );
    
 
 
 });
 
 // add accident button
 addAccident.addActionListener(event -> {
    try{
    int accidentID = Integer.parseInt(idField.getText()); 
    String location = locationField.getText();
    String date = dateField.getText();
    String comments = commentsField.getText();
    String vehicleList = display.getText();
    VehicleRego Rego = new VehicleRego();
    Rego.addAccident(accidentID,location,date,comments,vehicleList); 
    idField.setText("");
    locationField.setText("");
    dateField.setText("");
    commentsField.setText("");
    display.setText("");
    JOptionPane.showMessageDialog(null,"Accident Filed Succesfully"); 
    } catch(Exception e) {  JOptionPane.showMessageDialog(null, "Please insert the right information Numbers only for Accident ID\n" + e);       }
         
 });
 // the exit button duh
 exitbutton.addActionListener(event -> {
 super.dispose();
 
 });   
    
 
 }   
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
