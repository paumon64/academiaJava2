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
public class Employee {
    
    private int empID;
    private String name;
    private String ssn;
    private double salary;
    
    public Employee(){

}

    public void changeName(String newName){
        
        if (newName != null ){
        this.name = newName;
    }
    }
    public void riseSalary (double increase){
        
        if (increase >0 ){
            this.salary += increase;
        }
    }
    
    
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
