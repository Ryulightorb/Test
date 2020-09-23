/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package javaapplication10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nathan
 */
public class VehicleRego extends JFrame implements ActionListener {

    private int ID;
    private int ABN;
    private String Fname;
    private String Lname;
    private String Adress;
    private int Phone;
    private String DOB;
    private int SearchOwner;
    private int Ownerslist;
    private int Vehiclelist;
    private int SearchVehicle;
    private JLabel IDLabel, ABNLabel, DOBLabel, FnameLabel, LnameLabel, AddressLabel, PhLabel, privateLabel, corporateLabel;
    private JLabel plateLabel, loadLabel, seatLabel, engineLabel, makeLabel, modelLabel, yearLabel, ownerIDLabel, motorcycleLabel, lightLabel, heavyLabel;
    private JTextField IDField, ABNField, DOBField, FnameField, LnameField, AdressField, PhField;
    private JTextField plateField, loadField, seatField, engineField, makeField, modelField, yearField, ownerIDField;
    private JRadioButton privateRadio, corporateRadio, motorcycleRadio, lightRadio, heavyRadio;
    private TextArea displayArea;
    private JButton createOwner, createVehicle, searchOwner, editOwner, searchVehicle, editVehicle, clearButton, exitButton, accidentEntryButton, accidentViewButton;
    private ButtonGroup OwnerGroup, VehicleGroup;

    private Panel topPanel = new Panel();
    private Panel middlePanel = new Panel();
    private Panel lowermiddlePanel = new Panel();
    private Panel lowerPanel = new Panel(); // creates panels
    private Panel mainPanel = new Panel();
    private Panel fullmiddlePanel = new Panel();
    static ArrayList<Owner> Owners = new ArrayList<Owner>();
    ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
    static ArrayList<Accident> Accidents = new ArrayList<Accident>();
    

    public static Object getArray(){
    
     return Accidents.clone();
    
    
    }
    
    
    
    
    
    
    
    
    
