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
public class Director extends Manager{
    
    private String region;
    
    public Director (){
        super();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    @Override
    
    public void printEmployee(){
        
        super.printEmployee();
        System.out.println("Departamento "+region);
        
    }

    
}
