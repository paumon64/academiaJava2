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
   public Director(int empId, String name, String ssn, double salary, String depName, String region) {
        super(empId, name, ssn, salary, depName);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
//     @Override
//    public String getDetails() {
//        return super.getDetails() +"\n"+ " Regiao = " +region;
//        } 
     
    @Override
    
    public void printEmployee(){
        
        super.printEmployee();
        System.out.println("Region  "+region);
        
    }

    
}
