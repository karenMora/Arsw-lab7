/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab7arsw.services;

import com.lab7arsw.connection.HttpConnection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author karen
 */
@Service
public class InfoServicesStub implements InfoServices{
    @Autowired
    HttpConnection conexion;
    
    @Override
    public String getInfo(String accion, String select) throws InfoServicesException {
        /*
        conexion.connect(accion, select);
        try {
            conexion.run();
            return conexion.getResult();
        } catch (Exception ex) {
            Logger.getLogger(InfoServicesStub.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion.getResult();
        */
        return "hola";
    }
}