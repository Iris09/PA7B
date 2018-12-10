/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author Iris
 */
public interface OfficesDao {
    //recibe un objeto de tipo officemodel y crea una nueva oficina en la base de datos
  public String createOffice  (OfficesModel newOffice);
  //devuelve un listado de las oficinas 
  //almacenadas en la tabla offices
  public ArrayList<OfficesModel> readOffices();
  //Recibe un objeto de tipo officeModel y
  //actualiza una oficina
  public String updateOffice(OfficesModel auxOffice);
  // Borra una oficina de la base de datos
  //de acuerso a id recibido
  
  public String deleteOffice ();
}
