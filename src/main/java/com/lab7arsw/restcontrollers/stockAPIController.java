/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab7arsw.restcontrollers;

import com.lab7arsw.services.InfoServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import static org.springframework.http.RequestEntity.method;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author karen
 */
@RestController
@RequestMapping(value="/informacion")
public class stockAPIController {
    @Autowired
    InfoServices infoServices;
    
    @RequestMapping(method = RequestMethod.GET,value="/{accion}/{select}")
    
    public ResponseEntity<?> getOrders(@PathVariable("accion") String accion,@PathVariable("select") String select){
        try{
            return new ResponseEntity(infoServices.getInfo(accion,select),HttpStatus.ACCEPTED);            
        }catch(Exception ex){
            Logger.getLogger(stockAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
}
