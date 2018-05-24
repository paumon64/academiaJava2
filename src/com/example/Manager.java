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

public class Manager extends Employee {
    
    private String depName;
    
    public Manager(){
        super();
        
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    
        @Override
    
    public void printEmployee(){
        
        super.printEmployee();
        System.out.println("Departamento "+depName);
        
    }
}
