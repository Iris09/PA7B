/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.controller;

import com.classicmodels7b.dao.OfficesDaoImpl;
import com.classicmodels7b.model.OfficesModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iris
 */
public class OfficesController {
    
    OfficesDaoImpl officesDaImple = new OfficesDaoImpl();
    public String createOffice (String OfficeCode,String City,String phone,
            String addressline1, String addressline2,String state,String country,String postalcode,
            String territory){
        OfficesModel newOffice;
        newOffice = new OfficesModel(OfficeCode, City, phone, addressline1, addressline2, state, country, postalcode, territory);
        
        String ServerAnswer = officesDaImple.createOffice(newOffice);
        return ServerAnswer;
    }
   public void readOffices (JTable table){
       DefaultTableModel tableModel = new DefaultTableModel();
       tableModel.addColumn("OFFICE CODE");
       tableModel.addColumn("CITY");
       tableModel.addColumn("PHONE");
       tableModel.addColumn("ADDRESS LINE 1");
       tableModel.addColumn("ADDRESS LINE 2");
       tableModel.addColumn("STATE");
       tableModel.addColumn("COUNTRY");
       tableModel.addColumn("POSTAL CODE");
       tableModel.addColumn("TERRITORY");
       
       int numRegisters = officesDaImple.readOffices().size();
       Object []row = new Object [9];
       for (int i = 0; i < numRegisters; i++){
           row[0] = officesDaImple.readOffices().get(i).getOfficeCode();
           row[1] = officesDaImple.readOffices().get(i).getCity();
           row[2] = officesDaImple.readOffices().get(i).getPhone();
           row[3] = officesDaImple.readOffices().get(i).getAdressLine1();
           row[4] = officesDaImple.readOffices().get(i).getAdressLine2();
           row[5] = officesDaImple.readOffices().get(i).getState();
           row[6] = officesDaImple.readOffices().get(i).getCountry();
           row[7] = officesDaImple.readOffices().get(i).getPostalCode();
           row[8] = officesDaImple.readOffices().get(i).getTerritory();
           
           tableModel.addRow(row);
       }
       
       
    table.setModel(tableModel);   
   } 
}
