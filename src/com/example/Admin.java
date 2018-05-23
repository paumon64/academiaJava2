/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author paumon64
 */
public class Admin extends Employee {
    
    private String service;
    
    public Admin(){
        super();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    
}
