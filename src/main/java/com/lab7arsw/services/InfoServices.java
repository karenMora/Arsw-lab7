/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab7arsw.services;

/**
 *
 * @author karen
 */
public interface InfoServices {

    public Object getInfo(String accion, String select) throws InfoServicesException;
    
}
