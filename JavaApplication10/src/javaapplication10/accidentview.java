/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javaapplication10.VehicleRego.Accidents;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nathan
 */
public class accidentview extends JFrame implements ActionListener {

  private JLabel selectVehicleLabel;
  private JButton showAccidents;  
  private Panel Panel = new Panel();  
  private Panel topPanel = new Panel();
  private Panel lowerPanel = new Panel();
  private JComboBox Accidentscombo;
  ArrayList<Accident> Accidents1 = VehicleRego.Accidents;
  private TextArea display = new TextArea(null,8,80,1); //scrolleable text area
   
  public accidentview(String[] accidentviews) {
      
      
      
    selectVehicleLabel = new JLabel("Select Vehicle");
    showAccidents = new JButton ("Show Accidents");
    getContentPane().setBackground(new java.awt.Color(255, 218, 185));
    JComboBox Accidentscombo = new JComboBox(accidentviews);
  
     // set panel 
    Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); 
    topPanel.setLayout(new GridLayout(3, 1, 1, 1));
    lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    // add to panels
   topPanel.add(selectVehicleLabel);
   topPanel.add(Accidentscombo);
   topPanel.add(showAccidents);
   lowerPanel.add(display);
   display.setEditable(false);
   Panel.add(lowerPanel);
   Panel.add(topPanel);
   add(Panel);
   
   
   display.setText("----Accident ID-----Location-----Date-------------------Comments-------------------Vehicles-involved----\n");
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    showAccidents.addActionListener(event -> { 
        
        display.setText("Accident ID-----Location-----Date-------------------Comments-------------------Vehicles-involved----\n");
        
        for (int i = 0; i < VehicleRego.Accidents.size(); i++) 
         if (VehicleRego.Accidents.get(i).getVehicleList().contains(Accidentscombo.getSelectedItem().toString()))
             display.append(Accidents.get(i).toString());
     
        
    
    
    });
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
  }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