    public VehicleRego() {
        super("Vehicle/License Registration system");  // set name
        // Instantiate components
        getContentPane().setBackground(new java.awt.Color(255, 218, 185));
        plateLabel = new JLabel("Plate Number");  
        loadLabel = new JLabel("Load Capacity");
        seatLabel = new JLabel("Seat number");
        engineLabel = new JLabel("Engine Capacity (cc) ");
        makeLabel = new JLabel("Make");
        modelLabel = new JLabel("Model");
        yearLabel = new JLabel("Year");
        ownerIDLabel = new JLabel("Owner ID");
        motorcycleLabel = new JLabel("Motorcycle");
        lightLabel = new JLabel("Light Vehicle");
        heavyLabel = new JLabel("Heavy Vehicle");
        IDLabel = new JLabel("ID number");
        ABNLabel = new JLabel("Australian Buisness Number");
        DOBLabel = new JLabel("Date of Birth");
        FnameLabel = new JLabel("First Name");
        LnameLabel = new JLabel("Last Name");
        AddressLabel = new JLabel("Address");
        PhLabel = new JLabel("Phone Number");
        privateLabel = new JLabel("Private");
        corporateLabel = new JLabel("Corporate");

        IDField = new JTextField(15);  // create fields
        ABNField = new JTextField(15);
        DOBField = new JTextField(15);
        FnameField = new JTextField(15);
        LnameField = new JTextField(15);
        AdressField = new JTextField(15);
        PhField = new JTextField(15);
        plateField = new JTextField(6);
        loadField = new JTextField(15);
        seatField = new JTextField(15);
        engineField = new JTextField(15);
        makeField = new JTextField(15);
        modelField = new JTextField(15);
        yearField = new JTextField(15);
        ownerIDField = new JTextField(15);

        displayArea = new TextArea(null, 4, 100, 1);   // create displayare

        createOwner = new JButton("Create Owner");      // create buttons
        createVehicle = new JButton("Create Vehicle");
        searchOwner = new JButton("Search Owner");
        editVehicle = new JButton("Edit Vehicle");
        editOwner = new JButton("Edit Owner");
        searchVehicle = new JButton("Search Vehicle");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        accidentEntryButton = new JButton("Add Accident");
        accidentViewButton = new JButton("View Accidents");

        privateRadio = new JRadioButton("Private", true);
        privateRadio.setOpaque(false);
        corporateRadio = new JRadioButton("Corporate", false);
        corporateRadio.setOpaque(false);
        motorcycleRadio = new JRadioButton("Motorcycle", false);
        motorcycleRadio.setOpaque(false);
        lightRadio = new JRadioButton("Light Vehicle", true);
        lightRadio.setOpaque(false);
        heavyRadio = new JRadioButton("Heavy Vehicle", false);
        heavyRadio.setOpaque(false);              /// create radio buttons

        // Group Radios
        OwnerGroup = new ButtonGroup();
        VehicleGroup = new ButtonGroup();
        OwnerGroup.add(privateRadio);
        OwnerGroup.add(corporateRadio);
        VehicleGroup.add(motorcycleRadio);
        VehicleGroup.add(lightRadio);
        VehicleGroup.add(heavyRadio);

        //set background
        //add to panels top
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        topPanel.add(displayArea);
        displayArea.setEditable(false);

        //middle panel
        fullmiddlePanel.setLayout(new FlowLayout(10, 10, 10));
        middlePanel.setLayout(new GridLayout(3, 1, 1, 1));

        middlePanel.add(IDLabel);
        middlePanel.add(ABNLabel);
        middlePanel.add(DOBLabel);
        middlePanel.add(FnameLabel);
        middlePanel.add(LnameLabel);
        middlePanel.add(AddressLabel);
        middlePanel.add(PhLabel);
        middlePanel.add(IDField);
        middlePanel.add(ABNField);
        middlePanel.add(DOBField);
        middlePanel.add(FnameField);
        middlePanel.add(LnameField);
        middlePanel.add(AdressField);
        middlePanel.add(PhField);
        middlePanel.add(privateRadio);
        middlePanel.add(corporateRadio);
        middlePanel.add(createOwner);
        middlePanel.add(searchOwner);
        middlePanel.add(editOwner);

        //lower middle panel
        lowermiddlePanel.setLayout(new GridLayout(3, 1, 1, 1));
        lowermiddlePanel.add(plateLabel);
        lowermiddlePanel.add(loadLabel);
        lowermiddlePanel.add(seatLabel);
        lowermiddlePanel.add(engineLabel);
        lowermiddlePanel.add(makeLabel);
        lowermiddlePanel.add(modelLabel);
        lowermiddlePanel.add(yearLabel);
        lowermiddlePanel.add(ownerIDLabel);
        lowermiddlePanel.add(plateField);
        lowermiddlePanel.add(loadField);
        lowermiddlePanel.add(seatField);
        lowermiddlePanel.add(engineField);
        lowermiddlePanel.add(makeField);
        lowermiddlePanel.add(modelField);
        lowermiddlePanel.add(yearField);

        lowermiddlePanel.add(ownerIDField);
        lowermiddlePanel.add(motorcycleRadio);
        lowermiddlePanel.add(lightRadio);
        lowermiddlePanel.add(heavyRadio);
        lowermiddlePanel.add(createVehicle);
        lowermiddlePanel.add(searchVehicle);
        lowermiddlePanel.add(editVehicle);

        // lower panel
        lowerPanel.setLayout(new GridLayout(3, 1, 1, 1));
        lowerPanel.add(accidentEntryButton);
        lowerPanel.add(accidentViewButton);
        lowerPanel.add(clearButton);
        lowerPanel.add(exitButton);

        // add layout
        fullmiddlePanel.add(middlePanel, BorderLayout.SOUTH);
        fullmiddlePanel.add(lowermiddlePanel, BorderLayout.NORTH);
        add(topPanel, BorderLayout.NORTH);
        add(fullmiddlePanel, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);
        pack();
        // create owner button
        createOwner.addActionListener(event -> {

            if (privateRadio.isSelected()) {
                try {
                    int ID = Integer.parseInt(IDField.getText());
                    String DOB = DOBField.getText();
                    String Fname = FnameField.getText();
                    String Lname = LnameField.getText();
                    String Adress = AdressField.getText();
                    int Phone = Integer.parseInt(PhField.getText());
                    displayArea.setText("Owner Added");
                    Owners.add(new privateOwner(ID, Fname, Lname, Adress, Phone, DOB,ABN));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
            if (corporateRadio.isSelected()) {
                try {
                    int ID = Integer.parseInt(IDField.getText());
                    int ABN = Integer.parseInt(ABNField.getText());
                    String Fname = FnameField.getText();
                    String Lname = LnameField.getText();
                    String Adress = AdressField.getText();
                    int Phone = Integer.parseInt(PhField.getText());
                    displayArea.setText("Owner Added");
                    Owners.add(new corporateOwner(ID, Fname, Lname, Adress, Phone,DOB, ABN));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }

        });
        // create vehicle button
        createVehicle.addActionListener(event -> {

            if (motorcycleRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    displayArea.setText("Vehicle Added");
                    Vehicles.add(new Motorcycle(plateNo, engineCapacity, make, model, year, ownerID));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
            if (lightRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    int seatNo = Integer.parseInt(seatField.getText());
                    displayArea.setText("Vehicle Added");
                    Vehicles.add(new LightVehicle(plateNo, engineCapacity, make, model, year, ownerID, seatNo));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }

            if (heavyRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    int load = Integer.parseInt(loadField.getText());
                    displayArea.setText("Vehicle Added");
                    Vehicles.add(new HeavyVehicle(plateNo, engineCapacity, make, model, year, ownerID, load));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }

        });
         // search for owner button
        searchOwner.addActionListener(event -> {

            {
                int mySearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter The owners ID"));
                Ownerslist = Owners.size();
                for (Owner o : Owners) {

                    if (o.getId() == (mySearch)) {
                        displayArea.setText("Found it");
                        JOptionPane.showMessageDialog(null, "Found it!");
                        displayArea.setText(o.toString());
                        int IndexNo = Owners.indexOf(o);
                        displayArea.append("\nHere is your index Number for editing purposes " + IndexNo);
                        break;

                    } else {
                        displayArea.setText("Nothing Found");
                    }

                }
            }
        });
        //search for vehicle button
        searchVehicle.addActionListener(event -> {

            {
                String mySearch1 = JOptionPane.showInputDialog(null, "Please enter The Plate Number");
                Vehiclelist = Vehicles.size();
                for (Vehicle v : Vehicles) {

                    if (v.getPlateNumber() == (mySearch1)) {
                        displayArea.setText("Found it");
                        JOptionPane.showMessageDialog(null, "Found it!");
                        displayArea.setText(v.toString());
                        int IndexNo = Owners.indexOf(v);
                        displayArea.append("\nHere is your index Number for editing purposes " + IndexNo);
                        break;

                    } else {
                        displayArea.setText("Nothing Found");
                    }

                }
            }
        });
        // allows editing of the owner
        editOwner.addActionListener(event -> {
            int editInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter The Index you wish to edit"));
            if (privateRadio.isSelected()) {
                try {
                    ID = Integer.parseInt(IDField.getText());
                    DOB = DOBField.getText();
                    Fname = FnameField.getText();
                    Lname = LnameField.getText();
                    Adress = AdressField.getText();
                    Phone = Integer.parseInt(PhField.getText());
                    displayArea.setText("Index Edited");
                    Owners.remove(editInt);
                    Owners.add(editInt, new privateOwner(ID, Fname, Lname, Adress, Phone, DOB,ABN));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
            if (corporateRadio.isSelected()) {
                try {
                    ID = Integer.parseInt(IDField.getText());
                    ABN = Integer.parseInt(ABNField.getText());
                    Fname = FnameField.getText();
                    Lname = LnameField.getText();
                    Adress = AdressField.getText();
                    Phone = Integer.parseInt(PhField.getText());
                    displayArea.setText("Index Edited");
                    Owners.remove(editInt);
                    Owners.add(editInt, new corporateOwner(ID, Fname, Lname, Adress, Phone,DOB, ABN));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
        });
        // allows the editing of vehicles
        editVehicle.addActionListener(event -> {
            int editInt1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter The Index you wish to edit"));
            if (motorcycleRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    displayArea.setText("Index Edited");
                    Vehicles.remove(editInt1);
                    Vehicles.add(editInt1, new Motorcycle(plateNo, engineCapacity, make, model, year, ownerID));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
            if (lightRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    int seatNo = Integer.parseInt(seatField.getText());
                    displayArea.setText("Index Edited");
                    Vehicles.remove(editInt1);
                    Vehicles.add(editInt1, new LightVehicle(plateNo, engineCapacity, make, model, year, ownerID, seatNo));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }

            if (heavyRadio.isSelected()) {
                try {
                    String plateNo = plateField.getText();
                    int engineCapacity = Integer.parseInt(engineField.getText());
                    String make = makeField.getText();
                    String model = modelField.getText();
                    int year = Integer.parseInt(yearField.getText());
                    int ownerID = Integer.parseInt(ownerIDField.getText());
                    int load = Integer.parseInt(loadField.getText());
                    displayArea.setText("Index Edited");
                    Vehicles.remove(editInt1);
                    Vehicles.add(editInt1, new HeavyVehicle(plateNo, engineCapacity, make, model, year, ownerID, load));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please insert the right formatting\n" + ex);
                }

            }
        });
        // clears the display
        clearButton.addActionListener(event -> {
            displayArea.setText("");
        });
        // exit
        exitButton.addActionListener(event -> {
            
 
         for(int i = 0;i < Owners.size(); i++){
          String outputText = Owners.get(i).getall();
          
             try {
                 saveTofile("Owners.txt", outputText,false);
             } catch (IOException ex) {
                 Logger.getLogger(VehicleRego.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
            
            
            
            
            System.exit(0);
        });
         // brings up entry  for accidents 
        accidentEntryButton.addActionListener(event -> {
            
        String[] Plates = new String[Vehicles.size()];    
        for (int i = 0; i < Vehicles.size(); i++) {
               
        Plates[i] = String.valueOf(Vehicles.get(i).getPlateNumber()); 
         
        }
        
        accidentCreate create = new accidentCreate(Plates);
        create.setVisible(true);
        create.setSize(700, 185);
        
        
        });
    
        
        accidentViewButton.addActionListener(event -> {
        
                String[] accidentviews = new String[Vehicles.size()];    
        for (int i = 0; i < Vehicles.size(); i++) {
               
        accidentviews[i] = String.valueOf(Vehicles.get(i).getPlateNumber()); 
        }
        accidentview view = new accidentview(accidentviews);
        view.setVisible(true);
        view.setSize(700, 185);
        
        
        });
        
    }   // allows the main class to collect accidents.
      public static void addAccident(int accidentID, String location, String date, String comments, String vehicleList){
      Accidents.add(new Accident(accidentID,location,date,comments,vehicleList));
      
      }
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        VehicleRego myApp = new VehicleRego();
        myApp.setVisible(true);
        myApp.setSize(1400, 465);
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
	      
       int count=0;
		String inLine;

		FileReader reader=new FileReader("owners.txt");

		Scanner fileIn=new Scanner(reader);

		while(fileIn.hasNextLine())
		{
			String line=fileIn.nextLine();// read a line
			count++;
			Scanner lineIn=new Scanner(line);//another Scanner to deal a line
                        lineIn.useDelimiter(",");
			while(lineIn.hasNext())
			{
				int id= lineIn.nextInt();  
				String Fname=lineIn.next(); 
                                String Lname=lineIn.next(); 
                                String Address=lineIn.next(); 
                                int ph=lineIn.nextInt();
                                String DOB =lineIn.next();
                                int ABN =lineIn.nextInt();

				System.out.println(id+"  "+Fname+""+Lname+"  "+Address+"  "+ph+"  "+ DOB+"  "+ ABN);
                                if(ABN > 0){
                                Owners.add(new corporateOwner(id, Fname, Lname, Address, ph, DOB,ABN));
                               } else 
                                Owners.add(new privateOwner(id, Fname, Lname, Address, ph, DOB,ABN));
		    }

	    }

	    System.out.println("Total number of book entries: "+count);

		reader.close();
    


	

		
                                
                              //  
                                
                               // idinsert = parseInt(String id);
                               // 
		    

	    }

	   

		
        
        
        
        
      @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
        
        
       
     public static void saveTofile(String Filename, String text, boolean append) throws IOException {
  
  File file1 = new File(Filename);
  // creats the file
  
  
  // creates the file writer
  FileWriter fw = new FileWriter(file1, append);
  
  
  // create printer
  
  PrintWriter pw = new PrintWriter(fw);
  
  pw.println(text);
  pw.close();
  
  
  
  }           
                
    public void createPrivateOwners( int idfinal,String Fname,String Lname,String Address,int ph,String DOB, int ABNfinal){
    
    Owners.add(new privateOwner(idfinal, Fname, Lname, Address, ph, DOB,ABNfinal));
    } 
}
    
    
    

    
   

    
    
    
  
    
    
    
    
    
    
    
    
    

