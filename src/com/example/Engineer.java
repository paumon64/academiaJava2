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
public class Engineer extends Employee{
    
    private String team;
    
    public Engineer(){
        super();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
        public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
        
    public void engineerMethod(){
           System.out.println("Method specific to Engineer class");
    }
}
    
   
