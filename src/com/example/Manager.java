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

    public Manager (int empId, String name, String ssn, double salary, String depName){
        super(empId, name, ssn, salary);
        this.depName = depName;
    } 
    
    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    
<<<<<<< HEAD
    @Override
    public String getDetails(){
        
        return super.getDetails()+" Departamento = "+depName;
=======
        @Override
    
    public void printEmployee(){
        
        super.printEmployee();
        System.out.println("Departamento "+depName);
        
>>>>>>> f2b9d453168e477cf2270e9bdfa80c8cb4dab032
    }
}
